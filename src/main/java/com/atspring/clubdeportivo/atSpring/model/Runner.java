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

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Runner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idRunner;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date birthDate;
	
	private String name;
	
	/** Dorsal **/
	private Integer number;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Club club;
	
	/**
	 * Un corredor participa en una serie de pruebas y obtiene en cada
	 * una de ellas un resultado (puntuación)*/
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="runner")
	private List<RunnerCompetition> pruebas = new ArrayList<>();

}
