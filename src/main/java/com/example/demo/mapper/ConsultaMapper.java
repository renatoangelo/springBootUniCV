package com.example.demo.mapper;

import com.example.demo.Entities.Consulta;
import com.example.demo.dto.ConsultaDTO;

public interface ConsultaMapper {

    ConsultaDTO toDTO (Consulta consulta);

    Consulta toEntity (ConsultaDTO consultaDTO);
}
