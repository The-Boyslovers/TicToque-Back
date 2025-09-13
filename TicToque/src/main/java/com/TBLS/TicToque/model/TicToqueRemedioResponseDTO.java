package com.TBLS.TicToque.model;

import java.time.LocalDate;

public record TicToqueRemedioResponseDTO(Long idRemedio, String nome, String doenca, String tipo, LocalDate dataInicio, LocalDate dataFim, String dose, String descricao)
{
    public TicToqueRemedioResponseDTO(TicToqueRemedio remedio)
    {
        this(remedio.getIdRemedio(),remedio.getNome(), remedio.getDoenca(), remedio.getTipo(), remedio.getDataInicio(), remedio.getDataFim(), remedio.getDose(),remedio.getDescricao());
    }
}
