package me.mochamilkie.fleetmanager;

import me.mochamilkie.fleetmanager.exceptions.InvalidVinException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class VINTests {
    @ParameterizedTest
    @ValueSource(strings = {"1FTRW12W06KD29937", "1FMJK1H54CEF48977", "JNKCV54E44M807684"})
    public void knownGoodVinDecode(String good){
        Assertions.assertDoesNotThrow(() -> new VIN(good));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1FTRW12W06KD2993","1FTRW12W06KD299377"})
    public void invalidVinLength(String bad){
        Assertions.assertThrows(InvalidVinException.class, () -> new VIN(bad));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1FTRW12W06KD2993I", "1FTRW12WO6KD29930", "1FTRW12W06KD2993Q"})
    public void invalidCharacterInVin(String bad){
        Assertions.assertThrows(InvalidVinException.class, () -> new VIN(bad));
    }

    @Test
    public void nullVin(){
        Assertions.assertThrows(InvalidVinException.class, () -> new VIN(null));
    }

    @Test
    public void vinContainsLowerCase(){
        Assertions.assertDoesNotThrow(() -> new VIN("1ftrw12w06kd29937"));
        VIN goodVin = new VIN("1FTRW12W06KD2993");
        VIN badVin = new VIN("1ftrw12w06kd29937");
        Assertions.assertEquals(goodVin, badVin);
    }

        //I would like to add more exceptions to allow more verbose responses for why the vin was rejected. We could also use the exception message for this
    //Unsure if that will be necessary
}
