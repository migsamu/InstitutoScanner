package org.iesfm.instituto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InstitutoReader {

    private static final Logger log = LoggerFactory.getLogger(EstudianteReader.class);


    private Scanner scanner;
    private GrupoReader grupoReader;

    public InstitutoReader(Scanner scanner, GrupoReader grupoReader) {
        this.scanner = scanner;
        this.grupoReader = grupoReader;
    }

    public Instituto pideInstituto() {
        log.info("Introduce el nombre del instituto");
        String nombre = scanner.nextLine();

        List<Grupo> grupos = new ArrayList<>();

        log.info("Introduce el numero de grupos que tiene el instituto");
        int numeroGrupos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numeroGrupos; i++) {
            grupos.add(grupoReader.pideGrupo());
        }

        return new Instituto(nombre,grupos);
    }

}
