package me.mochamilkie.fleetmanager.storage;

import me.mochamilkie.fleetmanager.config.Configuration;
import me.mochamilkie.fleetmanager.config.ConfigurationService;
import org.springframework.stereotype.Service;

import javax.naming.ConfigurationException;

@Service
public class StorageService {
    static StorageService storageService;
    private final String storageType;
    private final LocalStorageWorker localStorageWorker;
    private final RemoteStorageWorker remoteStorageWorker;

    public StorageService(LocalStorageWorker localStorageWorker, RemoteStorageWorker remoteStorageWorker) throws ConfigurationException {
        storageService = this;
        this.storageType = ConfigurationService.loadStorageType();
        this.localStorageWorker = localStorageWorker;
        this.remoteStorageWorker =  remoteStorageWorker;
    }

    public void storeData(DataPacket packet) throws ConfigurationException {
        if (storageType.equalsIgnoreCase("h2")) {
            localStorageWorker.saveData(packet);
            return;
        }
        if (storageType.equalsIgnoreCase("sql")) {
            remoteStorageWorker.saveData(packet);
            return;
        }
        throw new ConfigurationException("There was a problem with the configuration");
    }
    public void getData(DataRequest dataRequest) throws ConfigurationException {
        if(storageType.equalsIgnoreCase("h2")){
            localStorageWorker.requestData(dataRequest);
            return;
        }
        if(storageType.equalsIgnoreCase("sql")){
            remoteStorageWorker.requestData(dataRequest);
            return;
        }
        throw new ConfigurationException("There was a problem with the configuration");

        //same thing here
    }

    public static StorageService getInstance() {
        return storageService;
    }
}
