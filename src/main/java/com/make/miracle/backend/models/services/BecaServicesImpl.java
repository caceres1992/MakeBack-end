package com.make.miracle.backend.models.services;

import com.make.miracle.backend.models.dao.IBecaDao;
import com.make.miracle.backend.models.entity.Beca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BecaServicesImpl implements IBecaService {

    @Autowired
    private IBecaDao becaDao;


    @Override
    @Transactional(readOnly = true)
    public List<Beca> findAll() {
        return (List<Beca>) becaDao.findAll();
    }

    @Override
    public Beca finByid(Long id) {


        return becaDao.findById(id).orElse(null);
    }

    @Override
    public Beca save(Beca beca) {
        Beca nuevaBeca = becaDao.save(beca);

        return nuevaBeca;
    }

    @Override

    @Transactional
    public Beca update(Beca beca) {
        return becaDao.save(beca);
    }
}
