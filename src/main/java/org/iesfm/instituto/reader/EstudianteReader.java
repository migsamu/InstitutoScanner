package org.iesfm.instituto.reader;

import org.iesfm.instituto.Estudiante;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class EstudianteReader implements Reader<Estudiante> {

    private static final Logger log = LoggerFactory.getLogger(EstudianteReader.class);

    private Scanner scanner;

    public EstudianteReader(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Estudiante read() {

        log.info("Introduce el Nif");
        String nif = scanner.nextLine();
        log.info("Introduce el nombre");
        String nombre = scanner.nextLine();
        log.info("Introduce los apellidos");
        String apellidos = scanner.nextLine();

        return new Estudiante(nif, nombre, apellidos);
    }
}
