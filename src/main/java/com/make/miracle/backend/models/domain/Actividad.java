package com.make.miracle.backend.models.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "ACTIVIDADES")
@Data
public class Actividad  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_registro")
    private Date fechadeRegistro;



    private String nombre;
    private String direccion;
    private String descripcion;
    private boolean estado;

    @PrePersist
    public  void Prepersist(){
        fechadeRegistro = new Date();
        estado = true;
    }



    private static final long serialVersionUID = 1L;
}
