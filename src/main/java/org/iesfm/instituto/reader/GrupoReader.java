package org.iesfm.instituto.reader;

import org.iesfm.instituto.Estudiante;
import org.iesfm.instituto.Grupo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GrupoReader implements Reader<Grupo> {

    private static final Logger log = LoggerFactory.getLogger(EstudianteReader.class);

    private Scanner scanner;
    private EstudianteReader estudianteReader;
    private ScannerUtils scannerUtils;

    public GrupoReader(Scanner scanner, EstudianteReader estudianteReader, ScannerUtils scannerUtils) {
        this.scanner = scanner;
        this.estudianteReader = estudianteReader;
        this.scannerUtils = scannerUtils;
    }

    @Override
    public Grupo read() {

        log.info("Introduce la letra del grupo");
        String letra = scanner.nextLine();

        log.info("Introduce el curso");
        String curso = scanner.nextLine();

        log.info("Introduce el numero de alumnos que tiene el grupo");
        int numeroAlumnos = scannerUtils.readPositiveNumber();
        List<Estudiante> estudiantes = new ArrayList<>();

        for (int i = 0; i < numeroAlumnos; i++) {
            Estudiante estudiante = estudianteReader.read();
            estudiantes.add(estudiante);
        }
        return new Grupo(letra, curso, estudiantes);
    }
}
