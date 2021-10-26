package org.iesfm.instituto.writer;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.iesfm.instituto.Instituto;

import java.io.File;
import java.io.IOException;

public class InstitutoWriter {

    private ObjectMapper mapper;
    private String path;


    public InstitutoWriter(ObjectMapper mapper, String path) {
        this.mapper = mapper;
        this.path = path;
    }

    public void writer(Instituto instituto) {
        try {
            mapper.writeValue(new File(path),instituto);
        } catch (StreamWriteException e) {
            e.printStackTrace();
        } catch (DatabindException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*
f. Otro bean (InstitutoWriter) que guarda los datos de un instituto en un fichero json.

i. ObjectMapper

ii. El path al fichero (configurable)

g. El bean programa que pide un insittuto y lo guarda en un archivo json

i. InstitutoReader

ii. InstitutoWriter

En el main hay que crear el application context, recupra el bean principal.
* */
