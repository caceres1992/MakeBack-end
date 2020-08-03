package com.make.miracle.backend.models.repository;

import com.make.miracle.backend.models.domain.DetalleCarrera;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DetalleCarreraRepository extends JpaRepository<DetalleCarrera, Long> {

    List<DetalleCarrera> findByInstitucionNombre(String name);
}
