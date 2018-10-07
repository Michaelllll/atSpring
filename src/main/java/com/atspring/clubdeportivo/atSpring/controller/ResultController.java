package com.atspring.clubdeportivo.atSpring.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atspring.clubdeportivo.atSpring.dto.ResultDTO;
import com.atspring.clubdeportivo.atSpring.mapper.ResultMapper;
import com.atspring.clubdeportivo.atSpring.model.Result;
import com.atspring.clubdeportivo.atSpring.service.ResultService;
@RestController
@RequestMapping("/result")
public class ResultController {
	
	@Autowired
	private ResultService resultService;
	
	@Autowired
	private ResultMapper mapper;
	
	@GetMapping("/{id}")
	public ResultDTO findRunnerById (@PathVariable Integer id)
	{
		final Optional<Result> result = resultService.findById(id);
		return mapper.mapToDTO(result);
	}
	
	@GetMapping()
	public List<ResultDTO> findAll()
	{
		final List<Result> results = resultService.findAll();
		return mapper.mapToDTO(results);
	}

	@PutMapping("/file") 
	public void write() throws IOException
	{
		resultService.writeToFile(new Integer(0)); //Para la Prueba(Competition) 0 en este caso.
	}
	
	@PutMapping("/age") 
	public void resultByAge()
	{ 
		resultService.getResultsByAge(new Integer(0)); //Para la Prueba(Competition) 0 en este caso.
	}
	
	@PostMapping
	public ResultDTO create (@RequestBody ResultDTO dto)
	{
		final Result result = resultService.create(mapper.mapToModel(dto),dto.getIdRunner(),dto.getIdCompetition());
		return mapper.mapToDTO(result);
	}

}
