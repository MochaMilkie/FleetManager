package me.mochamilkie.fleetmanager.vehicles;

import java.time.Year;
import java.util.Date;

public record CustomVehicle(VIN vin,
                            Year year,
                            String make,
                            String model,
                            String unitNumber,
                            boolean isServiceTrackingActive,
                            Date lastServiced,
                            Date nextService,
                            boolean isOilTrackingActive,
                            int lastOilChange,
                            int nextOilChange) {

    public CustomVehicle vehicleWithOverrides(VehicleOverrides o){

        return new CustomVehicle(
                vin,
                o.year() != null ? o.year() : year,
                o.make() != null ? o.make() : make,
                o.model() != null ? o.model() : model,
                o.unitNumber() != null ? o.unitNumber() : unitNumber,
                o.isServiceTrackingActive(),
                o.lastServiced() != lastServiced ? o.lastServiced() : lastServiced,
                o.nextService() != nextService ? o.nextService() : nextService,
                o.isOilTrackingActive(),
                o.lastOilChange() != lastOilChange ? o.lastOilChange() : lastOilChange,
                o.nextOilChange() != nextOilChange  ? o.nextOilChange() : nextOilChange
        );
    }
}
