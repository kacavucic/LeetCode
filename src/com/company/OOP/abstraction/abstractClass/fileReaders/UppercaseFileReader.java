package com.company.OOP.abstraction.abstractClass.fileReaders;

import java.nio.file.Path;

public class UppercaseFileReader extends BaseFileReader {

    /*
    As we can see from this simple example, each subclass can focus on its unique behavior without needing to specify
    other aspects of file reading.
     */

    public UppercaseFileReader(Path filePath) {
        super(filePath);
    }

    @Override
    protected String mapFileLine(String line) {
        return line.toUpperCase();
    }
}
