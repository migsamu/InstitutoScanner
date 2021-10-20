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
    private ScannerUtils scannerUtils;

    public GrupoReader(Scanner scanner, EstudianteReader estudianteReader, ScannerUtils scannerUtils) {
        this.scanner = scanner;
        this.estudianteReader = estudianteReader;
        this.scannerUtils = scannerUtils;
    }

    public Grupo pideGrupo() {

        log.info("Introduce la letra del grupo");
        String letra = scanner.nextLine();

        log.info("Introduce el curso");
        String curso = scanner.nextLine();

        log.info("Introduce el numero de alumnos que tiene el grupo");
        int numeroAlumnos = scannerUtils.readPositiveNumber("Introduce el numero de alumnos que tiene el grupo");
        List<Estudiante> estudiantes = new ArrayList<>();

        for (int i = 0; i < numeroAlumnos; i++) {
            Estudiante estudiante = estudianteReader.pideEstudiante();
            estudiantes.add(estudiante);
        }
        return new Grupo(letra, curso, estudiantes);
    }
}
