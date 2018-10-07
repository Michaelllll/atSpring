package com.atspring.clubdeportivo.atSpring.dto;

import java.io.Serializable;

import com.atspring.clubdeportivo.atSpring.model.Club;

public class ResultDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idResult;

	private Integer seconds;

	private Integer idRunner;

	private Integer idCompetition;
	
	private Club club;
	
	private String nameRunner;
	
	private String yearRunner;

	public ResultDTO(Integer idResult, Integer seconds, Integer idRunner, Club club) {
		super();
		this.idResult = idResult;
		this.seconds = seconds;
		this.idRunner = idRunner;
		this.club = club;
	}
	
	public ResultDTO(Integer seconds, String name, String year)
	{
		this.seconds = seconds;
		nameRunner = name;
		yearRunner = year;
	}
	
	public ResultDTO() {
	}

	public String getNameRunner() {
		return nameRunner;
	}

	public void setNameRunner(String nameRunner) {
		this.nameRunner = nameRunner;
	}

	public String getYearRunner() {
		return yearRunner;
	}

	public void setYearRunner(String yearRunner) {
		this.yearRunner = yearRunner;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	public Integer getIdCompetition() {
		return idCompetition;
	}

	public void setIdCompetition(Integer idCompetition) {
		this.idCompetition = idCompetition;
	}

	public Integer getIdResult() {
		return idResult;
	}

	public void setIdResult(Integer idResult) {
		this.idResult = idResult;
	}

	public Integer getSeconds() {
		return seconds;
	}

	public void setSeconds(Integer seconds) {
		this.seconds = seconds;
	}

	public Integer getIdRunner() {
		return idRunner;
	}

	public void setIdRunner(Integer idRunner) {
		this.idRunner = idRunner;
	}

}
