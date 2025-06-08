
package com.fiap.safelink.controller;

import com.fiap.safelink.model.Abrigo;
import com.fiap.safelink.repository.AbrigoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/{id}")
    public ResponseEntity<Abrigo> buscarPorId(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Abrigo> atualizar(@PathVariable Long id, @RequestBody @Valid Abrigo abrigoAtualizado) {
        return repository.findById(id)
                .map(abrigo -> {
                    abrigo.setNome(abrigoAtualizado.getNome());
                    abrigo.setCapacidade(abrigoAtualizado.getCapacidade());
                    abrigo.setOcupacao(abrigoAtualizado.getOcupacao());
                    abrigo.setLocalizacao(abrigoAtualizado.getLocalizacao());
                    repository.save(abrigo);
                    return ResponseEntity.ok(abrigo);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        return repository.findById(id)
                .map(abrigo -> {
                    repository.delete(abrigo);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
