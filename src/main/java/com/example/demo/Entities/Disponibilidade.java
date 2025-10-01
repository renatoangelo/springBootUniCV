package com.example.demo.Entities;

import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Table(name = "disponibilidade")
public class Disponibilidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_dis")
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "medico_id", nullable = false)
	private Medico medico;
	
	@Column(name="diaSemana", nullable = false, length = 13)
	private String diaSemana;
	
	@Column(name="horarioinicio", nullable = false)
	private LocalTime horarioInicio;
	
	@Column(name="horarioFim", nullable = false)
	private LocalTime horarioFim;
	
}
