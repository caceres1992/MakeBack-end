package com.make.miracle.backend.models.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "CARRERAS")
public class Carrera implements Serializable{

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

//	@PrePersist
//	void Prepersist(){
//		DetalleCarrera detalleCarrera = new DetalleCarrera();
//		detalleCarrera.setCarrera(this);
//	}
	private static final long serialVersionUID = 1L;

}
