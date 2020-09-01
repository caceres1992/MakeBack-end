package com.make.miracle.backend.controllers;

import com.make.miracle.backend.models.domain.Institucion;

import com.make.miracle.backend.models.services.InstitutoService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class InstitutucionController {

    @Autowired
    private InstitutoService institutoService;

    @GetMapping("institucion")
    public List<Institucion> findAll() {
        return institutoService.findAll();
    }


    @GetMapping("institucion/")
    public List<Institucion> findBytipodeInstitucion(@Param(value = "name") String name) {
        return institutoService.findBytipodeInstitucion(name);

    }


}
