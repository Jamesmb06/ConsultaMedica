package com.co.sofka.Model;

import lombok.Data;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class Agenda {

    private String id;
    private String disponibilidad;
    private LocalDateTime fecha;
    private String descripcion;
    private String capacidad;
    List<Paciente> paciente;

    public Agenda(String id, String disponibilidad, LocalDateTime fecha, String descripcion, String capacidad, List<Paciente> paciente) {

        this.id = id;
        this.disponibilidad = disponibilidad;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.capacidad = capacidad;
        this.paciente = new ArrayList<>();
    }
}

