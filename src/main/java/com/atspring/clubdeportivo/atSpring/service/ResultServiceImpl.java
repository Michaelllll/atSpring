package com.atspring.clubdeportivo.atSpring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atspring.clubdeportivo.atSpring.dao.ResultDAO;
import com.atspring.clubdeportivo.atSpring.model.Result;

@Service
public class ResultServiceImpl implements ResultService{

	@Autowired
	private ResultDAO dao;
	
	@Autowired
	private RunnerService runnerService; 
	
	@Autowired
	private CompetitionService competitionService; 
	
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

}
