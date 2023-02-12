package com.co.sofka.Model;

import lombok.Data;

@Data
public class Paciente {

    private String nombre;
    private String apellido;
    private String telefono;
    private String cedula;


    public Paciente(String nombre, String apellido, String telefono, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.cedula = cedula;
    }
}
