package com.co.sofka.Controller;

import com.co.sofka.Model.Agenda;
import com.co.sofka.Model.Paciente;
import com.co.sofka.Service.AgendaService;
import com.co.sofka.Service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/agenda")
public class AgendaController {

    @Autowired
    private AgendaService agendaService;

    @PostMapping("/post")
    public ResponseEntity addAgenda(@RequestBody Agenda agenda) {
        agendaService.addAgenda(agenda);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{dia}")
    public ResponseEntity updateAgenda(@PathVariable String dia, @RequestBody Agenda agenda) {
        agendaService.updateAgenda(agenda);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{dia}")
    public ResponseEntity delAgenda(@PathVariable String dia) {
        agendaService.delAgenda(dia);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/get")
    public ResponseEntity<List<Agenda>> listAgendas() {
        return new ResponseEntity(agendaService.listAgendas(), HttpStatus.OK);
    }


}