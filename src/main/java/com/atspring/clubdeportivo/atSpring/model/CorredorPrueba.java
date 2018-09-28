package com.atspring.clubdeportivo.atSpring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CorredorPrueba {
	
	@Embeddable
	public static class IdCorredorPrueba implements Serializable {

		private static final long serialVersionUID = 817540279106537232L;

		@Column(name = "fk_corredor")
		private Integer idCorredor;

		@Column(name = "fk_prueba")
		private Integer idPrueba;

		public IdCorredorPrueba() {}
		
		public IdCorredorPrueba(Integer idCorredor, Integer idPrueba) {
			this.idCorredor = idCorredor;
			this.idPrueba = idPrueba;
		}
	}
	
	@EmbeddedId
	private IdCorredorPrueba idCorredorPrueba;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_corredor")
	private Corredor corredor;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_prueba")
	private Prueba prueba;
	
	private Integer segundos;
	
}
