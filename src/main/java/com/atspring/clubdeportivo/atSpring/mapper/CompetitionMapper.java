package com.atspring.clubdeportivo.atSpring.mapper;

import com.atspring.clubdeportivo.atSpring.dto.CompetitionDTO;
import com.atspring.clubdeportivo.atSpring.model.Competition;

public interface CompetitionMapper {

	CompetitionDTO mapToDTO(Competition competition);

	Competition mapToModel(CompetitionDTO dto);

}
