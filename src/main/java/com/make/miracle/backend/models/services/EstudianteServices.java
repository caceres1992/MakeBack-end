package com.make.miracle.backend.models.services;

import com.make.miracle.backend.models.repository.EstudianteRepository;
import com.make.miracle.backend.models.domain.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EstudianteServices {


    //injeccion
    @Autowired
    private EstudianteRepository estudianteRepository;




    public List<Estudiante> findTop5ByOrderByIdDesc() {
        return estudianteRepository.findTop5ByOrderByIdDesc();
    }

    //listar Estudiante with paginator

    public Page<Estudiante> findAll(Pageable pageable) {
        return estudianteRepository.findAll(pageable);
    }


    //Buscar Estudiante por id

    public Estudiante finById(Long id) {
        return estudianteRepository.findById(id).orElse(null);
    }


    //metodo Guardar Estudiante

    public Estudiante save(Estudiante estudiante) {
        Estudiante estudianteNuevo = estudianteRepository.save(estudiante);
        return estudianteNuevo;

    }

    //Update Estudiante

    public Estudiante update(Long id, Estudiante estudiante) {

        Estudiante estudianteUpdate = estudianteRepository.getOne(id);

        if (!estudiante.getDni().isEmpty()) estudianteUpdate.setDni(estudiante.getDni());
        if (!estudiante.getNombre().isEmpty()) estudianteUpdate.setNombre(estudiante.getNombre());
        if (!estudiante.getApellido().isEmpty()) estudianteUpdate.setApellido(estudiante.getApellido());
        if (!estudiante.getSexo().isEmpty()) estudianteUpdate.setSexo(estudiante.getSexo());
        if (estudiante.getFechaNac() != null) estudianteUpdate.setFechaNac(estudiante.getFechaNac());
         estudianteUpdate.setCorreo(estudiante.getCorreo());
         estudianteUpdate.setTelefono(estudiante.getTelefono());
         estudianteUpdate.setCodigoEstudiante(estudiante.getCodigoEstudiante());
         estudianteUpdate.setDireccion(estudiante.getDireccion());
         estudianteUpdate.setDistrito(estudiante.getDistrito());

        return estudianteUpdate;

    }
    //actualizar estado
    public Estudiante updateStatus(Long id) {
        Estudiante estudiante = estudianteRepository.getOne(id);
        estudiante.setEstado(!estudiante.getEstado());
        return estudiante;
    }
}
