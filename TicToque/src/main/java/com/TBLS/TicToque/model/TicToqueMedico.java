package com.TBLS.TicToque.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Table(name = "medico")
@Entity(name = "medico")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class TicToqueMedico
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedico;

    @Setter private String nome;
    @Setter private String email;
    @Setter private String senha;
    @Setter private String crm;

    public TicToqueMedico(TicToqueMedicoRequestDTO data)
    {
        this.nome = data.nome();
        this.email = data.email();
        this.senha = data.senha();
        this.crm = data.crm();
    }
}
