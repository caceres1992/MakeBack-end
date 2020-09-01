package com.make.miracle.backend.models.repository;

import com.make.miracle.backend.models.domain.Actividad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActividadRepository extends JpaRepository<Actividad,Long> {

}
