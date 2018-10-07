package com.atspring.clubdeportivo.atSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atspring.clubdeportivo.atSpring.dao.ScoreDAO;
import com.atspring.clubdeportivo.atSpring.dto.ScoreDTO;

@Service
public class ScoreServiceImpl implements ScoreService {

	@Autowired
	private ScoreDAO dao;

	public List<ScoreDTO> findAll(Integer idCompetition) {
		System.out.println("IDCOMPETITION en findAll: "+idCompetition);
		List<ScoreDTO> scores = dao.findAllScores(idCompetition);
		for(ScoreDTO score : scores)
		{
			System.out.println("Putuacion: "+score.getPoints()+" Posicion: "+score.getPosition());
		}
		return scores;
	}

}
