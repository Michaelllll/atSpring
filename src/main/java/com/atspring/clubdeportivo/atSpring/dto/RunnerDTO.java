package com.atspring.clubdeportivo.atSpring.dto;

import java.io.Serializable;
import java.util.Date;

import com.atspring.clubdeportivo.atSpring.model.Club;

import lombok.Data;

@Data
public class RunnerDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer idRunner;
	
	private String name;
	
	private Date birthDate;
	
	private Integer number;
	
	private Club club;

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
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

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

}
