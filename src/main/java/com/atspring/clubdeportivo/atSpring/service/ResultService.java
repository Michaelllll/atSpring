package com.atspring.clubdeportivo.atSpring.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.atspring.clubdeportivo.atSpring.dto.ResultDTO;
import com.atspring.clubdeportivo.atSpring.dto.ScoreDTO;
import com.atspring.clubdeportivo.atSpring.model.Result;

public interface ResultService {

	Result create(Result result, Integer idRunner, Integer idCompetition);

	Optional<Result> findById(Integer idResult);

	List<Result> findAll();
	
	List<ScoreDTO> getScores(Integer idCompetition);
	
	List<ResultDTO> getResults(Integer idCompetition);
	
	void writeToFile(Integer idCompetition) throws IOException;
}
