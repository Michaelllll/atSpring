package com.atspring.clubdeportivo.atSpring.dto;

import lombok.Data;

@Data
public class RunnerDTO {
	
	private String name;
	
	private Integer number;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

}
