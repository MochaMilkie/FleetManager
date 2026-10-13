package me.mochamilkie.fleetmanager.exceptions;

public class InvalidVinLengthException extends RuntimeException {
    public InvalidVinLengthException(String message) {
        super(message + " is not the correct length for a VIN.");
    }
}
