package com.projetojpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojpa.entities.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Long> {
	
}
