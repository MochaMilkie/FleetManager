package me.mochamilkie.fleetmanager.vehicles;

import me.mochamilkie.fleetmanager.VIN;

import java.time.Year;
import java.util.Date;

public record VehicleOverrides (VIN vin,
                                Year year,
                                String make,
                                String model,
                                String unitNumber,
                                Date lastServiced,
                                Date nextService,
                                int lastOilChange,
                                int nextOilChange){
}
