package me.mochamilkie.fleetmanager;

import me.mochamilkie.fleetmanager.exceptions.InvalidVinException;

public record VIN(String vin) {
    public VIN{
        if (vin == null || !vin.matches("^[A-HJ-NPR-Z0-9]{17}$"));
        throw new InvalidVinException(vin);
    }
}
