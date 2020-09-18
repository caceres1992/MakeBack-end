package com.make.miracle.backend.models.domain;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "DETALLE_CARRERAS")
public class DetalleCarrera implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_institucion")
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private Institucion institucion;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_carrera")
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private Carrera carrera;



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Institucion getInstitucion() {
		return institucion;
	}

	public void setInstitucion(Institucion institucion) {
		this.institucion = institucion;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	private static final long serialVersionUID = 1L;

}
