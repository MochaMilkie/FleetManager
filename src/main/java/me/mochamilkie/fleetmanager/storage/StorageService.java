package me.mochamilkie.fleetmanager.storage;

import org.springframework.stereotype.Service;

@Service
public class StorageService {
    static StorageService storageService;
    public StorageService() {
        storageService = this;
    }


    public static StorageService getInstance() {
        return storageService;
    }
}
