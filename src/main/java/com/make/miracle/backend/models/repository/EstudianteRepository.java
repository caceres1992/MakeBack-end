package com.make.miracle.backend.models.repository;

import com.make.miracle.backend.models.domain.Distrito;
import com.make.miracle.backend.models.domain.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {


    List<Estudiante> findTop5ByOrderByIdDesc();


}
