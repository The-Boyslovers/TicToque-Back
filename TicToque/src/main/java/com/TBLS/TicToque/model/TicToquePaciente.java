package com.TBLS.TicToque.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "paciente")
@Entity(name = "paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class TicToquePaciente
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaciente;

    @Setter private String nome;
    @Setter private String email;
    @Setter private String senha;
    @Setter private String cpf;
    @Setter private int idade;

    public TicToquePaciente(TicToquePacienteRequestDTO data)
    {
        this.nome = data.nome();
        this.email = data.email();
        this.senha = data.senha();
        this.cpf = data.cpf();
        this.idade = data.idade();
    }
}
