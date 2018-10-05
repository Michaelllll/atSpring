package com.atspring.clubdeportivo.atSpring.dto;

import java.io.Serializable;
import java.util.Date;

import com.atspring.clubdeportivo.atSpring.model.Club;
import com.fasterxml.jackson.annotation.JsonFormat;

public class RunnerDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer idRunner;
	
	private String name;
	
	@JsonFormat(pattern = "yyyy")
	private String year;

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Integer getIdRunner() {
		return idRunner;
	}

	public void setIdRunner(Integer idRunner) {
		this.idRunner = idRunner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
