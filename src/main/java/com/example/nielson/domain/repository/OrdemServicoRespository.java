package com.example.nielson.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nielson.domain.model.OrdemServico;

@Repository
public interface OrdemServicoRespository extends JpaRepository<OrdemServico, Long>{

}
