package org.iesfm.instituto;

import java.util.List;
import java.util.Objects;

public class Instituto {

    private String nombre;
    private List<Grupo> grupos;

    public Instituto(String nombre, List<Grupo> grupos) {
        this.nombre = nombre;
        this.grupos = grupos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instituto instituto = (Instituto) o;
        return Objects.equals(nombre, instituto.nombre) && Objects.equals(grupos, instituto.grupos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, grupos);
    }

    @Override
    public String toString() {
        return "Instituto{" +
                "nombre='" + nombre + '\'' +
                ", grupos=" + grupos +
                '}';
    }
}
