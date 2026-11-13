package me.mochamilkie.fleetmanager.config;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class FileReader {
    public String read(Path path) throws IOException {
        return Files.readString(path);
    }

}
