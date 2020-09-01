package com.make.miracle.backend.models.repository;

import com.make.miracle.backend.models.domain.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CiudadRepository extends JpaRepository<Ciudad,Long> {
}
