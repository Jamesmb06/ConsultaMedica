package com.co.sofka.Model;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Cita {

    private String id;
    private Paciente paciente;
    private LocalDateTime fechaHora;

    public Cita(String id, Paciente paciente, LocalDateTime fechaHora) {
        this.id = id;
        this.paciente = paciente;
        this.fechaHora = fechaHora;
    }
}
