package com.co.sofka.Controller;

import com.co.sofka.Model.Paciente;
import com.co.sofka.Service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @PostMapping("/post")
    public ResponseEntity addPaciente(@RequestBody Paciente paciente) {
        pacienteService.addPaciente(paciente);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{cedula}")
    public ResponseEntity updatePaciente(@RequestBody Paciente paciente) {
        pacienteService.updatePaciente(paciente);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{cedula}")
    public ResponseEntity delPaciente(@PathVariable String cedula) {
        pacienteService.delPaciente(cedula);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    @GetMapping("/get")
    public ResponseEntity<List<Paciente>> listPacientes() {
        return new ResponseEntity(pacienteService.listPacientes(), HttpStatus.OK);

    }

}