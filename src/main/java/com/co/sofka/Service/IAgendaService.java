package com.co.sofka.Service;

import com.co.sofka.Model.Agenda;

import java.util.List;

public interface IAgendaService {

    List<Agenda> listAgendas();
    void addAgenda(Agenda agenda);

    void updateAgenda(Agenda agenda);

    void delAgenda(String id);

}
