package com.atspring.clubdeportivo.atSpring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atspring.clubdeportivo.atSpring.dao.ResultDAO;
import com.atspring.clubdeportivo.atSpring.model.Result;

@Service
public class ResultServiceImpl implements ResultService{

	@Autowired
	private ResultDAO dao;
	
	public Result create(Result result) {
		return dao.save(result);
	}

	public Optional<Result> findById(Integer idResult) {
		return dao.findById(idResult);
	}

	public List<Result> findAll() {
		return dao.findAll();
	}

}
