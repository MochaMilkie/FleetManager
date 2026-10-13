package me.mochamilkie.fleetmanager.vehicles;

import java.time.Year;
import java.util.Date;

public record VehicleOverrides (Year year,
                                String make,
                                String model,
                                String unitNumber,
                                boolean isServiceTrackingActive,
                                Date lastServiced,
                                Date nextService,
                                boolean isOilTrackingActive,
                                int lastOilChange,
                                int nextOilChange){
}
