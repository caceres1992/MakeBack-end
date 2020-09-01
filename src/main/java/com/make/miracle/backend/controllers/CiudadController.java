package com.make.miracle.backend.controllers;

import com.make.miracle.backend.models.domain.Ciudad;
import com.make.miracle.backend.models.services.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api")
public class CiudadController {


    @Autowired
    private CiudadService ciudadService;


    @GetMapping("/ciudad")
    public Ciudad findAll() {
        return ciudadService.findAll();
    }
}
