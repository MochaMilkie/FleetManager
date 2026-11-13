package me.mochamilkie.fleetmanager.config;

import org.yaml.snakeyaml.Yaml;

import java.util.Map;

public class YamlDeserializer {

    public Map<String, Object> deserialize(String contents) {
        Yaml yaml = new Yaml();

        Map<String, Object> values = yaml.load(contents);

        return values == null ? Map.of() : values;
    }
}