package com.atspring.clubdeportivo.atSpring.mapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.atspring.clubdeportivo.atSpring.dto.RunnerDTO;
import com.atspring.clubdeportivo.atSpring.model.Runner;

@Component
public class RunnerMapperImpl implements RunnerMapper{
	
	public Runner mapToModel(RunnerDTO dto) {
		final Runner runner = new Runner();
		runner.setName(dto.getName());
		runner.setBirthYear(dto.getYear());
		return runner;
	}

	public RunnerDTO mapToDTO(Optional<Runner> runner) {
		final RunnerDTO dto = new RunnerDTO();
		dto.setIdRunner(runner.get().getIdRunner());
		dto.setName(runner.get().getName());
		dto.setYear(runner.get().getBirthYear());
		return dto;
	}

	public RunnerDTO mapToDTO(Runner runner) {
		final RunnerDTO dto = new RunnerDTO();
		dto.setIdRunner(runner.getIdRunner());
		dto.setName(runner.getName());
		dto.setYear(runner.getBirthYear());
		return dto;
	}

	public List<RunnerDTO> mapToDTO(List<Runner> runners) {
		return runners.parallelStream().map(this::mapToDTO).collect(Collectors.toList());
	}

}
