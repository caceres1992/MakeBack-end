package com.make.miracle.backend.controllers;

import com.make.miracle.backend.models.domain.Distrito;
import com.make.miracle.backend.models.services.DistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/app")
public class DistritoController {

    @Autowired
    private DistritoService distritoService;


    @GetMapping("/distritos")
    public Distrito findAll() {
        return distritoService.findAll();
    }
}
