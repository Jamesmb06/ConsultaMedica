package com.co.sofka.Controller;

import com.co.sofka.Model.Paciente;
import com.co.sofka.Service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @PostMapping("")
    public ResponseEntity addPaciente(@RequestBody Paciente paciente) {
        pacienteService.addPaciente(paciente);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{cedula}")
    public ResponseEntity updatePaciente(@PathVariable String cedula, @RequestBody Paciente paciente) {
        pacienteService.updatePaciente(cedula, paciente);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{cedula}")
    public ResponseEntity delPaciente(@PathVariable String cedula) {
        pacienteService.delPaciente(cedula);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}