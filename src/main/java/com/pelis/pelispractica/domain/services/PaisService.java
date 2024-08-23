package com.pelis.pelispractica.domain.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.pelis.pelispractica.domain.entities.Pais;

public interface PaisService {

    Page<Pais> findAll(Pageable pageable);

    Optional<Pais> findOneById(Long id);

    Pais save(Pais pais);
}
