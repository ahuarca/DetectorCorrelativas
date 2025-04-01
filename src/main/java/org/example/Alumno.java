import lombok.Getter;
import lombok.Setter;
import org.example.Materia;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter

public class Alumno {

    private String nombre;
    private String apellido;
    private List<Materia> materiasAprobadas;

    public Alumno (){
        materiasAprobadas = new ArrayList<Materia>();
    }

    public void agregarMateriaAprobada(Materia materia) {
        materiasAprobadas.add(materia);
    }

    public boolean puedeCursarTodasMaterias(List<Materia> unasMaterias) {
        return unasMaterias.stream().allMatch(m -> m.aproboMisCorrelativas(this));
    }

    public boolean aprobasteEstasCorrelativas( List<Materia> correlativas) {
        return correlativas.stream().allMatch(m -> this.getMateriasAprobadas().contains(m));
    }
}




