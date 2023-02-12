package com.co.sofka.Service;

import com.co.sofka.Model.Paciente;

import java.util.List;

public interface IPacienteService {

    List<Paciente> listPacientes();
    void addPaciente(Paciente paciente);

    void updatePaciente(Paciente paciente);

    void delPaciente(String cedula);

}
