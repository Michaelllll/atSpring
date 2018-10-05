package com.atspring.clubdeportivo.atSpring.mapper;

import java.util.List;
import java.util.Optional;

import com.atspring.clubdeportivo.atSpring.dto.ResultDTO;
import com.atspring.clubdeportivo.atSpring.model.Result;

public interface ResultMapper {

	ResultDTO mapToDTO(Optional<Result> result);

	ResultDTO mapToDTO(Result result);

	Result mapToModel(ResultDTO dto);

	List<ResultDTO> mapToDTO(List<Result> result);
}
