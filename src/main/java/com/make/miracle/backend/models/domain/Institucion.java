package com.make.miracle.backend.models.domain;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Entity
@Table(name = "INSTITUCIONES")
@Data
public class Institucion implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "id_carrera")
//	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
//	private Carrera carrera;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo_institucion")
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private TipoInstitucion tipoInstitucion;

//	@PrePersist
//	void Prepersist(){
//		DetalleCarrera detalleCarrera = new DetalleCarrera();
//		detalleCarrera.setInstitucion(this);
//		System.out.print("otra vez" + this);
//	}

	private static final long serialVersionUID = 1L;
}
