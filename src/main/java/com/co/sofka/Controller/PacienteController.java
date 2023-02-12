package com.co.sofka.Controller;

import com.co.sofka.Model.Paciente;
import com.co.sofka.Service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @PostMapping("")
    public ResponseEntity addPaciente(@RequestBody Paciente paciente) {
        pacienteService.addPaciente(paciente);
        return new ResponseEntity(HttpStatus.CREATED);
    }

}
