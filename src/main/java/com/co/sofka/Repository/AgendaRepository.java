package com.co.sofka.Repository;

import com.co.sofka.Model.Agenda;
import com.co.sofka.Model.Paciente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class AgendaRepository {

    private List<Agenda> agendas;

    public AgendaRepository() {

        this.agendas = new ArrayList<>();
    }
    public void addAgenda(Agenda agenda) {agendas.add(agenda);
    }

    public void updateAgenda(Agenda agenda) {
    }
    public void delAgenda(String id) {
        agendas = agendas.stream().filter(agenda -> agenda.getId().equals(id))
                .collect(Collectors.toList());

    }
    public List<Agenda> getAgendas() {
        return agendas;
    }

    public List<Agenda> listAgendas() {
        return agendas;
    }


}

