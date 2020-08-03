package com.make.miracle.backend.models.services;

import com.make.miracle.backend.models.domain.Pais;
import com.make.miracle.backend.models.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PaisService {


    @Autowired
    private PaisRepository paisRepository;

    public Pais findAll() {
        return (Pais) paisRepository.findAll();
    }
}
