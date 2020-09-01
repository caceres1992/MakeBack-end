package com.make.miracle.backend.controllers;

import com.make.miracle.backend.models.domain.Carrera;
import com.make.miracle.backend.models.services.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api")
public class CarreraController {

    @Autowired
    private CarreraService carreraService;

    @GetMapping("carrera")
    public List<Carrera> findAll() {
        return carreraService.findAll();
    }
}
