package com.make.miracle.backend.models.services;

import com.make.miracle.backend.models.domain.Carrera;
import com.make.miracle.backend.models.repository.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CarreraService {

    @Autowired
    private CarreraRepository carreraRepository;


    public List<Carrera> findAll() {
        return carreraRepository.findAll();
    }

//    public Carrera save(Carrera carrera){
//        Carrera newCarrera =
//    }
}
