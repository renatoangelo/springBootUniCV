package com.example.demo.dto;

import java.time.LocalTime;

import com.example.demo.Entities.Medico;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DisponibilidadeDTO {

	private Long id_dis;
	
	@NotBlank(message = "O Medico é Obrigatório")
	private MedicoDTO medico;	
	
	@NotBlank(message = "Dia da Semana obrigatório")
	private String diaSemana;
	
	@NotBlank(message = "Adicione o Horário Inicial")
	private LocalTime horarioInicio;
	
	@NotBlank(message = "Adicione o Horário Final")
	private LocalTime horarioFim;
}
