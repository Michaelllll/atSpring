package com.atspring.clubdeportivo.atSpring.mapper;

import org.springframework.stereotype.Component;

import com.atspring.clubdeportivo.atSpring.dto.CompetitionDTO;
import com.atspring.clubdeportivo.atSpring.model.Competition;

@Component
public class CompetitionMapperImpl implements CompetitionMapper{

	public CompetitionDTO mapToDTO(Competition competition) {
		final CompetitionDTO dto = new CompetitionDTO();
		dto.setDate(competition.getDate());
		dto.setIdCompetition(competition.getIdCompetition());
		dto.setName(competition.getName());
		return dto;
	}

	public Competition mapToModel(CompetitionDTO dto) {
		final Competition competition = new Competition();
		competition.setDate(dto.getDate());
		competition.setIdCompetition(dto.getIdCompetition());
		competition.setName(dto.getName());
		return competition;
	}

}
