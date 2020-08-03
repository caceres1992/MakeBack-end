package com.make.miracle.backend.controllers;

import com.make.miracle.backend.models.domain.Ciudad;
import com.make.miracle.backend.models.services.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/app")
public class CiudadController {


    @Autowired
    private CiudadService ciudadService;


    @GetMapping("/ciudad")
    public Ciudad findAll() {
        return ciudadService.findAll();
    }
}
