package com.atspring.clubdeportivo.atSpring.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Runner {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idRunner;

	private String birthYear;

	private String name;

	@ManyToOne(fetch = FetchType.LAZY)
	private Club club;

	/**
	 * Un corredor participa en una serie de pruebas y obtiene en cada una de ellas un resultado (puntuación)
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "runner")
	private List<Result> results = new ArrayList<>();

	public Integer getIdRunner() {
		return idRunner;
	}

	public void setIdRunner(Integer idRunner) {
		this.idRunner = idRunner;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}
	
}
