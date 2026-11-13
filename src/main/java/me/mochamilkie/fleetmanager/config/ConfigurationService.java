package me.mochamilkie.fleetmanager.config;

import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import me.mochamilkie.fleetmanager.config.FileReader;

import javax.naming.ConfigurationException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;

@Service
public class ConfigurationService {

    private final FileReader fileReader;
    private final YamlDeserializer deserializer;
    private final Configuration config;

    public ConfigurationService() throws IOException {
        this.fileReader = new FileReader();
        this.deserializer = new YamlDeserializer();
        config = load(Path.of("/FleetManager/config.yml"));
    }

    public Configuration load(Path path) throws IOException {
        String contents = fileReader.read(Path.of(path.toString()));

        Map<String, Object> values = deserializer.deserialize(contents);

        return new Configuration(values);
    }
    public void loadStorageType() throws ConfigurationException {
        config.getStorageMethod();
        //register storage type
    }

}
