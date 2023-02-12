package com.co.sofka.Model;

import lombok.Data;

import java.util.List;
@Data
public class Historial {
    private String id;
    private Paciente paciente;
    private List<Cita> citas;
    private List<String> notas;

    public Historial(String id, Paciente paciente, List<Cita> citas, List<String> notas) {
        this.id = id;
        this.paciente = paciente;
        this.citas = citas;
        this.notas = notas;
    }
}
