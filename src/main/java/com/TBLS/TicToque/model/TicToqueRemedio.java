package com.TBLS.TicToque.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Table(name = "remedio")
@Entity(name = "remedio")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class TicToqueRemedio
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRemedio;

    @Setter private String descricao;
    @Setter private String dose;
    @Setter private String nome;
    @Setter private String doenca;
    @Setter private String tipo;
    @Setter private LocalDate dataInicio;
    @Setter private LocalDate dataFim;

    @OneToMany(mappedBy = "remedio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TicToqueRemedioHorario> horarios = new ArrayList<>();

     public TicToqueRemedio(TicToqueRemedioRequestDTO data)
    {
        this.nome = data.nome();
        this.dose = data.dose();
        this.doenca = data.doenca();
        this.tipo = data.tipo();
        this.dataInicio = data.dataFim();
        this.descricao = data.descricao();
    }
}
