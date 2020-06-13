package com.make.miracle.backend.models.services;

import com.make.miracle.backend.models.entity.Distrito;
import com.make.miracle.backend.models.entity.Estudiante;

import java.util.List;

public interface IEstudianteServices {
    public List<Estudiante> findAll();
    public Estudiante finById(Long id);
    public  Estudiante save(Estudiante estudiante);
    public void delete(Long id);
    public List<Distrito> findAllDistrito();
}
