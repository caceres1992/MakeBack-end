package com.make.miracle.backend.models.repository;

import com.make.miracle.backend.models.domain.Ciudad;
import com.make.miracle.backend.models.domain.Pais;
import com.make.miracle.backend.models.domain.Patrocinador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface PatrocinadorRepository extends JpaRepository<Patrocinador, Long> {


    List<Patrocinador> findTop5ByOrderByIdDesc();
}
