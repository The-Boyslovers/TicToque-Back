package com.TBLS.TicToque.model;
import java.time.LocalDate;

public record TicToqueRemedioHorarioResponseDTO(Long idHorario,Long idRemedio, String tipo, String hora, int intervaloHoras)
{
    public TicToqueRemedioHorarioResponseDTO(TicToqueRemedioHorario remedio_horario)
    {
        this(remedio_horario.getIdHorario(), remedio_horario.getIdRemedio(), remedio_horario.getTipo(), remedio_horario.getHora(), remedio_horario.getIntervaloHoras());
    }
}