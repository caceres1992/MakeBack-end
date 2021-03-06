package com.make.miracle.backend.controllers;

import com.make.miracle.backend.models.domain.TipoInstitucion;
import com.make.miracle.backend.models.services.TipoInstitucionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000","https://makeamiracle.netlify.app"})
//@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api")
public class TipodeInstitucionController {

    @Autowired
    private TipoInstitucionService tipoInstitucionService;

    @GetMapping("/tipoinstitucion")
    public List<TipoInstitucion> findAll() {
        return tipoInstitucionService.findlAll();
    }
}
