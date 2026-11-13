package me.mochamilkie.fleetmanager.config;

import javax.naming.ConfigurationException;
import java.util.Locale;
import java.util.Map;

public record Configuration(Map<String, Object> values) {

    public Configuration {
        values = Map.copyOf(values);
    }
    public String getStorageMethod() throws ConfigurationException {
        String storageMethod = values.get("storageMethod").toString();
        if(!storageMethod.toLowerCase(Locale.ROOT).equals("h2") ||  !storageMethod.toLowerCase(Locale.ROOT).equals("sql")) {
            throw new ConfigurationException("Invalid storage method");
        }
        return storageMethod;
    }
}