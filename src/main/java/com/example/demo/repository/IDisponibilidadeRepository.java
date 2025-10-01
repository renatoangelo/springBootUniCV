package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Disponibilidade;

public interface IDisponibilidadeRepository extends JpaRepository<Disponibilidade, Long>{

	List<Disponibilidade> findByMedicoId(Long medicoId);
}
