package com.make.miracle.backend.controllers;

import com.make.miracle.backend.models.domain.Carrera;
import com.make.miracle.backend.models.services.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/app")
public class CarreraController {

    @Autowired
    private CarreraService carreraService;

    @GetMapping("carrera")
    public List<Carrera> findAll() {
        return carreraService.findAll();
    }
}
