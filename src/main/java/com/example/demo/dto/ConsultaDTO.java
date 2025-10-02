package com.example.demo.dto;

import com.example.demo.service.StatusConsulta;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ConsultaDTO {

    private Long id;

    @NotBlank(message = "O paciente é Obrigatório")
    private PacienteDTO paciente;

    @NotBlank(message = "O médico é Obrigatório")
    private MedicoDTO medico;

    private LocalDateTime dataHora;

    private StatusConsulta status;

}
