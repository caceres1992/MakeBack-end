package com.make.miracle.backend.models.repository;

import com.make.miracle.backend.models.domain.Asistencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsistenciaRepository  extends JpaRepository<Asistencia,Long> {


}
