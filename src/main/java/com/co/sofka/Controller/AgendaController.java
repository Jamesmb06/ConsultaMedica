package com.co.sofka.Controller;

import com.co.sofka.Model.Agenda;
import com.co.sofka.Service.AgendaService;
import com.co.sofka.Service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/agenda")
public class AgendaController {

    @Autowired
    private AgendaService agendaService;

    /*@PostMapping("")
    public ResponseEntity addAgenda(@RequestBody Agenda agenda) {
        agendaService.addAgenda(agenda);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{dia}")
    public ResponseEntity updateAgenda(@PathVariable String dia, @RequestBody Agenda agenda) {
        agendaService.updateAgenda(dia, agenda);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{dia}")
    public ResponseEntity delAgenda(@PathVariable String dia) {
        agendaService.delAgenda(dia);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

     */
}