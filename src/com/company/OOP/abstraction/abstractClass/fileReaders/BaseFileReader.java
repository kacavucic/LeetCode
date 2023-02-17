package com.company.OOP.abstraction.abstractClass.fileReaders;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public abstract class BaseFileReader {

    /*
    So, if we wanted to have several types of file readers, we might create an abstract class that encapsulates
    what's common to file reading.

    Note that we've made filePath protected so that the subclasses can access it if needed. More importantly,
    we've left something undone: how to actually parse a line of text from the file's contents. Our plan is
    simple: while our concrete classes don't each have a special way to store the file path or walk through the
    file, they will each have a special way to transform each line.

    At first sight, BaseFileReader may seem unnecessary. However, it's the foundation of a clean, easily extendable
    design. From it, we can easily implement different versions of a file reader that can focus on their unique
    business logic.
     */

    protected Path filePath;

    protected BaseFileReader(Path filePath) {
        this.filePath = filePath;
    }

    public Path getFilePath() {
        return filePath;
    }

    public List<String> readFile() throws IOException {
        return Files.lines(filePath)
                .map(this::mapFileLine).collect(Collectors.toList());
    }

    protected abstract String mapFileLine(String line);
}
