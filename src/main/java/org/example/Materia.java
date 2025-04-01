package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class Materia {
    private String nombreMateria;

    private List<Materia> correlativas;

    public Materia(){
        correlativas = new ArrayList<Materia>();
    }

    public void agregarNombreMateria(String unNombre) {
        this.nombreMateria = unNombre;
    }

    public void agregarCorrelativa(Materia unaCorrelativa) {
        correlativas.add(unaCorrelativa);
    }

    public boolean aproboMisCorrelativas(Alumno alumno) {
        return alumno.aprobasteEstasCorrelativas(this.getCorrelativas());
    }

}
