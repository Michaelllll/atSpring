package com.atspring.clubdeportivo.atSpring.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Table(indexes = {@Index(columnList="fk_runner,fk_competition", unique=true)})
@Entity
public class Result {
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Integer idResult;
	
	private Integer seconds;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_runner")
	private Runner runner;
	
	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_competition")
	private Competition competition;

	public Integer getidResult() {
		return idResult;
	}

	public void setidResult(Integer idResult) {
		this.idResult = idResult;
	}

	public Integer getSeconds() {
		return seconds;
	}

	public void setSeconds(Integer seconds) {
		this.seconds = seconds;
	}

	public Runner getRunner() {
		return runner;
	}

	public void setRunner(Runner runner) {
		this.runner = runner;
	}

	public Competition getCompetition() {
		return competition;
	}

	public void setCompetition(Competition competition) {
		this.competition = competition;
	}
	
	
}
