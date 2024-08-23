package com.pelis.pelispractica.web.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pelis.pelispractica.domain.entities.Actor;
import com.pelis.pelispractica.domain.services.ActorService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/actor")
public class ActorController {

    @Autowired
    private ActorService actorService;

    @GetMapping("/all")
    public ResponseEntity<Page<Actor>> findAll(Pageable pageable){
        Page<Actor> actorPage = actorService.findAll(pageable);

        if (actorPage.hasContent()) {
            return ResponseEntity.ok(actorPage);
        }

        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Actor> view(@PathVariable Long id){
        Optional<Actor> actorOpt = actorService.findOneById(id);
        if(actorOpt.isPresent()){
            return ResponseEntity.ok(actorOpt.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Actor> create(@Valid @RequestBody Actor actor){
        Actor actornew = actorService.save(actor);
        return ResponseEntity.status(HttpStatus.CREATED).body(actornew);
    }

}
