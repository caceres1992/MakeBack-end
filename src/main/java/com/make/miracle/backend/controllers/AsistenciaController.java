package com.make.miracle.backend.controllers;

import com.make.miracle.backend.models.domain.Asistencia;
import com.make.miracle.backend.models.services.AsistenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = {"http://localhost:3000","https://makeamiracle.netlify.app"})
@RestController
@RequestMapping("/api")
public class AsistenciaController {

    @Autowired
    private AsistenciaService asistenciaService;

    @GetMapping("asistencias")
    public List<Asistencia> findAll()
    {
        return asistenciaService.findAll();
    }



    //Guardar Asistencia masiva
    @PostMapping("asistencias")
    public ResponseEntity<?> saveEntrada(@RequestBody List<Asistencia> asistencia){
        Map<String,Object> response = new HashMap<>();

        try {
              asistenciaService.saveAll(asistencia);
              response.put("msj : "," asistencia asignada correctamente");
              response.put("Estudiante total guardado : " , asistencia.size());


        }catch (DataAccessException e){
                response.put("msj " , "Error al realizar la peticion");
                response.put("err" , e.getMessage().concat(" : ").concat(e.getMostSpecificCause().getMessage()));
                return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }


        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    //Guardar Asistencia masiva
    @PutMapping("asistencias/{id}")
    public ResponseEntity<?> saveSalida(@PathVariable Long id){
        Map<String,Object> response = new HashMap<>();

        try {
            asistenciaService.Salida(id);
            response.put("msj : "," asistencia asignada correctamente");
            response.put("Estudiante total guardado : " , "");


        }catch (DataAccessException e){
            response.put("msj " , "Error al realizar la peticion");
            response.put("err" , e.getMessage().concat(" : ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }


        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }



}
