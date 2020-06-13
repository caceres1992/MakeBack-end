package com.make.miracle.backend.controllers;

import com.make.miracle.backend.models.entity.Ciudad;

import com.make.miracle.backend.models.entity.Estudiante;
import com.make.miracle.backend.models.entity.Pais;
import com.make.miracle.backend.models.entity.Patrocinador;
import com.make.miracle.backend.models.services.IPatrconadorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/app")
public class PatrocinadorControllers {

    @Autowired
    private IPatrconadorServices patrocinadorServices;
    @GetMapping("/patrocinadores")
    public List<Patrocinador> index (){

        return patrocinadorServices.findAll();
    }




    //metodo obtener informacion por id del patrocinador
    @GetMapping("/patrocinadores/{id}")
    public ResponseEntity<?> show(@PathVariable Long id) {
        Patrocinador patrocinador = null;
        Map<String, Object> response = new HashMap<>();
        try {
            patrocinador = patrocinadorServices.finById(id);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al Realizar la Consulta en la BD");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        //MANEJO DE ERROR EN CASO NO SE ENCUENTRE EL ID
        if (patrocinador == null) {
            response.put("mensaje", "El Patrocinador ID : ".concat(id.toString().concat("No Existe en la Base de datos")));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Patrocinador>(patrocinador, HttpStatus.OK);

    }
//metodo post es para hacer el insert
    @PostMapping("/patrocinadores")
    public ResponseEntity<?> create(@RequestBody Patrocinador patrocinador) {
        Patrocinador patrocinadorNew = null;
        Map<String, Object> response = new HashMap<>();

        try {
            patrocinadorNew = patrocinadorServices.save(patrocinador);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al Insertar datos en la BD");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);

        }

        response.put("mensaje", "El Patrocinador ah sido creado con exito");
        response.put("patrocinador", patrocinadorNew);

        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }
    @PutMapping("/patrocinadores/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Patrocinador update(@RequestBody Patrocinador patrocinador, @PathVariable Long id) {
        Patrocinador patrocinadorActual = patrocinadorServices.finById(id);
        patrocinadorActual.setPasaporte(patrocinador.getPasaporte());
        patrocinadorActual.setNombre(patrocinador.getNombre());
        patrocinadorActual.setApellido(patrocinador.getApellido());
        patrocinadorActual.setTelefono(patrocinador.getTelefono());
        patrocinadorActual.setCorreo(patrocinador.getCorreo());
        patrocinadorActual.setCiudad(patrocinador.getCiudad());


        return patrocinadorServices.save(patrocinadorActual);
    }


    //patrocinador cambiar estado de true a false o visebersa

    @PutMapping("/patrocinadores/estado/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Patrocinador delete(@PathVariable Long id) {
        Patrocinador estado = patrocinadorServices.finById(id);
        if (estado.getEstado()==true){
            estado.setEstado(false);
        } else {
            estado.setEstado(true);
        }

        return patrocinadorServices.save(estado);
    }


    //listado de paises
    @GetMapping("/patrocinadores/paises")
    public List<Pais> ListaPaises(){
        return patrocinadorServices.findAllPais();
    }


    //listado de ciudadades
    @GetMapping("/patrocinadores/paises/ciudades")
    public List<Ciudad> ListaCiudad(){
        return patrocinadorServices.findAllCiudad();
    }





}
