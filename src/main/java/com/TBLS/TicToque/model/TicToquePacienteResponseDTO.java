package com.TBLS.TicToque.model;

public record TicToquePacienteResponseDTO(Long idPaciente, String nome, String email, String senha, String cpf, int idade)
{
    public TicToquePacienteResponseDTO(TicToquePaciente paciente)
    {
        this(paciente.getIdPaciente(),paciente.getNome(),paciente.getEmail(),paciente.getSenha(), paciente.getCpf(), paciente.getIdade());
    }
}
