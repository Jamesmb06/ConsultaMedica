package com.co.sofka.Controller;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IController {

    ResponseEntity add(Object object);
    ResponseEntity update(Object object);
    ResponseEntity del(Object object);
    List<Object> getMostrar();

}
