package com.TBLS.TicToque.model;
import java.time.LocalDate;

public record TicToqueRemedioHorarioResponseDTO(Long idHorario,Long idRemedio, String tipo, String hora, Integer intervaloHoras)
{
    public TicToqueRemedioHorarioResponseDTO(TicToqueRemedioHorario remedio_horario)
    {
        this(remedio_horario.getIdHorario(), remedio_horario.getRemedio().getIdRemedio(), remedio_horario.getTipo(), remedio_horario.getHora(), remedio_horario.getIntervaloHoras());
    }
}