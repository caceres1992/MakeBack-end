package com.make.miracle.backend.models.repository;

import com.make.miracle.backend.models.domain.Beca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;


public interface BecaRepostiry extends JpaRepository<Beca, Long> {



        @Query(value = "select * from Becas as  b where b.estado='F'  order  by b.FECHA_CULMINADO desc ",nativeQuery = true)
        List<Beca>findTopBeca();


}
