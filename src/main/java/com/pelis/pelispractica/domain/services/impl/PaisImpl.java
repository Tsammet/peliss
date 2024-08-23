package com.pelis.pelispractica.domain.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pelis.pelispractica.domain.entities.Pais;
import com.pelis.pelispractica.domain.repositories.PaisRepository;
import com.pelis.pelispractica.domain.services.PaisService;


@Service
public class PaisImpl implements PaisService{

    @Autowired
    private PaisRepository paisRepository;

    @Override
    public Page<Pais> findAll(Pageable pageable){
        return paisRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Pais> findOneById(Long id){
        return paisRepository.findById(id);
    }

    @Override
    public Pais save(Pais pais) {
        return paisRepository.save(pais);
    }

}
