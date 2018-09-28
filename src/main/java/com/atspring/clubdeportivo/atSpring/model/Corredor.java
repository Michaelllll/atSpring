package com.atspring.clubdeportivo.atSpring.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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

}
