package me.mochamilkie.fleetmanager.vindecoder;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record NHTSAResponse(@JsonProperty("Results")List<NHTSAResult> results) {}
