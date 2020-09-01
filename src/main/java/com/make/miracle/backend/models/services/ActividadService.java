package com.make.miracle.backend.models.services;

import com.make.miracle.backend.models.domain.Actividad;
import com.make.miracle.backend.models.repository.ActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ActividadService  {
//
    @Autowired
    private ActividadRepository actividadRepository;

    public List<Actividad>findAll(){
        return actividadRepository.findAll();
    }

    public Actividad save(Actividad actividad){
        Actividad nuevaActividad = actividadRepository.save(actividad);
        return  nuevaActividad;
    }

    void  delete (Long id){
        actividadRepository.deleteById(id);
    }
}
