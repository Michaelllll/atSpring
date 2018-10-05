package com.atspring.clubdeportivo.atSpring.mapper;

import org.springframework.stereotype.Component;

import com.atspring.clubdeportivo.atSpring.dto.ClubDTO;
import com.atspring.clubdeportivo.atSpring.model.Club;

@Component
public class ClubMapperImpl implements ClubMapper {

	public ClubDTO mapToDTO(Club club) {
		final ClubDTO dto = new ClubDTO();
		dto.setIdClub(club.getIdClub());
		dto.setName(club.getName());
		return dto;
	}

	public Club mapToModel(ClubDTO dto) {
		final Club club = new Club();
		club.setIdClub(dto.getIdClub());
		club.setName(dto.getName());
		return club;
	}

}
