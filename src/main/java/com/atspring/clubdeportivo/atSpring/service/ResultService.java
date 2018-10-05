package com.atspring.clubdeportivo.atSpring.service;

import java.util.List;
import java.util.Optional;

import com.atspring.clubdeportivo.atSpring.model.Result;

public interface ResultService {

	Result create(Result result, Integer idRunner, Integer idCompetition);

	Optional<Result> findById(Integer idResult);

	List<Result> findAll();
}
