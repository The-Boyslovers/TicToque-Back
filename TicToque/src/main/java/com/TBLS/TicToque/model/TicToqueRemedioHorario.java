package com.TBLS.TicToque.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "remedio_horario")
@Entity(name = "remedio_horario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class TicToqueRemedioHorario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRemedioHorario;

    @Setter private long id_remedio;
    @Setter private String tipo;
    @Setter private int hora;
    @Setter private int intervaloHoras;
}

public TicToqueRemedioHorario(TicToqueRemedioHorarioRequestDTO data){
    this.tipo = data.tipo();
    this.hora = data.hora();
    this.intervaloHoras = data.intervaloHoras();
}
