package com.atspring.clubdeportivo.atSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atspring.clubdeportivo.atSpring.dto.ClubDTO;
import com.atspring.clubdeportivo.atSpring.mapper.ClubMapper;
import com.atspring.clubdeportivo.atSpring.service.ClubService;

@RestController
@RequestMapping("/club")
public class ClubController {
	
	@Autowired
	private ClubService clubService;
	
	@Autowired
	private ClubMapper mapper;
	
	@PostMapping
	public ClubDTO create(@RequestBody ClubDTO dto)
	{
		return mapper.mapToDTO(clubService.create(mapper.mapToModel(dto)));
	}

}
