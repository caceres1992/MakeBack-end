package com.make.miracle.backend.models.services;

import com.make.miracle.backend.models.entity.Ciudad;
import com.make.miracle.backend.models.entity.Pais;
import com.make.miracle.backend.models.entity.Patrocinador;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IPatrconadorServices {

    public List<Patrocinador> findAll();
    public Patrocinador finById(Long id);
    public  Patrocinador save(Patrocinador patrocinador);
    public void delete(Long id);

    public List<Ciudad> findAllCiudad();
    public List<Pais> findAllPais();
}
