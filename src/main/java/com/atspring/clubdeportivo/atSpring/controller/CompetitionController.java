package com.atspring.clubdeportivo.atSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atspring.clubdeportivo.atSpring.dto.CompetitionDTO;
import com.atspring.clubdeportivo.atSpring.mapper.CompetitionMapper;
import com.atspring.clubdeportivo.atSpring.service.CompetitionService;

@RestController
@RequestMapping("/competition")
public class CompetitionController {

	@Autowired
	private CompetitionService competitionService;

	@Autowired
	private CompetitionMapper mapper;

	@PostMapping
	public CompetitionDTO create(@RequestBody CompetitionDTO dto) {
		return mapper.mapToDTO(competitionService.create(mapper.mapToModel(dto)));
	}
}
