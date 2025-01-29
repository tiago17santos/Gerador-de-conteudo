package com.IC.Gerador_Poesias.controller;

import com.IC.Gerador_Poesias.entities.Poesia;
import com.IC.Gerador_Poesias.repository.PoesiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/poesias")
public class PoesiaController {

    @Autowired
    private PoesiaRepository poesiaRepository;

    @PostMapping
    public Poesia criarPoesia(@RequestBody Poesia poesia) {
        return poesiaRepository.save(poesia);
    }

    @GetMapping
    public List<Poesia> listarPoesias() {
        return poesiaRepository.findAll();
    }
}
