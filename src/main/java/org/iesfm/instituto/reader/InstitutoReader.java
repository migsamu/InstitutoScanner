package org.iesfm.instituto.reader;

import org.iesfm.instituto.Grupo;
import org.iesfm.instituto.Instituto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InstitutoReader implements Reader<Instituto> {

    private static final Logger log = LoggerFactory.getLogger(EstudianteReader.class);

    private Scanner scanner;
    private GrupoReader grupoReader;
    private ScannerUtils scannerUtils;

    public InstitutoReader(Scanner scanner, GrupoReader grupoReader, ScannerUtils scannerUtils) {
        this.scanner = scanner;
        this.grupoReader = grupoReader;
        this.scannerUtils = scannerUtils;
    }

    @Override
    public Instituto read() {
        log.info("Introduce el nombre del instituto");
        String nombre = scanner.nextLine();

        List<Grupo> grupos = new ArrayList<>();

        log.info("Cuantos grupos tiene el instituto");
        int numeroGrupos = scannerUtils.readPositiveNumber();
        for (int i = 0; i < numeroGrupos; i++) {
            grupos.add(grupoReader.read());
        }

        return new Instituto(nombre, grupos);
    }

}
