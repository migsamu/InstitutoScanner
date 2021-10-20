package org.iesfm.instituto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtils {

    private static final Logger log = LoggerFactory.getLogger(ScannerUtils.class);

    private Scanner scan;

    public ScannerUtils(Scanner scan) {
        this.scan = scan;
    }

    public int readNumber() {

        Integer numero = null;

        while (numero == null) {
            try {
                log.info("Introduce un numero");
                numero = scan.nextInt();
            } catch (InputMismatchException e) {
                log.error("Debe introducir un numero entero");
            } finally {
                scan.nextLine();
            }
        }
        return numero;
    }

    public int readPositiveNumber(String message) {

        int numero = readNumber();
        while (numero <= 0) {
            log.info(message + "Introduce un numero entero positivo");
            numero = scan.nextInt();
            scan.nextLine();
        }
        return numero;
    }
}
