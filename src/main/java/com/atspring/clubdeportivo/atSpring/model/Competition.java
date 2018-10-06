package com.atspring.clubdeportivo.atSpring.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Competition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idCompetition;
	
	private String name;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="competition")
	private List<Result> results = new ArrayList<>();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="competition")
	private List<Score> scores = new ArrayList<>();

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


	public List<Result> getResults() {
		return results;
	}

	public void setResult(Result result) {
		results.add(result);
	}

	public List<Score> getScores() {
		return scores;
	}

	public void setScores(List<Score> scores) {
		this.scores = scores;
	}

}
