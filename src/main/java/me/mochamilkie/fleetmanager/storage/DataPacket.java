package me.mochamilkie.fleetmanager.storage;

import me.mochamilkie.fleetmanager.vehicles.VIN;

import java.util.UUID;

public record DataPacket() {
    static String unitNumber;
    static String year;
    static String make;
    static String model;
    static VIN vin;
}
