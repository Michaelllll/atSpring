package com.atspring.clubdeportivo.atSpring.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Prueba {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idPrueba;
	
	private String nombre;
	
	private double distancia;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

}
