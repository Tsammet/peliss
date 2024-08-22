package com.pelis.pelispractica.domain.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pelis.pelispractica.domain.entities.Actor;
import com.pelis.pelispractica.domain.repositories.ActorRepository;
import com.pelis.pelispractica.domain.services.ActorService;


@Service
public class ActorImpl implements ActorService {

    @Autowired
    private ActorRepository actorRepository;

    @Override
    public Page<Actor> findAll(Pageable pageable){
        return actorRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Actor> findOneById(Long Id){
        return actorRepository.findById(Id);
    }

    @Override
    public Actor save(Actor actor) {
        return actorRepository.save(actor);
    }

    // @Override
    // public Optional<Actor> delete(Long id) {
    //     Optional<Actor> actorOpt = repository.findById(id);
    //     return actorRepository.delete(id);

    // }




}
