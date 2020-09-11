package com.make.miracle.backend.models.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Entity
@Table(name = "BECAS")
@Data
public class Beca implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_registro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    private String observacion;
    private String estado;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_estudiante", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Estudiante estudiante;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_patrocinador", nullable = true)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Patrocinador patrocinador;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_institucion", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Institucion institucion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_carrera", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Carrera carrera;


    @Column(name = "fecha_culminado")
    @Temporal(TemporalType.DATE)
    private Date fechaCulminado;

    @PrePersist
    public void prePersist() {
        estado = "activo";
        fechaRegistro = new Date();
    }



    private static final long serialVersionUID = 1L;

}
