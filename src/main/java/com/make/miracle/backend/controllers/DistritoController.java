package com.make.miracle.backend.controllers;

import com.make.miracle.backend.models.domain.Distrito;
import com.make.miracle.backend.models.services.DistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000","https://makeamiracle.netlify.app"})
//@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api")
public class DistritoController {

    @Autowired
    private DistritoService distritoService;


    @GetMapping("/distritos")
    public List<Distrito>
    findAll()
    {
        return distritoService.findAll();
    }
}
