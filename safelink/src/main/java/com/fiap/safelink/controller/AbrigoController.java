
package com.fiap.safelink.controller;

import com.fiap.safelink.model.Abrigo;
import com.fiap.safelink.repository.AbrigoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/abrigos")
public class AbrigoController {

    @Autowired
    private AbrigoRepository repository;

    @GetMapping
    public Page<Abrigo> listar(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @PostMapping
    public Abrigo criar(@RequestBody @Valid Abrigo abrigo) {
        return repository.save(abrigo);
    }
}
