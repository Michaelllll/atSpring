package com.atspring.clubdeportivo.atSpring.dto;

import java.io.Serializable;
import java.util.Date;

import com.atspring.clubdeportivo.atSpring.model.Club;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

public class RunnerDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer idRunner;
	
	private String name;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date birthDate;
	
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
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
