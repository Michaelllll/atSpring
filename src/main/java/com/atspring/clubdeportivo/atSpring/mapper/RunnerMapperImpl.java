package com.atspring.clubdeportivo.atSpring.mapper;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.atspring.clubdeportivo.atSpring.dto.RunnerDTO;
import com.atspring.clubdeportivo.atSpring.model.Runner;

@Component
public class RunnerMapperImpl implements RunnerMapper{
	
	public Runner mapToModel(RunnerDTO dto) {
		final Runner runner = new Runner();
		runner.setName(dto.getName());
		runner.setNumber(dto.getNumber());
		runner.setBirthDate(dto.getBirthDate());
		runner.setClub(dto.getClub());
		return runner;
	}

	public RunnerDTO mapToDTO(Optional<Runner> runner) {
		final RunnerDTO dto = new RunnerDTO();
		dto.setName(runner.get().getName());
		dto.setNumber(runner.get().getNumber());
		dto.setBirthDate(runner.get().getBirthDate());
		dto.setClub(runner.get().getClub());
		return dto;
	}

	public RunnerDTO mapToDTO(Runner runner) {
		final RunnerDTO dto = new RunnerDTO();
		dto.setName(runner.getName());
		dto.setNumber(runner.getNumber());
		dto.setBirthDate(runner.getBirthDate());
		dto.setClub(runner.getClub());
		return dto;
	}

}
