package com.co.sofka.Service;

import com.co.sofka.Model.Paciente;
import com.co.sofka.Repository.HistorialRepository;
import com.co.sofka.Repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService implements IPacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;
    @Autowired
    private HistorialRepository historialRepository;

    @Override
    public void addPaciente(Paciente paciente) {
        pacienteRepository.addPaciente(paciente);
    }

    @Override
    public void updatePaciente(Paciente paciente) {

    }

    @Override
    public void delPaciente(String cedula) {

    }
}
