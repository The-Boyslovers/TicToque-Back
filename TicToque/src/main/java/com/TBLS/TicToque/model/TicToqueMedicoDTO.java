package com.TBLS.TicToque.model;

public record TicToqueMedicoDTO(Long idMedico, String nome, String email, String senha, String crm)
{
    public TicToqueMedicoDTO(TicToqueMedico medico)
    {
        this(medico.getIdMedico(),medico.getNome(),medico.getEmail(),medico.getSenha(), medico.getCrm());
    }
}
