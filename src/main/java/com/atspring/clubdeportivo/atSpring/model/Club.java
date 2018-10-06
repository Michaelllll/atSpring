package com.atspring.clubdeportivo.atSpring.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Club {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idClub;
	
	private String name;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="club")
	private List<Runner> runners = new ArrayList<>();

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

	public List<Runner> getRunners() {
		return runners;
	}

	public void setRunner(Runner runner) {
		System.out.println("Se ha añadido el corredor: "+runner.getName()+" al club "+this.getName());
		runners.add(runner);
	}

}
