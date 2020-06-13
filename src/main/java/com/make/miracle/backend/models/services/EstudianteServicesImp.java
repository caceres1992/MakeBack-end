package com.make.miracle.backend.models.services;

import com.make.miracle.backend.models.dao.IEstudianteDao;
import com.make.miracle.backend.models.entity.Distrito;
import com.make.miracle.backend.models.entity.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EstudianteServicesImp implements  IEstudianteServices {

    @Autowired
    private IEstudianteDao estudianteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Estudiante> findAll() {
        return (List<Estudiante>) estudianteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Estudiante finById(Long id) {
        return estudianteDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Estudiante save(Estudiante estudiante) {

        return estudianteDao.save(estudiante);

    }

    @Override
    @Transactional
    public void delete(Long id) {
        estudianteDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Distrito> findAllDistrito() {
        return estudianteDao.findAllDistrito();
    }


}
