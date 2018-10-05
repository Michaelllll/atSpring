package com.atspring.clubdeportivo.atSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atspring.clubdeportivo.atSpring.dao.ClubDAO;
import com.atspring.clubdeportivo.atSpring.model.Club;

@Service
public class ClubServiceImpl implements ClubService{

	@Autowired
	private ClubDAO dao;
	
	public Club create(Club club) {
		
		return dao.save(club);
	}

}
