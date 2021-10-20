package org.iesfm.instituto.anotations;

import org.iesfm.instituto.EstudianteReader;
import org.iesfm.instituto.Grupo;
import org.iesfm.instituto.GrupoReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(EstudianteReader.class);


    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(InstitutoScannerConfiguration.class);
        GrupoReader programa = context.getBean(GrupoReader.class);
        Grupo grupo = programa.pideGrupo();

        log.info(grupo.toString());

    }
}
/*1. Crea un proyecto que use Spring Framework que nos permita pedir los datos de un instituto:

a. Un bean de tipo Scanner

b. Un bean StudentReader. Este bean tendrá un método que al ser invocado pide al usuario los datos de un estudiante y
lo devuelve. Un estudiante tiene los siguientes campos: nif, nombre y apellidos

c. Un bean GroupReader. Este bean tendrá un método que al ser invocado pide los datos de un grupo y lo devuelve.
Un grupo tiene: letra, curso y una lista de estudiantes.

d. Un bean InstitutoReader. Este bean tendrá un método que al ser invocado pide los datos de un instituto y lo devuelve.
 Un instituto tiene: nombre y una lista de grupos.
En el main hay que crear el application context, pedir un estudiante e imprimirlo en pantalla.*/