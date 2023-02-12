package com.co.sofka.Service;

import com.co.sofka.Model.Cita;

import java.util.List;

public interface ICitaService {

    List<Cita> listCitas();
    void addCita(Cita cita);

    void updateCita(Cita cita);

    void delCita(String id);

}
