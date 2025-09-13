package com.TBLS.TicToque.model;

import java.time.LocalDate;

public record TicToqueRemedioRequestDTO(String nome, String doenca, String tipo_tratamento, String horario, LocalDate dataInicio, LocalDate dataFim, String dose, String descricao) {}
