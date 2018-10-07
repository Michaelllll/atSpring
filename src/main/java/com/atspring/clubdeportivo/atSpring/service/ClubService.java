package com.atspring.clubdeportivo.atSpring.service;

import com.atspring.clubdeportivo.atSpring.model.Club;

public interface ClubService {

	/**
	 * Da de alta un nuevo club.
	 * @param club
	 * @return el nuevo club.
	 */
	Club create(Club club);
	
	/**
	 * Asocia un corredor con el club.
	 * @param idClub indentificador del club.
	 * @param idRunner identificador del corredor.
	 */
	void addRunner(Integer idClub, Integer idRunner);
	
	/**
	 * Busca un club.
	 * @param idClub identificador del club.
	 * @return el club o en su defecto un optional vacío.
	 */
	Club findById(Integer idClub);

}
