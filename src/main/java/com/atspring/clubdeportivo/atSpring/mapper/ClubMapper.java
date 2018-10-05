package com.atspring.clubdeportivo.atSpring.mapper;

import com.atspring.clubdeportivo.atSpring.dto.ClubDTO;
import com.atspring.clubdeportivo.atSpring.model.Club;

public interface ClubMapper {

	ClubDTO mapToDTO(Club club);
	Club mapToModel(ClubDTO dto);
}
