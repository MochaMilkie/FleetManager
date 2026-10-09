package me.mochamilkie.fleetmanager.exceptions;

public record ErrorResponse(ErrorCodes error, String message) {
}
