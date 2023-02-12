package com.co.sofka.Repository;

import com.co.sofka.Model.Paciente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Repository
public class PacienteRepository {
    private List<Paciente> pacientes;

    public PacienteRepository() {
        this.pacientes = new ArrayList<>();

    }
    public void addPaciente(Paciente paciente) {pacientes.add(paciente);
    }

    public void updatePaciente(Paciente paciente) {
        //Logica modificar
    }
    public void delPaciente(String cedula) {
        pacientes = pacientes.stream().filter(paciente -> paciente.getCedula().equals(cedula))
                .collect(Collectors.toList());


    }




}
