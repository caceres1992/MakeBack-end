package com.make.miracle.backend.models.services;

import com.make.miracle.backend.models.entity.Beca;

import java.util.List;

public interface IBecaService {

    public List<Beca> findAll();

    public Beca finByid(Long id);

    public Beca save(Beca beca);

    public Beca update(Beca beca);
}
