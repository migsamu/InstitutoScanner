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
    private ScannerUtils scannerUtils;

    public InstitutoReader(Scanner scanner, GrupoReader grupoReader, ScannerUtils scannerUtils) {
        this.scanner = scanner;
        this.grupoReader = grupoReader;
        this.scannerUtils = scannerUtils;
    }

    public Instituto pideInstituto() {
        log.info("Introduce el nombre del instituto");
        String nombre = scanner.nextLine();

        List<Grupo> grupos = new ArrayList<>();

        log.info("Cuantos grupos tiene el instituto");
        int numeroGrupos = scannerUtils.readPositiveNumber("Introduce el numero de grupos que tiene el centro");
        for (int i = 0; i < numeroGrupos; i++) {
            grupos.add(grupoReader.pideGrupo());
        }

        return new Instituto(nombre, grupos);
    }

}
