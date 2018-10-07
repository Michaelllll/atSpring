package com.atspring.clubdeportivo.atSpring.service;

import java.util.List;

import com.atspring.clubdeportivo.atSpring.dto.ScoreDTO;

public interface ScoreService {
	
	List<ScoreDTO> findAll(Integer idCompetition);
}
