package com.make.miracle.backend.models.repository;

import com.make.miracle.backend.dto.Instituciones;
import com.make.miracle.backend.models.domain.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CarreraRepository extends JpaRepository<Carrera, Long> {


}
