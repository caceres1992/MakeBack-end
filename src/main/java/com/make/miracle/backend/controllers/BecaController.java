package com.make.miracle.backend.controllers;

import com.make.miracle.backend.models.entity.Beca;
import com.make.miracle.backend.models.services.IBecaService;
import org.hibernate.exception.DataException;
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
public class BecaController {

    @Autowired
    private IBecaService becaService;


    @GetMapping("/becas")
    public List<Beca> findAll() {
        return becaService.findAll();
    }


    @PostMapping("/becas")
    public ResponseEntity<?> save(@RequestBody Beca beca) {

        Map<String, Object> response = new HashMap<>();
        try {
            becaService.save(beca);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al Registrar la beca");
            response.put("error", e.getMessage().concat(" :").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje", "Beca Registrado con Exito");
        response.put("Beca del estudiante", beca.getEstudiante().getNombre());


        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);

    }

    @PutMapping("/becas/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Beca update(@RequestBody Beca beca, @PathVariable Long id) {
        Beca becaUpdate = becaService.finByid(id);
        becaUpdate.setPatrocinador(beca.getPatrocinador());
        return becaService.update(becaUpdate);

    }

}
