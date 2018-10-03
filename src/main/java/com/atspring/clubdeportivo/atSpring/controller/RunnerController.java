package com.atspring.clubdeportivo.atSpring.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atspring.clubdeportivo.atSpring.dto.RunnerDTO;
import com.atspring.clubdeportivo.atSpring.mapper.RunnerMapper;
import com.atspring.clubdeportivo.atSpring.model.Runner;
import com.atspring.clubdeportivo.atSpring.service.RunnerService;

@RestController
@RequestMapping("/runner")
public class RunnerController {
	
	@Autowired
	RunnerService runnerService;
	
	@Autowired
	RunnerMapper mapper;

	@GetMapping("/{id}")
	RunnerDTO findRunnerById(@PathVariable Integer id)
	{
		Optional<Runner> runner = runnerService.findById(id);
		return mapper.mapToDTO(runner);
	}
}
