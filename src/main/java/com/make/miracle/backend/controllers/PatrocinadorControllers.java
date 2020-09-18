package com.make.miracle.backend.controllers;

import com.make.miracle.backend.models.domain.Patrocinador;
import com.make.miracle.backend.models.services.PatrocinadorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = {"http://localhost:3000","https://makeamiracle.netlify.app"})
//@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api")
public class PatrocinadorControllers {

    @Autowired
    private PatrocinadorServices patrocinadorServices;


    // Listado de Patrocinador con Paginator
    @GetMapping("/patrocinadores")
    public ResponseEntity<Page<Patrocinador>> index(Pageable pageable) {
        return ResponseEntity.status(HttpStatus.OK).body(patrocinadorServices.findAll(pageable));
    }


    //metodo obtener informacion por id del patrocinador
    @GetMapping("/patrocinadores/{id}")
    public Patrocinador show(@PathVariable Long id) {
return patrocinadorServices.finById(id);
    }


    //metodo post es para hacer el insert
    @PostMapping("/patrocinadores")
    public ResponseEntity<?> create(@RequestBody Patrocinador patrocinador) {
        Map<String, Object> response = new HashMap<>();
        try {
            patrocinadorServices.save(patrocinador);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al Insertar datos en la BD");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje", "El Patrocinador ah sido creado con exito");
        response.put("patrocinador ", patrocinador.getNombre() + "welcome ");

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    //actualizar Patrocinador
    @PutMapping("/patrocinadores/{id}")
    public ResponseEntity<?> update(@RequestBody Patrocinador patrocinador, @PathVariable Long id) {
        Map<String, Object> response = new HashMap<>();
        try {

            patrocinadorServices.Update(patrocinador, id);
            response.put("patrocinado", patrocinador.getNombre() + " actualizado ");
            response.put("msj", "actualizacion exitosa");

        } catch (DataAccessException e) {
            response.put("Patrocinador", "Error al actualizar en la bd");
            response.put("Error", e.getMessage().concat("_").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(response, HttpStatus.CREATED);


    }


    //patrocinador cambiar estado de true a false o visebersa
    @PutMapping("/patrocinadores/estado/{id}")
    public ResponseEntity<?> statusUpdate(@PathVariable Long id) {
        Map<String, Object> response = new HashMap<>();
        try {
            patrocinadorServices.statusUpdate(id);
            response.put("Patrocinador ", "estado actualizado");
        } catch (DataAccessException e) {
            response.put("msj", "Error al realizar la peticion");
            response.put("Error", e.getMessage().concat("_").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @GetMapping("/patrocinadores/top")
    public List<Patrocinador> findTop5ByOrderByIdDesc() {
        return patrocinadorServices.findTop5ByOrderByIdDesc();
    }

}
