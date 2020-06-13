package com.make.miracle.backend.models.dao;

import com.make.miracle.backend.models.entity.Distrito;
import com.make.miracle.backend.models.entity.Estudiante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IEstudianteDao extends CrudRepository <Estudiante, Long> {

    @Query("from Distrito")
    public List<Distrito> findAllDistrito();

}
