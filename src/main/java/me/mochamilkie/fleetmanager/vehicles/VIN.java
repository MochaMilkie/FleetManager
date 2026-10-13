package me.mochamilkie.fleetmanager.vehicles;

import me.mochamilkie.fleetmanager.exceptions.InvalidVinException;
import me.mochamilkie.fleetmanager.exceptions.InvalidVinLengthException;
import me.mochamilkie.fleetmanager.exceptions.VinIsNullException;

public record VIN(String vin) {
    public VIN{
        if (vin == null) throw new VinIsNullException();
        if(!(vin.length() == 17)) throw new InvalidVinLengthException(vin);
        vin = vin.trim().toUpperCase();

        if(!vin.matches("^[A-HJ-NPR-Z0-9]{17}$")) throw new InvalidVinException(vin);
    }
}
