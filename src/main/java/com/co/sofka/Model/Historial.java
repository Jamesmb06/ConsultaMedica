package com.co.sofka.Model;

import lombok.Data;

import java.util.List;
@Data
public class Historial {
    private String descripcion;

    public Historial(String descripcion) {
        this.descripcion = descripcion;
    }
}
