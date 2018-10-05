package com.atspring.clubdeportivo.atSpring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Table(indexes = {@Index(columnList="fk_competition,position", unique=true)})
@Entity
public class Score {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idScore;

	private Long points;
	
	@Column(name = "position")
	private Integer position;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_competition")
	private Competition competition;

	public Integer getIdScore() {
		return idScore;
	}

	public void setIdScore(Integer idScore) {
		this.idScore = idScore;
	}

	public Long getPoints() {
		return points;
	}

	public void setPoints(Long points) {
		this.points = points;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Competition getCompetition() {
		return competition;
	}

	public void setCompetition(Competition competition) {
		this.competition = competition;
	}
}
