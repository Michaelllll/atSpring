package com.atspring.clubdeportivo.atSpring.service;

import com.atspring.clubdeportivo.atSpring.model.Club;

public interface ClubService {

	Club create(Club club);
	void addRunner(Integer idClub, Integer idRunner);
	Club findById(Integer idClub);

}
