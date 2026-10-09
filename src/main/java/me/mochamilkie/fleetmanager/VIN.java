package me.mochamilkie.fleetmanager;

import me.mochamilkie.fleetmanager.exceptions.InvalidVinException;

public record VIN(String vin) {
    public VIN{
        if (vin == null) throw new  InvalidVinException("VIN is null");
        vin = vin.trim().toUpperCase();
        if(!vin.matches("^[A-HJ-NPR-Z0-9]{17}$")) throw new InvalidVinException(vin);
    }
}
