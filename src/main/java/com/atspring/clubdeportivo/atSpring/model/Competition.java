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

import lombok.Getter;
import lombok.Setter;

@Entity
public class Competition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idCompetition;
	
	private String name;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="competition")
	private List<RunnerCompetition> runners = new ArrayList<>();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="competition")
	private List<Score> scores = new ArrayList<>();

}
