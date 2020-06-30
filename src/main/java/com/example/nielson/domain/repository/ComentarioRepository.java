package com.example.nielson.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nielson.domain.model.Comentario;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
	
}
