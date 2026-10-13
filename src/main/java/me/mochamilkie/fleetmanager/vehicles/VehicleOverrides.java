package me.mochamilkie.fleetmanager.vehicles;

import java.time.Year;
import java.util.Date;

public record VehicleOverrides (Year year,
                                String make,
                                String model,
                                String unitNumber,
                                Date lastServiced,
                                Date nextService,
                                int lastOilChange,
                                int nextOilChange){
}
