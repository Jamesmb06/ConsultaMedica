package com.co.sofka.Service;
import com.co.sofka.Repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendaService implements IAgendaService {

    @Autowired
    private AgendaRepository agendaRepository;
}
