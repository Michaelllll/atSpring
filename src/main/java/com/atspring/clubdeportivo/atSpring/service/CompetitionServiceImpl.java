package com.atspring.clubdeportivo.atSpring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atspring.clubdeportivo.atSpring.dao.CompetitionDAO;
import com.atspring.clubdeportivo.atSpring.model.Competition;

@Service
public class CompetitionServiceImpl implements CompetitionService {

	@Autowired
	private CompetitionDAO dao;

	public Competition create(Competition competition) {
		return dao.save(competition);
	}
	
	public Optional<Competition> findById (Integer idCompetition)
	{
		return dao.findById(idCompetition);
	}

}
