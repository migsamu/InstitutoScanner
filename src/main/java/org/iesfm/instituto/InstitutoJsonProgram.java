package org.iesfm.instituto;

import org.iesfm.instituto.reader.InstitutoReader;
import org.iesfm.instituto.writer.InstitutoWriter;

public class InstitutoJsonProgram {

    private InstitutoReader institutoReader;
    private InstitutoWriter institutoWriter;

    public InstitutoJsonProgram(InstitutoReader institutoReader, InstitutoWriter institutoWriter) {
        this.institutoReader = institutoReader;
        this.institutoWriter = institutoWriter;
    }

    public void execute() {
        Instituto instituto = institutoReader.read();
        institutoWriter.writer(instituto);
    }

}
