package com.make.miracle.backend.models.services;

import com.make.miracle.backend.models.domain.Distrito;
import com.make.miracle.backend.models.repository.DistritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DistritoService {

    @Autowired
    private DistritoRepository distritoRepository;

    public List<Distrito> findAll() {
        return  distritoRepository.findAll();
    }


}
