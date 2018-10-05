package com.atspring.clubdeportivo.atSpring.dto;

import java.io.Serializable;

public class ResultDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idResult;

	private Integer seconds;
	
	private Integer idRunner;

	public Integer getIdResult() {
		return idResult;
	}

	public void setIdResult(Integer idResult) {
		this.idResult = idResult;
	}

	public Integer getSeconds() {
		return seconds;
	}

	public void setSeconds(Integer seconds) {
		this.seconds = seconds;
	}

	public Integer getIdRunner() {
		return idRunner;
	}

	public void setIdRunner(Integer idRunner) {
		this.idRunner = idRunner;
	}
	
}
