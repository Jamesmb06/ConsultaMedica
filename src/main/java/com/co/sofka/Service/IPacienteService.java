package com.co.sofka.Service;

import com.co.sofka.Model.Paciente;

public interface IPacienteService {

    void addPaciente(Paciente paciente);

    void updatePaciente(Paciente paciente);

    void delPaciente(String cedula);

}
