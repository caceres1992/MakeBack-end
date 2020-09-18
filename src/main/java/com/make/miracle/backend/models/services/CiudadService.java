package com.make.miracle.backend.models.services;

import com.make.miracle.backend.models.domain.Ciudad;
import com.make.miracle.backend.models.repository.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CiudadService {
    @Autowired
    private CiudadRepository ciudadRepository;

    public List<Ciudad> findAll() {
        return  ciudadRepository.findAll();
    }

    public Ciudad getById(Long id){
        return ciudadRepository.findById(id).orElse(null);
    }
}
