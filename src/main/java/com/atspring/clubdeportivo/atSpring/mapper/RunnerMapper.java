package com.atspring.clubdeportivo.atSpring.mapper;

import java.util.List;
import java.util.Optional;

import com.atspring.clubdeportivo.atSpring.dto.RunnerDTO;
import com.atspring.clubdeportivo.atSpring.model.Runner;

public interface RunnerMapper {
	
	Runner mapToModel(RunnerDTO dto);
	List<RunnerDTO> mapToDTO(List<Runner> runners);
	RunnerDTO mapToDTO(Runner runner);
	RunnerDTO mapToDTO(Optional<Runner> runner);
}
