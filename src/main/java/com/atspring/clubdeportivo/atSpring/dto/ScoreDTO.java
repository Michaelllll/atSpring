package com.atspring.clubdeportivo.atSpring.dto;

import java.io.Serializable;

public class ScoreDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long points;

	private Integer position;

	public ScoreDTO(Long points, Integer position) {
		super();
		this.points = points;
		this.position = position;
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
}
