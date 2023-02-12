package com.co.sofka.Repository;

import com.co.sofka.Model.Cita;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CitaRepository {

    private List<Cita> citas;

    public CitaRepository() {

        this.citas = new ArrayList<>();
    }
    public void addCita(Cita cita) {citas.add(cita);
    }

    public void updateCita(Cita cita) {
    }
    public void delCita(String id) {
        citas = citas.stream().filter(cita -> cita.getId().equals(id))
                .collect(Collectors.toList());

    }
    public List<Cita> getCita() {
        return citas;
    }

    public List<Cita> listCita() {
        return citas;
    }


}