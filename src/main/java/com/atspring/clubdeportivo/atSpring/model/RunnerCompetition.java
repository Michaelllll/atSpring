package com.atspring.clubdeportivo.atSpring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class RunnerCompetition {
	
	@Embeddable
	@Getter
	@Setter
	public static class IdRunnerCompetition implements Serializable {

		private static final long serialVersionUID = 817540279106537232L;

		@Column(name = "fk_runner")
		private Integer idRunner;

		@Column(name = "fk_competition")
		private Integer idCompetition;

		public IdRunnerCompetition() {}
		
		public IdRunnerCompetition(Integer idRunner, Integer idCompetition) {
			this.idRunner = idRunner;
			this.idCompetition = idCompetition;
		}
	}
	
	@EmbeddedId
	private IdRunnerCompetition idRunnerCompetition;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_runner")
	private Runner runner;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_competition")
	private Competition competition;
	
	private Integer seconds;
	
}
