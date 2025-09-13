package com.TBLS.TicToque.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "paciente")
@Entity(name = "paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TicToquePaciente
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaciente;

    @Setter private String nome;
    @Setter private String email;
    @Setter private String senha;
    @Setter private String cpf;
    @Setter private int idade;
}
