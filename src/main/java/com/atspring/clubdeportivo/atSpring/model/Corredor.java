package com.atspring.clubdeportivo.atSpring.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Corredor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idCorredor;
	
	private String nombre;
	
	private Integer dorsal;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Club club;
	
	/**
	 * Un corredor participa en una serie de pruebas y obtiene en cada
	 * una de ellas un resultado (puntuación)*/
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="corredor")
	private List<CorredorPrueba> pruebas = new ArrayList<>();

}
