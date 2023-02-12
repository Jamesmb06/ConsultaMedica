package com.co.sofka.Controller;

import com.co.sofka.Model.Cita;
import com.co.sofka.Service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cita")
public class CitaController implements IController{

    @Autowired
    private CitaService citaService;

    @Override
    @PostMapping("/post")
    public ResponseEntity add(Object object) {
        citaService.addCita((Cita) object);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @Override
    @PutMapping("/{cedula}")
    public ResponseEntity update(@PathVariable Object object) {
        citaService.updateCita((Cita) object);
        return new ResponseEntity(HttpStatus.OK);
    }

    @Override
    @DeleteMapping("/{cedula}")
    public ResponseEntity del(@PathVariable Object object) {
        citaService.delCita((String) object);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @Override
    @GetMapping("/get")
    public List<Object> getMostrar() {
        return (List<Object>) new ResponseEntity(citaService.listCitas(), HttpStatus.OK);

    }
}
