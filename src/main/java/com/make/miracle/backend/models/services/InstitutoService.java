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
        return (List<Institucion>) institutoRepository.findAll();
    }

    public List<Institucion> findBytipodeInstitucion(String name) {

        return institutoRepository.findByTipoInstitucionNombre(name);
    }

    ;


}
