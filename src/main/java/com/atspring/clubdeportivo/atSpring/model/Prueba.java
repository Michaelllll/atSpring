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
@Getter
@Setter
public class Prueba {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idPrueba;
	
	private String nombre;
	
	private double distancia;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="prueba")
	private List<CorredorPrueba> corredores = new ArrayList<>();

}
