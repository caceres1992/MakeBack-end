package com.make.miracle.backend.models.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "ASISTENCIA")
@Data
public class Asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private LocalTime entrada;
    @Column
    private LocalTime Salida;


    @Column(name = "total_horas")
    private LocalTime totaldehoras;
    private String comentario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_actividad")
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    private Actividad actividad;

    private boolean estado;

    @PrePersist

    public void Prepresist(){
        estado = true;
        entrada = LocalTime.now();
        ;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_estudiante")
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    private Estudiante estudiante;

}
