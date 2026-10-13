package me.mochamilkie.fleetmanager.vindecoder;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Year;

public record NHTSAResult(
        @JsonProperty ("ModelYear") Year year,
        @JsonProperty ("Make")String make,
        @JsonProperty ("Model")String model) {

}
