package com.atspring.clubdeportivo.atSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atspring.clubdeportivo.atSpring.dao.ScoreDAO;
import com.atspring.clubdeportivo.atSpring.model.Score;

@Service
public class ScoreServiceImpl implements ScoreService {

	@Autowired
	private ScoreDAO dao;

	public List<Score> findAll() {
		return dao.findAll();
	}

}
