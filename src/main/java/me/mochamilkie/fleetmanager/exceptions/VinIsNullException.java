package me.mochamilkie.fleetmanager.exceptions;

public class VinIsNullException extends RuntimeException {
    public VinIsNullException() {
        super("Vin is empty, please try again");
    }
}
