package com.pelis.pelispractica.web.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pelis.pelispractica.domain.entities.Pais;
import com.pelis.pelispractica.domain.services.PaisService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/pais")
public class PaisController {

    @Autowired
    private PaisService paisService;

    @GetMapping("/all")
    public ResponseEntity<Page<Pais>> findAll(Pageable pageable){
        Page<Pais> paisPage = paisService.findAll(pageable);

        if (paisPage.hasContent()) {
            return ResponseEntity.ok(paisPage);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pais> view(@PathVariable Long id){
        Optional<Pais> paisOpt = paisService.findOneById(id);
        if (paisOpt.isPresent()) {
            return ResponseEntity.ok(paisOpt.orElseThrow()); 
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Pais> creaEntity(@Valid @RequestBody Pais pais){
        Pais paisnew = paisService.save(pais);
        return ResponseEntity.status(HttpStatus.CREATED).body(paisnew);
    }

}
