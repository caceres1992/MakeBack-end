package com.make.miracle.backend.controllers;


import com.make.miracle.backend.models.entity.Distrito;
import com.make.miracle.backend.models.entity.Estudiante;
import com.make.miracle.backend.models.services.IEstudianteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.DataFormatException;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/app")
public class EstudianteControllers {

    @Autowired
    private IEstudianteServices estudianteservices;


    //Listar Estudiante
//    @Secured({"ROLE_ADMIN","ROLE_SUPERVISOR"})
    @GetMapping("/estudiantes")
    public List<Estudiante> index() {
        return estudianteservices.findAll();
    }

    @Secured({"ROLE_ADMIN"})
    @GetMapping("/estudiantes/{id}")
    public ResponseEntity<?> show(@PathVariable Long id) {
        Estudiante estudiante = null;
        Map<String, Object> response = new HashMap<>();
        try {
            estudiante = estudianteservices.finById(id);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al Realizar la Consulta en la BD");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        //MANEJO DE ERROR EN CASO NO SE ENCUENTRE EL ID
        if (estudiante == null) {
            response.put("mensaje", "El Estudiante ID : ".concat(id.toString().concat("No Existe en la Base de datos")));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Estudiante>(estudiante, HttpStatus.OK);

    }


    @Secured({"ROLE_ADMIN"})
    @PostMapping("/estudiantes")
    public ResponseEntity<?> create(@RequestBody Estudiante estudiante) {
        Estudiante estudianteNew = null;
        Map<String, Object> response = new HashMap<>();

        try {
            estudianteNew = estudianteservices.save(estudiante);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al Insertar datos en la BD");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);

        }

        response.put("mensaje", "El estudiante ah sido creado con exito");
        response.put("estudiante", estudianteNew);

        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }


    @Secured({"ROLE_ADMIN"})
    @PutMapping("/estudiantes/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Estudiante update(@RequestBody Estudiante estudiante, @PathVariable Long id) {
        Estudiante estudianteactual = estudianteservices.finById(id);
        estudianteactual.setDni(estudiante.getDni());
        estudianteactual.setNombre(estudiante.getNombre());
        estudianteactual.setApellido(estudiante.getApellido());
        estudianteactual.setSexo(estudiante.getSexo());
        estudianteactual.setFechaNac(estudiante.getFechaNac());
        estudianteactual.setDireccion(estudiante.getDireccion());
        estudianteactual.setTelefono(estudiante.getTelefono());
        estudianteactual.setDistrito(estudiante.getDistrito());

        return estudianteservices.save(estudianteactual);
    }


    @Secured({"ROLE_ADMIN"})
    @PutMapping("/estudiantes/estado/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Estudiante delete(@PathVariable Long id) {
        Estudiante estado = estudianteservices.finById(id);
        if (estado.getEstado() == true) {
            estado.setEstado(false);
        } else {
            estado.setEstado(true);
        }

        return estudianteservices.save(estado);
    }


    @Secured({"ROLE_ADMIN"})
    @GetMapping("/estudiantes/distritos")
    public List<Distrito> listarDistritos() {
        return estudianteservices.findAllDistrito();

    }
}
