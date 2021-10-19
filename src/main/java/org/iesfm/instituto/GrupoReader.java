package org.iesfm.instituto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GrupoReader {

    private static final Logger log = LoggerFactory.getLogger(EstudianteReader.class);

    private Scanner scanner;
    private EstudianteReader estudianteReader;

    public GrupoReader(Scanner scanner, EstudianteReader estudianteReader) {
        this.scanner = scanner;
        this.estudianteReader = estudianteReader;
    }


    public Grupo pideGrupo() {

        log.info("Introduce la letra del grupo");
        String letra = scanner.nextLine();
        log.info("Introduce el curso");
        int curso = scanner.nextInt();
        scanner.nextLine();

        log.info("Introduce el numero de alumnos que tiene el grupo");
        int numeroAlumnos = scanner.nextInt();
        scanner.nextLine();

        List<Estudiante> estudiantes = new ArrayList<>();

        for (int i = 0; i < numeroAlumnos; i++) {
            Estudiante estudiante = estudianteReader.pideEstudiante();
            estudiantes.add(estudiante);
        }

        //TODO crear un pideEnteroPositivoReader como beans
        return new Grupo(letra, curso, estudiantes);
    }
}
