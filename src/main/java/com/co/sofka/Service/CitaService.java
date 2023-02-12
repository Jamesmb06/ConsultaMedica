package com.co.sofka.Service;

import com.co.sofka.Model.Cita;
import com.co.sofka.Model.Paciente;
import com.co.sofka.Repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaService implements ICitaService{

    @Autowired
    private CitaRepository citaRepository;

    @Override
    public List<Cita> listCitas() {
        return null;
    }

    @Override
    public void addCita(Cita cita) {

        citaRepository.addCita(cita);
    }

    @Override
    public void updateCita(Cita cita) {
        citaRepository.updateCita(cita);

    }

    @Override
    public void delCita(String id) {

    }
}
