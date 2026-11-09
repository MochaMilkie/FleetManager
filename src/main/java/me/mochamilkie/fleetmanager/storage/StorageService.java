package me.mochamilkie.fleetmanager.storage;

import org.springframework.stereotype.Service;

@Service
public class StorageService {
    static StorageService storageService;
    public StorageService() {
        storageService = this;
    }

    public void storeData(DataPacket packet) {
        //determine what method to use before attempting to store or load data
        //then send that data to the correct worker
    }
    public void getData(DataRequest dataRequest) {
        //same thing here
    }

    public static StorageService getInstance() {
        return storageService;
    }
}
