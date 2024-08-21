package com.pelis.pelispractica.domain.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.pelis.pelispractica.domain.entities.Actor;

public interface ActorService {

    Page<Actor> findAll(Pageable pageable);

    Optional<Actor> findOneById(Long id);

    Actor createOne(Actor actor);
    
    // Optional<Actor>delete(Long id);

}
