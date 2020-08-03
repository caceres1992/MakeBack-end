package com.make.miracle.backend.models.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "INSTITUCIONES")
public class Institucion implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo_institucion")
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private TipoInstitucion tipoInstitucion;

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

	public TipoInstitucion getTipoInstitucion() {
		return tipoInstitucion;
	}

	public void setTipoInstitucion(TipoInstitucion tipoInstitucion) {
		this.tipoInstitucion = tipoInstitucion;
	}

	private static final long serialVersionUID = 1L;
}
