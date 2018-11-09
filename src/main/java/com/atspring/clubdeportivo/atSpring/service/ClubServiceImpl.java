package com.atspring.clubdeportivo.atSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atspring.clubdeportivo.atSpring.dao.ClubDAO;
import com.atspring.clubdeportivo.atSpring.model.Club;

import javax.validation.ValidationException;

@Service
public class ClubServiceImpl implements ClubService{

	@Autowired
	private ClubDAO dao;
	
	@Autowired
	private RunnerService runnerService;
	
	public Club create(Club club) {

		return dao.save(club);
	}

	public void addRunner(Integer idClub, Integer idRunner)
	{
		if (idClub == null || idRunner == null) {
			throw new IllegalArgumentException();
		}

		Club club = dao.findById(idClub).get();
		club.setRunner(runnerService.findById(idRunner).get());
		dao.saveAndFlush(club);
	}

	public Club findById(Integer idClub) {
		return dao.findById(idClub).get();
	}

}
