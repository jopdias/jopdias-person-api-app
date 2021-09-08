package com.digitalinnovationone.gerenciadordepessoas.repository;

import com.digitalinnovationone.gerenciadordepessoas.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}
