package com.TBLS.TicToque.controller;

import com.TBLS.TicToque.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class TicToqueController
{
    @Autowired
    private TicToqueMedicoRepository medicoRepository;
    @Autowired
    private TicToquePacienteRepository pacienteRepository;
    @Autowired
    private TicToqueRemedioRepository remedioRepository;
    @Autowired
    private TicToqueRemedioHorarioRepository remedioHorarioRepository;

    @PostMapping("/mD")
    public void saveMedico(@RequestBody TicToqueMedicoRequestDTO data)
    {
        TicToqueMedico medicoData = new TicToqueMedico(data);
        medicoRepository.save(medicoData);
        return;
    }

    @GetMapping("/m")
    public List<TicToqueMedicoResponseDTO> getAllMedico()
    {
        List<TicToqueMedicoResponseDTO> medicoList = medicoRepository.findAll().stream().map(TicToqueMedicoResponseDTO::new).toList();
        return medicoList;
    }

    @PostMapping("/pD")
    public void savePaciente(@RequestBody TicToquePacienteRequestDTO data)
    {
        TicToquePaciente pacienteData = new TicToquePaciente(data);
        pacienteRepository.save(pacienteData);
        return;
    }

    @GetMapping("/p")
    public List<TicToquePacienteResponseDTO> getAllPaciente()
    {
        List<TicToquePacienteResponseDTO> pacienteList = pacienteRepository.findAll().stream().map(TicToquePacienteResponseDTO::new).toList();
        return pacienteList;
    }

    @PostMapping("/rD")
    public void saveRemedio(@RequestBody TicToqueRemedioRequestDTO data)
    {
        TicToqueRemedio remedioData = new TicToqueRemedio(data);
        remedioRepository.save(remedioData);
        return;
    }

    @GetMapping("/r")
    public List<TicToqueRemedioResponseDTO> getAllRemedio()
    {
        List<TicToqueRemedioResponseDTO> remedioList = remedioRepository.findAll().stream().map(TicToqueRemedioResponseDTO::new).toList();
        return remedioList;
    }

    @PostMapping("/rhD")
    public void saveRemedioHorario(@RequestBody TicToqueRemedioHorarioRequestDTO data)
    {
        TicToqueRemedio remedio = remedioRepository.findById(data.idRemedio())
                .orElseThrow(() -> new IllegalArgumentException("Remedio not found"));
        TicToqueRemedioHorario remedioHorarioData = new TicToqueRemedioHorario(data);
        remedioHorarioData.setRemedio(remedio);
        remedioHorarioRepository.save(remedioHorarioData);
    }

    @GetMapping("/rh")
    public List<TicToqueRemedioHorarioResponseDTO> getAllRemedioHorario()
    {
        List<TicToqueRemedioHorarioResponseDTO> remedioHorarioList = remedioHorarioRepository.findAll().stream().map(TicToqueRemedioHorarioResponseDTO::new).toList();
        return remedioHorarioList;
    }
}
