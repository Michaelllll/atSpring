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


@Table(uniqueConstraints = @UniqueConstraint(columnNames={"fk_competition","position"}))
@Entity
public class Score {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idScore;
	
	private Long points;
	
	private Integer position;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_competition")
	private Competition competition;

}
