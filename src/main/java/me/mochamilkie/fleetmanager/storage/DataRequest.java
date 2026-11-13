package me.mochamilkie.fleetmanager.storage;

import java.util.UUID;

public interface DataRequest{
    DataPacket requestData(DataRequest request);

    boolean saveData(DataPacket packet);

}
