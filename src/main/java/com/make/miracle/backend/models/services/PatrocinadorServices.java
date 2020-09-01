package com.make.miracle.backend.models.services;

import com.make.miracle.backend.models.repository.PatrocinadorRepository;
import com.make.miracle.backend.models.domain.Ciudad;
import com.make.miracle.backend.models.domain.Pais;
import com.make.miracle.backend.models.domain.Patrocinador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class PatrocinadorServices {

    @Autowired
    private PatrocinadorRepository patrocinadorDao;


    public Page<Patrocinador> findAll(Pageable pageable) {
        return patrocinadorDao.findAll(pageable);
    }


    public Patrocinador finById(Long id) {
        return patrocinadorDao.findById(id).orElse(null);
    }


    //agregar patrocinador
    public Patrocinador save(Patrocinador patrocinador) {
        Patrocinador patrocinadornuevo = patrocinadorDao.save(patrocinador);

        return patrocinador;
    }


    public Patrocinador Update(Patrocinador patrocinador, Long id) {
        Patrocinador patrocinadorUpdate = patrocinadorDao.getOne(id);
        patrocinadorUpdate.setPasaporte(patrocinador.getPasaporte());
        patrocinadorUpdate.setNombre(patrocinador.getNombre());
        patrocinadorUpdate.setApellido(patrocinador.getApellido());
        patrocinadorUpdate.setTelefono(patrocinador.getTelefono());
        patrocinadorUpdate.setCorreo(patrocinador.getCorreo());
        patrocinadorUpdate.setCiudad(patrocinador.getCiudad());
        return patrocinadorUpdate;
    }

    public Patrocinador statusUpdate(Long id) {

        Patrocinador patrocinadorStatus = patrocinadorDao.getOne(id);

        patrocinadorStatus.setEstado(!patrocinadorStatus.getEstado());
        return patrocinadorStatus;

    }


    public List<Patrocinador> findTop5ByOrderByIdDesc() {
        return patrocinadorDao.findTop5ByOrderByIdDesc();
    }


}
