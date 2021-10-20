package org.iesfm.instituto.anotations;

import org.iesfm.instituto.EstudianteReader;
import org.iesfm.instituto.GrupoReader;
import org.iesfm.instituto.InstitutoReader;
import org.iesfm.instituto.ScannerUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class InstitutoScannerConfiguration {

    @Bean
    public EstudianteReader estudianteReader(Scanner scanner) {
        return new EstudianteReader(scanner);
    }

    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }

    @Bean
    public GrupoReader grupoReader(Scanner scanner, EstudianteReader estudianteReader, ScannerUtils scannerUtils) {
        return new GrupoReader(scanner, estudianteReader,scannerUtils);
    }


    @Bean
    public InstitutoReader institutoReader(Scanner scanner, GrupoReader grupoReader){
        return new InstitutoReader(scanner,grupoReader);
    }

    @Bean
    public ScannerUtils scannerUtils(Scanner scanner){
        return new ScannerUtils(scanner);
    }

}
