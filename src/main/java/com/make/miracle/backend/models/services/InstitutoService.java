package com.make.miracle.backend.models.services;

import com.make.miracle.backend.models.domain.Institucion;
import com.make.miracle.backend.models.domain.TipoInstitucion;
import com.make.miracle.backend.models.repository.InstitutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class InstitutoService {

    @Autowired
    private InstitutoRepository institutoRepository;


    public List<Institucion> findAll() {
        return  institutoRepository.findAll();
    }

    public List<Institucion> findBytipodeInstitucion(String name) {

        return institutoRepository.findByTipoInstitucionNombre(name);
    }

    public List<Institucion> saveAllInstitutciones(List<Institucion> institucions){
            List<Institucion> newInstitucion;
            newInstitucion = institutoRepository.saveAll(institucions);
            return  newInstitucion;
    }

    public Institucion update (Institucion institucion ,Long id){
                Institucion institucionupdate = institutoRepository.getOne(id);
                institucionupdate.setCarrera(institucion.getCarrera());
                institucionupdate.setNombre(institucion.getNombre());
                institucionupdate.setTipoInstitucion(institucion.getTipoInstitucion());
        return institutoRepository.save(institucionupdate);
    }

    public Long countInstituciones(String institucion){
        return institutoRepository.countByTipoInstitucionNombre(institucion);
    }


}
