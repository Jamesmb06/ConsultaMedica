package com.co.sofka.Controller;

import com.co.sofka.Service.AgendaService;
import com.co.sofka.Service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class AgendaController {

    @Autowired
    private AgendaService agendaService;
}