package com.atspring.clubdeportivo.atSpring.service;

import java.util.Optional;

import com.atspring.clubdeportivo.atSpring.model.Competition;

public interface CompetitionService {

	Competition create(Competition competition);
	Optional<Competition> findById (Integer idCompetition);
}
