package com.co.sofka.Service;
import com.co.sofka.Model.Agenda;
import com.co.sofka.Repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendaService implements IAgendaService {

    @Autowired
    private AgendaRepository agendaRepository;

    @Override
    public List<Agenda> listAgendas()  {
        return agendaRepository.listAgendas();
    }
    @Override
    public void addAgenda(Agenda agenda)  {
        agendaRepository.addAgenda(agenda);
    }

    @Override
    public void updateAgenda(Agenda agenda) {
        agendaRepository.updateAgenda(agenda);
    }

    @Override
    public void delAgenda(String id)  {
        agendaRepository.delAgenda(id);
    }
}


