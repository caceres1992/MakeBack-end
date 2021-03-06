package com.make.miracle.backend.controllers;

import com.make.miracle.backend.models.domain.Beca;
import com.make.miracle.backend.models.services.BecaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = {"http://localhost:3000","https://makeamiracle.netlify.app"})
//@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api")
public class BecaController {

    @Autowired
    private BecaServices becaService;


    @GetMapping("/becas")
    public List<Beca> findAll() {
        return becaService.findAll();
    }

    @GetMapping("/becas/{id}")
    public Beca findById(@PathVariable Long id)
    {
        return becaService.finByid(id);
    }


    @GetMapping("/becas/top")
    public List<Beca> findTopBeca()
    {
        return becaService.findTopBeca();
    }








    @PostMapping("/becas")
    public ResponseEntity<?> save(@RequestBody Beca beca) {
        Map<String, Object> response = new HashMap<>();
        try {
            becaService.save(beca);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al Registrar la beca");
            response.put("error", e.getMessage().concat(" :").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje", "Beca Registrado con Exito");
        response.put("Beca del estudiante", beca.getEstudiante().getNombre());


        return new ResponseEntity<>(response, HttpStatus.CREATED);

    }


    @PutMapping("/becas/{id}")
    public ResponseEntity<?> update(@RequestBody Beca beca, @PathVariable Long id) {
        Map<String, Object> response = new HashMap<>();
        try {
            becaService.update(beca, id);
            response.put("message", "scholarship Updated with sponsor " + beca.getPatrocinador().getNombre());
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (DataAccessException e) {
            response.put("message ", "Error updating");
            response.put("error", e.getMessage().concat(" : ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }

    @PutMapping("/becas/final/{id}")
    public ResponseEntity<?> updateFinal(@RequestBody Beca beca, @PathVariable Long id) {
        Map<String, Object> response = new HashMap<>();
        try {
            becaService.finalizarBeca(beca, id);
            response.put("message", "scholarship final");
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (DataAccessException e) {
            response.put("message ", "Error updating");
            response.put("error", e.getMessage().concat(" : ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }



}
