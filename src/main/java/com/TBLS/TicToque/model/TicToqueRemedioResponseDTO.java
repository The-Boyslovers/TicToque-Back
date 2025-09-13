package com.TBLS.TicToque.model;

import java.time.LocalDate;
import java.util.List;

public record TicToqueRemedioResponseDTO(Long idRemedio, String nome, String doenca, String tipo, LocalDate dataInicio, LocalDate dataFim, String dose, String descricao, List<TicToqueRemedioHorarioResponseDTO> horarios)
{
    public TicToqueRemedioResponseDTO(TicToqueRemedio remedio)
    {
        this(remedio.getIdRemedio(),remedio.getNome(), remedio.getDoenca(), remedio.getTipo(), remedio.getDataInicio(), remedio.getDataFim(), remedio.getDose(),remedio.getDescricao(), remedio.getHorarios().stream().map(TicToqueRemedioHorarioResponseDTO::new).toList());
    }
}
