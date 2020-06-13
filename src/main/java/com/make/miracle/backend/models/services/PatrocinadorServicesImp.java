package com.make.miracle.backend.models.services;

import com.make.miracle.backend.models.dao.IPratocinadorDao;
import com.make.miracle.backend.models.entity.Ciudad;
import com.make.miracle.backend.models.entity.Pais;
import com.make.miracle.backend.models.entity.Patrocinador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PatrocinadorServicesImp implements IPatrconadorServices {

@Autowired
private IPratocinadorDao  patrocinadorDao;

    @Override
    @Transactional(readOnly = true)
    public List<Patrocinador> findAll() {
        return (List<Patrocinador>) patrocinadorDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Patrocinador finById(Long id) {
        return patrocinadorDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Patrocinador save(Patrocinador patrocinador) {
        return patrocinadorDao.save(patrocinador);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        patrocinadorDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Ciudad> findAllCiudad() {
        return patrocinadorDao.findAllCiudad();
    }

    @Override
    public List<Pais> findAllPais() {
        return patrocinadorDao.findAllPais();
    }
}
