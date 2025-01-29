package com.IC.Gerador_Poesias.repository;

import com.IC.Gerador_Poesias.entities.Poesia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoesiaRepository extends JpaRepository<Poesia, Long> {
    // Não é necessário escrever código SQL para as operações básicas
    // O Spring Data JPA vai implementar automaticamente métodos como:
    // save(), findById(), findAll(), deleteById(), etc.
}
