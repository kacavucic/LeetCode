package com.company.OOP.abstraction.abstractClass.application;
import com.company.OOP.abstraction.abstractClass.fileReaders.BaseFileReader;
import com.company.OOP.abstraction.abstractClass.fileReaders.LowercaseFileReader;
import com.company.OOP.abstraction.abstractClass.fileReaders.UppercaseFileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Application {

    public static void main(String[] args) throws IOException, URISyntaxException {
        Application application = new Application();
        Path path = application.getPathFromResourcesFile("files/test.txt");
        BaseFileReader lowercaseFileReader = new LowercaseFileReader(path);
        lowercaseFileReader.readFile().forEach(line -> System.out.println(line));

        BaseFileReader uppercaseFileReader = new UppercaseFileReader(path);
        uppercaseFileReader.readFile().forEach(line -> System.out.println(line));
    }

    private Path getPathFromResourcesFile(String filePath) throws URISyntaxException {
        return Paths.get(getClass().getClassLoader().getResource(filePath).toURI());

    }
}
