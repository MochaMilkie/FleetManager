package me.mochamilkie.fleetmanager.vehicles;

import me.mochamilkie.fleetmanager.VIN;

import java.time.Year;
import java.util.Date;

public record CustomVehicle(VIN vin,
                            Year year,
                            String make,
                            String model,
                            String unitNumber,
                            Date lastServiced,
                            Date nextService,
                            int lastOilChange,
                            int nextOilChange) {

    public CustomVehicle vehicleWithOverrides(VehicleOverrides o){

        return new CustomVehicle(
                vin,
                o.year() != null ? o.year() : year,
                o.make() != null ? o.make() : make,
                o.model() != null ? o.model() : model,
                o.unitNumber() != null ? o.unitNumber() : unitNumber,
                o.lastServiced() != null ? o.lastServiced() : lastServiced,
                o.nextService() != null ? o.nextService() : nextService,
                o.lastOilChange() != lastOilChange ? o.lastOilChange() : lastOilChange,
                o.nextOilChange() != nextOilChange ? o.nextOilChange() : nextOilChange
        );
    }
}
