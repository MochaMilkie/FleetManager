package me.mochamilkie.fleetmanager.storage;

import me.mochamilkie.fleetmanager.vehicles.VIN;

import java.time.Year;

public abstract class PacketBuilder {
    public DataPacket buildDataPacket(String unitNumber, Year year, String make, String model, VIN vin){
        return new DataPacket(unitNumber, year, make, model, vin);
    }
    public boolean verifyDataPacket(DataPacket packet){
        if(packet == null) return false;
        if(packet.unitNumber() == null) return false;
        if(packet.vin() == null) return false;
        if(packet.year() == null) return false;
        if(packet.make() == null) return false;
        if(packet.model() == null) return false;


        return true;
    }
}
