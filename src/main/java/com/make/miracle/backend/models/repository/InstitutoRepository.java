package com.make.miracle.backend.models.repository;

import com.make.miracle.backend.models.domain.Carrera;
import com.make.miracle.backend.models.domain.Institucion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstitutoRepository extends JpaRepository<Institucion, Long> {


    List<Institucion> findByTipoInstitucionNombre(String nombre);



}
