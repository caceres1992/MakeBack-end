package com.make.miracle.backend.controllers;

import com.make.miracle.backend.models.domain.DetalleCarrera;
import com.make.miracle.backend.models.services.DetalleCarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/app")
public class DetalleCarreraController {


    @Autowired
    private DetalleCarreraService detalleCarreraService;


    @GetMapping("/detallecarreras")
    public List<DetalleCarrera> findAll() {
        return detalleCarreraService.findAll();
    }


    @GetMapping("/detallecarreras/")
    public List<DetalleCarrera> findByInstitucionNombre(@Param(value = "name") String name) {
        return detalleCarreraService.findByInstitucionNombre(name);
    }

}
