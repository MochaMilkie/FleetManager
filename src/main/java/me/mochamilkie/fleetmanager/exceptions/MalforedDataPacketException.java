package me.mochamilkie.fleetmanager.exceptions;

public class MalforedDataPacketException extends RuntimeException {
    public MalforedDataPacketException() {
        super("Invalid data was provided. Please check the vehicle details and try again.");
    }
}
