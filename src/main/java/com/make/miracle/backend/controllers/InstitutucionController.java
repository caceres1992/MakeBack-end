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

@CrossOrigin(origins = {"http://localhost:3000","https://makeamiracle.netlify.app"})
@RestController
@RequestMapping("/api")
public class InstitutucionController {

    @Autowired
    private InstitutoService institutoService;

    @GetMapping("institucion")
    public List<Institucion> findAll() {
        return institutoService.findAll();
    }


//http://localhost:8080/api/institucion/?name=UNIVERSIDAD || INSTITUTO
    @GetMapping("institucion/")
    public List<Institucion> findBytipodeInstitucion(@Param(value = "name") String name) {
        return institutoService.findBytipodeInstitucion(name);

    }

    //http://localhost:8080/api/institucion/UNIVERSIDAD || INSTITUTO
    @GetMapping("institucion/{institucion}")
    public ResponseEntity<?> CountByTipodeInstitucion(@PathVariable String institucion) {
        Map<String,Object>response= new HashMap<>();
        try {

             response.put("total",institutoService.countInstituciones(institucion));
        }
        catch (DataAccessException e){
            response.put("msj",e.getMessage().concat("/ ")
                    .concat(e.getMostSpecificCause().getMessage()));
            response.put("Error","Error en la peticion");

            return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(response,HttpStatus.OK);
    }


    @PostMapping("institucion")
    public ResponseEntity<?> saveAllInstitutciones(@RequestBody List<Institucion> institucions) {
        Map<String,Object> response = new HashMap<>();
        try {
                    institutoService.saveAllInstitutciones(institucions);
                    response.put("msj","Creado con exito " + institucions.size() + "institutcion(es)");
                    response.put("success" , "success");

        }catch (DataAccessException e){
                    response.put("msj",e.getMessage().concat("/ ")
                            .concat(e.getMostSpecificCause().getMessage()));
                    response.put("Error","Error en la peticion");

                    return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);

        }
        return new ResponseEntity<>(response,HttpStatus.CREATED);

    }

    @PutMapping("institucion/{id}")
    public ResponseEntity<?> updateInstitutcion(@PathVariable Long id, @RequestBody Institucion institucions) {

        Map<String,Object> response = new HashMap<>();
        try {
            institutoService.update(institucions,id);
            response.put("msj","actualizado con exito " + institucions.getNombre());
            response.put("success" , "success");

        }catch (DataAccessException e){
            response.put("msj",e.getMessage().concat("/ ")
                    .concat(e.getMostSpecificCause().getMessage()));
            response.put("Error","Error en la peticion");

            return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);

        }
        return new ResponseEntity<>(response,HttpStatus.CREATED);

    }

}
