package com.atspring.clubdeportivo.atSpring.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CompetitionDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idCompetition;

	private String name;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date date;

	public Integer getIdCompetition() {
		return idCompetition;
	}

	public void setIdCompetition(Integer idCompetition) {
		this.idCompetition = idCompetition;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
