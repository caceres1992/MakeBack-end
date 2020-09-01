package com.make.miracle.backend.controllers;

import com.make.miracle.backend.models.domain.Pais;
import com.make.miracle.backend.models.services.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api")
public class PaisController {

    @Autowired
    private PaisService paisService;

    @GetMapping("paises")
    public Pais findAll(){
        return paisService.findAll();
    }

}
