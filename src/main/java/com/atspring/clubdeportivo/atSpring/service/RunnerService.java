package com.atspring.clubdeportivo.atSpring.service;

import java.util.List;
import java.util.Optional;

import com.atspring.clubdeportivo.atSpring.model.Runner;

public interface RunnerService {
	
	Runner create (Runner runner);
	
	void update (Runner runner);
	
	void delete (Integer idRunner);
	
	Optional<Runner> findById (Integer idRunner);
	
	List<Runner> findAll();

}
