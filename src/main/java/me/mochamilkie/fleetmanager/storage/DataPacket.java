package me.mochamilkie.fleetmanager.storage;

import me.mochamilkie.fleetmanager.vehicles.VIN;

import java.time.Year;

public record DataPacket(String unitNumber, Year year, String make, String model, VIN vin){}
