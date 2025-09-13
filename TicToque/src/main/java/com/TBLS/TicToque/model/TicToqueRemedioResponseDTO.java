package com.TBLS.TicToque.model;

import java.time.LocalDate;

public record TicToqueRemedioResponseDTO(Long idRemedio, String nome, String doenca, String tipo_tratamento, String horario, LocalDate dataInicio, LocalDate dataFim, String dose, String descricao)
{
    public TicToqueRemedioResponseDTO(TicToqueRemedio remedio)
    {
        this(remedio.getIdRemedio(),remedio.getNome(), remedio.getDoenca(), remedio.getTipo_tratamento(), remedio.getHorario(), remedio.getDataInicio(), remedio.getDataFim(), remedio.getDose(),remedio.getDescricao());
    }
}
