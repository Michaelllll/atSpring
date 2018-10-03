package com.atspring.clubdeportivo.atSpring.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Table(uniqueConstraints = @UniqueConstraint(columnNames={"fk_runner","fk_competition"}))
@Entity
@Getter
@Setter
public class RunnerCompetition {
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Integer idRunnerCompetition;
	
	private Integer seconds;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_runner")
	private Runner runner;
	
	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_competition")
	private Competition competition;
	
}
