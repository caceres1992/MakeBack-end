package com.make.miracle.backend.models.services;

import com.make.miracle.backend.models.domain.DetalleCarrera;
import com.make.miracle.backend.models.repository.DetalleCarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DetalleCarreraService {

    @Autowired
    private DetalleCarreraRepository detalleCarreraRepository;

    public List<DetalleCarrera> findAll() {
        return detalleCarreraRepository.findAll();
    }

    public List<DetalleCarrera> findByInstitucionNombre(String name) {
        return detalleCarreraRepository.findByInstitucionNombre(name);
    }
}
