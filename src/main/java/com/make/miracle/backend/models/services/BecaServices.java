package com.make.miracle.backend.models.services;

import com.make.miracle.backend.models.repository.BecaRepostiry;
import com.make.miracle.backend.models.domain.Beca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class BecaServices {

    @Autowired
    private BecaRepostiry becaRepostiry;


    public List<Beca> findAll() {
        return (List<Beca>) becaRepostiry.findAll();
    }


    public Beca finByid(Long id) {


        return becaRepostiry.findById(id).orElse(null);
    }

    public Beca save(Beca beca) {
        Beca nuevaBeca = becaRepostiry.save(beca);
        return nuevaBeca;
    }

    public Beca update(Beca beca, Long id) {
        Beca becaUpdate = becaRepostiry.getOne(id);
        becaUpdate.setPatrocinador(beca.getPatrocinador());
        return becaRepostiry.save(beca);
    }
}
