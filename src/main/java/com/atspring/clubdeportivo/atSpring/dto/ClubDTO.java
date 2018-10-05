package com.atspring.clubdeportivo.atSpring.dto;

import java.io.Serializable;

public class ClubDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer idClub;

	private String name;

	public Integer getIdClub() {
		return idClub;
	}

	public void setIdClub(Integer idClub) {
		this.idClub = idClub;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
