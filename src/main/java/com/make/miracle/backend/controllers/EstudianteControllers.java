package com.make.miracle.backend.controllers;


import com.make.miracle.backend.models.domain.Estudiante;
import com.make.miracle.backend.models.services.EstudianteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


import java.util.*;

@CrossOrigin(origins = {"http://localhost:3000","https://makeamiracle.netlify.app"})
//@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api")
public class EstudianteControllers {

    @Autowired
    private EstudianteServices estudianteservices;


    //Listar Estudiante
//    @Secured({"ROLE_ADMIN","ROLE_SUPERVISOR"})
    @GetMapping("/estudiantes")
    public ResponseEntity<Page<Estudiante>> findAll(Pageable pageable) {
        return ResponseEntity.status(HttpStatus.OK).body(estudianteservices.findAll(pageable));
    }



    @GetMapping("/estudiantes/{id}")
    public ResponseEntity<?> show(@PathVariable Long id) {
        Estudiante estudiante;
        Map<String, Object> response = new HashMap<>();
        try {
            estudiante = estudianteservices.finById(id);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al Realizar la Consulta en la BD");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        if (estudiante == null) {
            response.put("mensaje", "El Estudiante ID : ".concat(id.toString().concat("No Existe en la Base de datos")));
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(estudiante, HttpStatus.OK);

    }


    @PostMapping("/estudiantes")
    public ResponseEntity<?> create(@RequestBody Estudiante estudiante) {

        Map<String, Object> response = new HashMap<>();
        try {
            estudianteservices.save(estudiante);
            response.put("mensaje", "El estudiante ah sido creado con exito ");
            response.put("estudiante", estudiante.getNombre() + " Welcome");
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al Insertar datos en la BD");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }



    @PutMapping("/estudiantes/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Estudiante estudiante) {
        Map<String, Object> respo = new HashMap<>();
        try {
            estudianteservices.update(id, estudiante);
            respo.put("estudiante ", estudiante.getNombre() + " actualizado ");
        } catch (DataAccessException e) {
            respo.put("Error en la bd", "Error");
            respo.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<>(respo, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(respo, HttpStatus.OK);

    }

    @PutMapping("/estudiantes/estado/{id}")
    public ResponseEntity<?> updateStatus(@PathVariable Long id) {
        Map<String, Object> response = new HashMap<>();
        try {
            estudianteservices.updateStatus(id);
            response.put("Status", "estado actualizado");
        } catch (DataAccessException e) {
            response.put("Status", "Error al Realizar la consulta");
            response.put("Error", e.getMessage().concat(" ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @GetMapping("/estudiantes/top")
    public List<Estudiante> findTop3ByOrderByIdDesc() {
        return estudianteservices.findTop5ByOrderByIdDesc();
    }


}
