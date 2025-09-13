package com.TBLS.TicToque.controller;

import com.TBLS.TicToque.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TicToqueController
{
    @Autowired
    private TicToqueMedicoRepository medicoRepository;
    @Autowired
    private TicToquePacienteRepository pacienteRepository;
    @Autowired
    private TicToqueRemedioRepository remedioRepository;

    @GetMapping("/m")
    public List<TicToqueMedicoDTO> getAllMedico()
    {
        List<TicToqueMedicoDTO> medicoList = medicoRepository.findAll().stream().map(TicToqueMedicoDTO::new).toList();
        return medicoList;
    }

    @GetMapping("/p")
    public List<TicToquePaciente> getAllPaciente()
    {
        List<TicToquePaciente> pacienteList = pacienteRepository.findAll();
        return pacienteList;
    }
    @GetMapping("/r")
    public List<TicToqueRemedio> getAllRemedio()
    {
        List<TicToqueRemedio> remedioList = remedioRepository.findAll();
        return remedioList;
    }
}
