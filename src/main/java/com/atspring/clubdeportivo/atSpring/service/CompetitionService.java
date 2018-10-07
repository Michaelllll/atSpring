package com.atspring.clubdeportivo.atSpring.service;

import java.util.Optional;

import com.atspring.clubdeportivo.atSpring.model.Competition;

public interface CompetitionService {

	/**
	 * Crea una nueva competición.
	 * @param competition la competición a dar de alta.
	 * @return la competición creada.
	 */
	Competition create(Competition competition);
	
	/**
	 * Buscar una competición.
	 * @param idCompetition identificador de la competición.
	 * @return la competición encontrada o en su defecto un optional vacio.
	 */
	Optional<Competition> findById (Integer idCompetition);
}
