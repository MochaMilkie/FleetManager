package me.mochamilkie.fleetmanager.storage;

import org.springframework.stereotype.Component;

@Component
public class RemoteStorageWorker implements DataRequest{
    @Override
    public DataPacket requestData(DataRequest request) {
        return null;
    }

    @Override
    public boolean saveData(DataPacket packet) {
        return false;
    }
}
