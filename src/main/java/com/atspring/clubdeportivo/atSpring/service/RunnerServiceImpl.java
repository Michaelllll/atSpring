package com.atspring.clubdeportivo.atSpring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atspring.clubdeportivo.atSpring.dao.RunnerDAO;
import com.atspring.clubdeportivo.atSpring.model.Runner;

@Service
public class RunnerServiceImpl implements RunnerService {

	@Autowired
	RunnerDAO dao;
	
	@Autowired
	ClubService clubService;

	public Runner create(Runner runner) {
		return dao.save(runner);
	}

	public void update(Runner runner) {
		dao.saveAndFlush(runner);
	}

	public void delete(Integer idRunner) {
		dao.deleteById(idRunner);
	}

	public Optional<Runner> findById(Integer idRunner) {
		return dao.findById(idRunner);
	}

	public List<Runner> findAll() {
		return dao.findAll();
	}
	
	public void addClub(Integer idRunner, Integer idClub)
	{
		Runner runner = dao.findById(idRunner).get();
		runner.setClub(clubService.findById(idClub));
		dao.saveAndFlush(runner);
	}

}
