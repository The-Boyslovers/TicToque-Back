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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idRemedio")
    @Setter private TicToqueRemedio remedio;

    @Setter private String tipo;
    @Setter private String hora;
    @Setter private Integer intervaloHoras;

    public TicToqueRemedioHorario(TicToqueRemedioHorarioRequestDTO data)
    {
        this.tipo = data.tipo();
        this.hora = data.hora();
        this.intervaloHoras = (data.intervaloHoras() != null) ? data.intervaloHoras() : 0;
    }

}
