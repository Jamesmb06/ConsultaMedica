package com.co.sofka.Repository;

import com.co.sofka.Model.Paciente;
import org.springframework.stereotype.Repository;
import java.util.HashSet;
import java.util.Set;

@Repository
public class PacienteRepository {
    private Set<Paciente> listaPaciente;

    public PacienteRepository() {
        listaPaciente = new HashSet<>();

    }
    public void addPaciente(Paciente paciente) {
        listaPaciente.add(paciente);
    }

    public void updatePaciente(Paciente paciente) {
        //Logica modificar
    }

    public void delPaciente(String cedula) {
        //logica borrar


    }


}
