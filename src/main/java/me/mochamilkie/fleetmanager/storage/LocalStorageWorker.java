package me.mochamilkie.fleetmanager.storage;

public class LocalStorageWorker extends StorageService implements DataRequest{
    @Override
    public DataPacket requestData(DataRequest request) {
        return null;
    }

    @Override
    public boolean saveData(DataPacket packet) {
        return false;
    }
}
