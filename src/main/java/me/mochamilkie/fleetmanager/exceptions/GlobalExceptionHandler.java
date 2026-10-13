package me.mochamilkie.fleetmanager.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(InvalidVinException.class)
    public ResponseEntity<ErrorResponse> handleInvalidVinException(InvalidVinException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorResponse(ErrorCodes.INVALID_VIN, exception.getMessage()));
    }
    @ExceptionHandler(VinIsNullException.class)
    public ResponseEntity<ErrorResponse> handleVinIsNullException(VinIsNullException exception) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ErrorResponse(ErrorCodes.VIN_IS_NULL, exception.getMessage()));
    }
    @ExceptionHandler(InvalidVinLengthException.class)
    public ResponseEntity<ErrorResponse> handleInvalidVinLengthException(InvalidVinLengthException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorResponse(ErrorCodes.INVALID_VIN_LENGTH, exception.getMessage()));
    }


}
