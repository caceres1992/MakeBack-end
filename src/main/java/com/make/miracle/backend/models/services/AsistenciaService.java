package com.make.miracle.backend.models.services;

import com.make.miracle.backend.models.domain.Asistencia;
import com.make.miracle.backend.models.repository.AsistenciaRepository;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class AsistenciaService {

    @Autowired
    private AsistenciaRepository asistenciaRepository;

    public List<Asistencia> findAll(){
         return asistenciaRepository.findAll();
    }

//    Guardar Asistencia masiva
    public List<Asistencia> saveAll(List<Asistencia> asistencia){
        List<Asistencia> newAsistencia ;
        newAsistencia = asistenciaRepository.saveAll(asistencia);
        return newAsistencia;
    }

public Asistencia Salida(Long id){
        Asistencia asistencia;

        asistencia = asistenciaRepository.getOne(id);
        if (asistencia.getSalida()==null){
            asistencia.setSalida(LocalTime.now());

            LocalTime entra = asistencia.getEntrada();
            LocalTime salida = asistencia.getSalida();

            System.out.println("resultado "+entra.until(salida, ChronoUnit.MILLIS));

            String total = String.valueOf(ChronoUnit.MINUTES.between(entra,salida));




            System.out.println("resultado "+ ChronoUnit.HOURS.between(entra,salida) +" "+ChronoUnit.MINUTES.between(entra,salida)+" "+ChronoUnit.SECONDS.between(entra,salida));

//            asistencia.getTotaldehoras(new LocalTime(LocalTime.now().compareTo(asistencia.getEntrada()),0,0,0)).get();

        }

return asistenciaRepository.save(asistencia);
    }

}
