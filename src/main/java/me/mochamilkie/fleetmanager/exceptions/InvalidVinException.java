package me.mochamilkie.fleetmanager.exceptions;

public class InvalidVinException extends RuntimeException {
    public InvalidVinException(String message) {
        super(message + " is not a valid VIN");
    }
}
