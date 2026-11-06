package me.mochamilkie.fleetmanager.config;

import org.springframework.stereotype.Service;

@Service
public class ConfigService {
    static ConfigService instance;
    public ConfigService() {
        instance = this;
    }
    public static ConfigService getInstance() {
        return instance;
    }
}
