package org.iesfm.instituto.anotations;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.iesfm.instituto.InstitutoJsonProgram;
import org.iesfm.instituto.reader.EstudianteReader;
import org.iesfm.instituto.reader.GrupoReader;
import org.iesfm.instituto.reader.InstitutoReader;
import org.iesfm.instituto.reader.ScannerUtils;
import org.iesfm.instituto.writer.InstitutoWriter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Scanner;

@Configuration
@PropertySource("aplication.properties")
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
        return new GrupoReader(scanner, estudianteReader, scannerUtils);
    }

    @Bean
    public InstitutoReader institutoReader(Scanner scanner, GrupoReader grupoReader, ScannerUtils scannerUtils) {
        return new InstitutoReader(scanner, grupoReader, scannerUtils);
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Bean
    public ScannerUtils scannerUtils(Scanner scanner) {
        return new ScannerUtils(scanner);
    }

    @Bean
    public InstitutoWriter institutoWriter(ObjectMapper mapper, @Value("${instituto.path}") String path) {
        return new InstitutoWriter(mapper, path);
    }

    @Bean
    public InstitutoJsonProgram institutoJsonProgram(InstitutoReader institutoReader, InstitutoWriter institutoWriter) {
        return new InstitutoJsonProgram(institutoReader, institutoWriter);
    }

}
