package com.make.miracle.backend.models.services;

import com.make.miracle.backend.models.domain.Ciudad;
import com.make.miracle.backend.models.repository.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CiudadService {
    @Autowired
    private CiudadRepository ciudadRepository;

    public Ciudad findAll() {
        return (Ciudad) ciudadRepository.findAll();
    }
}
