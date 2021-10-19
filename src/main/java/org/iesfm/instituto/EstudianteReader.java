package org.iesfm.instituto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class EstudianteReader {

    private static final Logger log = LoggerFactory.getLogger(EstudianteReader.class);

    private Scanner scanner;

    public EstudianteReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Estudiante pideEstudiante() {

        log.info("Introduce el Nif");
        String nif = scanner.nextLine();
        log.info("Introduce el nombre");
        String nombre = scanner.nextLine();
        log.info("Introduce los apellidos");
        String apellidos = scanner.nextLine();

        return new Estudiante(nif, nombre, apellidos);
    }
}
