package com.projetojpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojpa.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	//Query Methods
	List<Aluno> findByCidade(String cidade);
	List<Aluno> findByRa(String ra);

}
