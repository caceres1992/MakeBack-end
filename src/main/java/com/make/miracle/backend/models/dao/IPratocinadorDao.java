package com.make.miracle.backend.models.dao;

import com.make.miracle.backend.models.entity.Ciudad;
import com.make.miracle.backend.models.entity.Pais;
import com.make.miracle.backend.models.entity.Patrocinador;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface IPratocinadorDao extends CrudRepository<Patrocinador,Long> {


    @Query("from Ciudad")
    public List<Ciudad> findAllCiudad();

    @Query("from Pais")
    public List<Pais> findAllPais();
}
