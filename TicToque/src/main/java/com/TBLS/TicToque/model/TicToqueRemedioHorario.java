package com.TBLS.TicToque.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Table(name = "remedio_horario")
@Entity(name = "remedio_horario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class TicToqueRemedioHorario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHorario;

    @Setter private Long idRemedio;
    @Setter private String tipo;
    @Setter private String hora;
    @Setter private int intervaloHoras;

    public TicToqueRemedioHorario(TicToqueRemedioHorarioRequestDTO data)
    {
        this.idRemedio = data.idRemedio();
        this.tipo = data.tipo();
        this.hora = data.hora();
        this.intervaloHoras = data.intervaloHoras();
    }

}
