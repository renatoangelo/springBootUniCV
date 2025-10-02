package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Consulta;

public interface IConsultaRepository extends JpaRepository<Consulta, Long> {

}
