package com.atspring.clubdeportivo.atSpring.mapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.atspring.clubdeportivo.atSpring.dto.ResultDTO;
import com.atspring.clubdeportivo.atSpring.model.Result;
import com.atspring.clubdeportivo.atSpring.service.RunnerService;

@Component
public class ResultMapperImpl implements ResultMapper{

	@Autowired
	private RunnerService runnerService;
	
	public ResultDTO mapToDTO(Result result)
	{
		final ResultDTO dto = new ResultDTO();
		dto.setIdResult(result.getidResult());
		dto.setSeconds(result.getSeconds());
		dto.setIdRunner(result.getRunner().getIdRunner());
		return dto;
	}
	
	public ResultDTO mapToDTO(Optional<Result> result)
	{
		final ResultDTO dto = new ResultDTO();
		dto.setIdResult(result.get().getidResult());
		dto.setSeconds(result.get().getSeconds());
		dto.setIdRunner(result.get().getRunner().getIdRunner());
		return dto;
	}
	
	public Result mapToModel(ResultDTO dto)
	{
		final Result result = new Result();
		result.setidResult(dto.getIdResult());
		result.setSeconds(dto.getSeconds());
		//result.setRunner(runnerService.findById(dto.getIdRunner()).get());
		return result;
	}

	public List<ResultDTO> mapToDTO(List<Result> result) {
		return result.parallelStream().map(this::mapToDTO).collect(Collectors.toList());
	}
}
