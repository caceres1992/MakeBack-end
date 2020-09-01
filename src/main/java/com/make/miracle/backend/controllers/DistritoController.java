package com.make.miracle.backend.controllers;

import com.make.miracle.backend.models.domain.Distrito;
import com.make.miracle.backend.models.services.DistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api")
public class DistritoController {

    @Autowired
    private DistritoService distritoService;


    @GetMapping("/distritos")
    public Distrito findAll() {
        return distritoService.findAll();
    }
}
