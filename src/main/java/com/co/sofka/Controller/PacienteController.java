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
public class PacienteController implements IController {

    @Autowired
    private PacienteService pacienteService;

    @Override
    @PostMapping("/post")
    public ResponseEntity add(Object object) {
        pacienteService.addPaciente((Paciente) object);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @Override
    @PutMapping("/{cedula}")
    public ResponseEntity update(@PathVariable Object object) {
        pacienteService.updatePaciente((Paciente) object);
        return new ResponseEntity(HttpStatus.OK);
    }

    @Override
    @DeleteMapping("/{cedula}")
    public ResponseEntity del(@PathVariable Object object) {
        pacienteService.delPaciente((String) object);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @Override
    @GetMapping("/get")
    public List<Object> getMostrar() {
        return (List<Object>) new ResponseEntity(pacienteService.listPacientes(), HttpStatus.OK);

    }
}
