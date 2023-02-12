package com.co.sofka.Controller;

import com.co.sofka.Model.Cita;
import com.co.sofka.Model.Historial;
import com.co.sofka.Service.HistorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/historial")
public class HistorialController implements IController{

    @Autowired
    private HistorialService historialService;

    @Override
    @PostMapping("/post")
    public ResponseEntity add(Object object) {
        historialService.addHistorial((Historial) object);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @Override
    @PutMapping("/{cedula}")
    public ResponseEntity update(@PathVariable Object object) {
        historialService.updateHistorial((Historial) object);
        return new ResponseEntity(HttpStatus.OK);
    }

    @Override
    @DeleteMapping("/{cedula}")
    public ResponseEntity del(@PathVariable Object object) {
        historialService.delHistorial((String) object);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @Override
    @GetMapping("/get")
    public List<Object> getMostrar() {
        return (List<Object>) new ResponseEntity(historialService.listHistoriales(), HttpStatus.OK);

    }

}
