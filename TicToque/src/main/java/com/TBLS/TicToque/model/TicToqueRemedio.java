package com.TBLS.TicToque.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Table(name = "remedio")
@Entity(name = "remedio")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TicToqueRemedio
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRemedio;

    @Setter private String descricao;
    @Setter private String dose;
    @Setter private String nome;
    @Setter private String doenca;
    @Setter private String tipo_tratamento;
    @Setter private String horario;
    @Setter private LocalDate dataInicio;
    @Setter private LocalDate dataFim;
}
