package com.co.sofka.Service;

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
}
