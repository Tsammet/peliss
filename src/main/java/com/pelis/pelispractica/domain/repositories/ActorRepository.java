package com.pelis.pelispractica.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pelis.pelispractica.domain.entities.Actor;

public interface ActorRepository extends JpaRepository<Actor, Long> {

}
