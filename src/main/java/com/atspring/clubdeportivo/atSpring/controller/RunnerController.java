package com.atspring.clubdeportivo.atSpring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public RunnerDTO findRunnerById (@PathVariable Integer id)
	{
		final Optional<Runner> runner = runnerService.findById(id);
		return mapper.mapToDTO(runner);
	}
	
	@GetMapping()
	public List<RunnerDTO> findAll()
	{
		final List<Runner> runners = runnerService.findAll();
		return mapper.mapToDTO(runners);
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable Integer id)
	{
		runnerService.delete(id);
	}
	
	@PutMapping("/{id}")
	public void update (@RequestBody RunnerDTO dto, @PathVariable Integer id) throws Exception
	{
		if(id==dto.getIdRunner() && id!=null)
		{
			final Optional<Runner> runner = runnerService.findById(id);
			runner.get().setName(dto.getName());
			runner.get().setBirthYear(dto.getYear());
			runnerService.update(runner.get());
		}
		else
			throw new Exception("El id no existe o no coincide con el corredor.");
	}
	
	@PostMapping
	public RunnerDTO create (@RequestBody RunnerDTO dto)
	{
		final Runner runner = runnerService.create(mapper.mapToModel(dto));
		return mapper.mapToDTO(runner);
	}
}
