package org.iesfm.instituto;

import org.iesfm.instituto.reader.EstudianteReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Objects;


public class Grupo {
    private static final Logger log = LoggerFactory.getLogger(EstudianteReader.class);

    private String letra;
    private String curso;
    private List<Estudiante> estudiantes;

    public Grupo(String letra, String curso, List<Estudiante> estudiantes) {

        this.letra = letra;
        this.curso = curso;
        this.estudiantes = estudiantes;
    }


    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grupo grupo = (Grupo) o;
        return curso == grupo.curso && Objects.equals(letra, grupo.letra) && Objects.equals(estudiantes, grupo.estudiantes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(letra, curso, estudiantes);
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "letra='" + letra + '\'' +
                ", curso=" + curso +
                ", estudiantes=" + estudiantes +
                '}';
    }
}
