package com.TBLS.TicToque.model;

public record TicToqueMedicoResponseDTO(Long idMedico, String nome, String email, String senha, String crm)
{
    public TicToqueMedicoResponseDTO(TicToqueMedico medico)
    {
        this(medico.getIdMedico(),medico.getNome(),medico.getEmail(),medico.getSenha(), medico.getCrm());
    }
}
