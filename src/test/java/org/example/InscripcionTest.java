package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {
    @Test
    @DisplayName("La inscripción es aprobada correctamente")
    public void validarInscripcion() {

        //creo una instancia de la clase Inscripcion
        Inscripcion inscripcion1 = new Inscripcion();

        //creo una instancia de la clase Alumno
        Alumno alumno1 = new Alumno();

        //le asigno el alumno a la inscripcion
        inscripcion1.agregarAlumno(alumno1);

        //creo instancias de la clase Materia
        Materia disenio = new Materia();
        Materia fisica2 = new Materia();
        Materia baseDeDatos = new Materia();
        Materia algoritmos = new Materia();
        Materia paradigmas = new Materia();
        Materia fisica1 = new Materia();
        Materia discreta = new Materia();
        Materia analisisSistemas = new Materia();
        Materia sistemasProcesos = new Materia();
        Materia sintaxis = new Materia();
        Materia ingles2 = new Materia();

        //agrego las materias a las que se quiere inscribir el alumno
        inscripcion1.agregarMateriaACursar(disenio);
        inscripcion1.agregarMateriaACursar(fisica2);
        inscripcion1.agregarMateriaACursar(baseDeDatos);

        //cargo los atributos de la instancia de ALumno
        alumno1.setApellido("Sola");
        alumno1.setNombre("Jose");
        alumno1.agregarMateriaAprobada(algoritmos);
        alumno1.agregarMateriaAprobada(paradigmas);
        alumno1.agregarMateriaAprobada(fisica1);
        alumno1.agregarMateriaAprobada(discreta);
        alumno1.agregarMateriaAprobada(analisisSistemas);
        alumno1.agregarMateriaAprobada(sintaxis);
        alumno1.agregarMateriaAprobada(ingles2);
        alumno1.agregarMateriaAprobada(sistemasProcesos);

        //cargo los atributos de las Materias a inscribirse
        disenio.setNombreMateria("DisenioDeSistema");
        disenio.agregarCorrelativa(algoritmos);
        disenio.agregarCorrelativa(discreta);
        disenio.agregarCorrelativa(paradigmas);
        disenio.agregarCorrelativa(sistemasProcesos);
        disenio.agregarCorrelativa(ingles2);

        fisica2.setNombreMateria("FisicaDos");
        fisica2.agregarCorrelativa(fisica1);

        baseDeDatos.setNombreMateria("BaseDeDatos");
        baseDeDatos.agregarCorrelativa(sintaxis);
        baseDeDatos.agregarCorrelativa(algoritmos);
        baseDeDatos.agregarCorrelativa(analisisSistemas);
        baseDeDatos.agregarCorrelativa(discreta);


        Assertions.assertTrue(inscripcion1.aprobada());

    }

    @Test
    @DisplayName("La inscripción no es aprobada correctamente")
    public void validarQueLaInscripcionNoSeAprueba() {

        //creo una instancia de la clase Inscripcion
        Inscripcion inscripcion2 = new Inscripcion();

        //creo una instancia de la clase Alumno
        Alumno alumno2 = new Alumno();

        //le asigno el alumno a la inscripcion
        inscripcion2.agregarAlumno(alumno2);

        //creo instancias de la clase Materia
        Materia disenio = new Materia();
        Materia fisica2 = new Materia();
        Materia baseDeDatos = new Materia();
        Materia algoritmos = new Materia();
        Materia paradigmas = new Materia();
        Materia fisica1 = new Materia();
        Materia discreta = new Materia();
        Materia analisisSistemas = new Materia();
        Materia sistemasProcesos = new Materia();
        Materia sintaxis = new Materia();
        Materia ingles2 = new Materia();

        //agrego las materias a las que se quiere inscribir el alumno
        inscripcion2.agregarMateriaACursar(disenio);
        inscripcion2.agregarMateriaACursar(fisica2);
        inscripcion2.agregarMateriaACursar(baseDeDatos);

        //cargo los atributos de la instancia de Alumno, que no aprobo Ingles2, entonces no puede hacer Diseño
        alumno2.setApellido("Marks");
        alumno2.setNombre("Jack");
        alumno2.agregarMateriaAprobada(algoritmos);
        alumno2.agregarMateriaAprobada(paradigmas);
        alumno2.agregarMateriaAprobada(fisica1);
        alumno2.agregarMateriaAprobada(discreta);
        alumno2.agregarMateriaAprobada(analisisSistemas);
        alumno2.agregarMateriaAprobada(sintaxis);
        alumno2.agregarMateriaAprobada(sistemasProcesos);

        //cargo los atributos de las Materias a inscribirse
        disenio.setNombreMateria("DisenioDeSistema");
        disenio.agregarCorrelativa(algoritmos);
        disenio.agregarCorrelativa(discreta);
        disenio.agregarCorrelativa(paradigmas);
        disenio.agregarCorrelativa(sistemasProcesos);
        disenio.agregarCorrelativa(ingles2);

        fisica2.setNombreMateria("FisicaDos");
        fisica2.agregarCorrelativa(fisica1);

        baseDeDatos.setNombreMateria("BaseDeDatos");
        baseDeDatos.agregarCorrelativa(sintaxis);
        baseDeDatos.agregarCorrelativa(algoritmos);
        baseDeDatos.agregarCorrelativa(analisisSistemas);
        baseDeDatos.agregarCorrelativa(discreta);


        Assertions.assertFalse(inscripcion2.aprobada());

    }


}