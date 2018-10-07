package com.atspring.clubdeportivo.atSpring.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atspring.clubdeportivo.atSpring.dao.ResultDAO;
import com.atspring.clubdeportivo.atSpring.dto.ResultDTO;
import com.atspring.clubdeportivo.atSpring.dto.ScoreDTO;
import com.atspring.clubdeportivo.atSpring.model.Result;

@Service
public class ResultServiceImpl implements ResultService {

	@Autowired
	private ResultDAO dao;

	@Autowired
	private RunnerService runnerService;

	@Autowired
	private CompetitionService competitionService;

	@Autowired
	private ScoreService scoreService;
	
	@Autowired
	private ClubService clubService;

	public Result create(Result result, Integer idRunner, Integer idCompetition) {
		result.setRunner(runnerService.findById(idRunner).get());
		result.setCompetition(competitionService.findById(idCompetition).get());
		dao.save(result);
		runnerService.findById(idRunner).get().setResult(result);
		competitionService.findById(idCompetition).get().setResult(result);
		return result;
	}

	public Optional<Result> findById(Integer idResult) {
		return dao.findById(idResult);
	}

	public List<Result> findAll() {
		return dao.findAll();
	}

	public List<ScoreDTO> getScores(Integer idCompetition) {
		return scoreService.findAll(idCompetition);
	}

	public List<ResultDTO> getResults(Integer idCompetition) {
		List<ResultDTO> results =  dao.getResults(idCompetition);
		return results;
	}

	public void writeToFile(Integer idCompetition) throws IOException {
		List<ResultDTO> results = this.getResults(idCompetition);
		List<ScoreDTO> scores = this.getScores(idCompetition);
		Map<Integer, Long> clubYPuntos = new HashMap<Integer,Long>();
		
		for(ResultDTO result: results)
		{
			if(!scores.isEmpty())
			{
				System.out.println("El club "+result.getClub().getIdClub()+ " ha obtenido "+scores.get(0).getPoints()+" puntos gracias al corredor"+result.getIdRunner());
				Long existeEntrada = clubYPuntos.get(result.getClub().getIdClub());
				
				if(existeEntrada == null)
					clubYPuntos.put(result.getClub().getIdClub(), scores.get(0).getPoints());
				else
					clubYPuntos.put(result.getClub().getIdClub(), clubYPuntos.get(result.getClub().getIdClub()).longValue() + scores.get(0).getPoints());
				
				scores.remove(0);
			}
		}
		
		List<Entry<Integer, Long>> sorted =
				clubYPuntos.entrySet().stream()
						 .sorted(Map.Entry.comparingByValue())
						 .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
						 .collect(Collectors.toList());
		 
		 FileWriter fw = new FileWriter("clasificacion.txt",true);
		 BufferedWriter bw = new BufferedWriter(fw);
		 
		 try{
			 bw.write("CLUB:   PUNTOS:");
			 bw.newLine();
			 bw.write("-----------------");
			 bw.newLine();
			 
			 for(Entry<Integer, Long> conjunto :sorted)
			 {
			 		bw.write(clubService.findById(conjunto.getKey()).getName()+"  -> "+conjunto.getValue());
			 		bw.newLine();
			 }
			 
			 bw.write("-----------------");
		 }catch(IOException ioe){
		     System.err.println("IOException: " + ioe.getMessage());
		 }
		 finally { 
			 bw.close();
		 }
	}


	public List<ResultDTO> getResultsByAge(Integer idCompetition) {
		
		String currentYear = new SimpleDateFormat("yyyy").format(new Date());
		String master20End = String.valueOf((Integer.parseInt(currentYear) - 20)); 
		String master20Start = String.valueOf((Integer.parseInt(currentYear) - 30));
		String master30End = String.valueOf((Integer.parseInt(currentYear) - 31));
		String master30Start = String.valueOf((Integer.parseInt(currentYear) - 40));
		String master40 = String.valueOf((Integer.parseInt(currentYear) - 41));
		
		//Entre 20 y 30 años
		List<ResultDTO> resultsMaster20 =  dao.getResultsByAge(idCompetition, master20Start, master20End);
		
		//Entre 30 y 40 años
		List<ResultDTO> resultsMaster30 =  dao.getResultsByAge(idCompetition, master30Start, master30End);
		
		//Más de 40 anos
		List<ResultDTO> resultsMaster40 = dao.getResultsByAgeGreaterThan(idCompetition, master40);
		System.out.println("PUNTUACIONES POR CATEGORIA");
		System.out.println("--------------Entre 20 y 30 anos--------------");
		showByCategories(resultsMaster20, idCompetition);
		System.out.println("--------------Entre 30 y 40 anos--------------");
		showByCategories(resultsMaster30, idCompetition);
		System.out.println("--------------Mas de 40 anos--------------");
		showByCategories(resultsMaster40, idCompetition);
		
		return resultsMaster20;
	}
	
	public void showByCategories(List<ResultDTO> results, Integer idCompetition)
	{
		List<ScoreDTO> scores = this.getScores(idCompetition);
		
		for(ResultDTO result : results)
		{
			if(!scores.isEmpty())
			{
				System.out.println("+Puntuacion: "+scores.get(0).getPoints()+" Nombre: "+result.getNameRunner()+" ANacimiento: "+result.getYearRunner()+" Segundos: "+result.getSeconds());
				scores.remove(0);
			}
			else
				System.out.println("+Puntuacion: - Nombre: "+result.getNameRunner()+" ANacimiento: "+result.getYearRunner()+" Segundos: "+result.getSeconds());
			
		}
	}
}
