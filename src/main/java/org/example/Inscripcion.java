package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


public class Inscripcion{

    private List<Materia> materiasACursar;
    private Boolean fueAprobadaLaInscripcion;
    private Alumno alumno;

    public void agregarAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public boolean aprobada(){
        this.fueAprobadaLaInscripcion = alumno.puedeCursarTodasMaterias(materiasACursar);
        return fueAprobadaLaInscripcion;
    }

    public Inscripcion(){
        materiasACursar = new ArrayList<Materia>();
        this.fueAprobadaLaInscripcion = null;
    }
    public void agregarMateriaACursar(Materia materia) {
        materiasACursar.add(materia);
    }


}