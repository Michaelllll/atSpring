package com.atspring.clubdeportivo.atSpring.service;

import java.util.List;

import com.atspring.clubdeportivo.atSpring.dto.ScoreDTO;

public interface ScoreService {
	
	/**
	 * Obtiene la puntuación que corresponde a una competición dada
	 * @param idCompetition identificador de la competición
	 * @return lista de puntuaciones
	 */
	List<ScoreDTO> findAll(Integer idCompetition);
}
