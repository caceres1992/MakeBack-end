package com.make.miracle.backend.models.services;

import com.make.miracle.backend.models.domain.TipoInstitucion;
import com.make.miracle.backend.models.repository.TipoInstitucionRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TipoInstitucionService {

    @Autowired
    private TipoInstitucionRespository tipoInstitucionRespository;


    public List<TipoInstitucion> findlAll() {
        return  tipoInstitucionRespository.findAll();
    }


}
