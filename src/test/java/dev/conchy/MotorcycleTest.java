package dev.conchy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MotorcycleTest {

    @Test
    public void testGetLicensePlate() {
    
        Motorcycle motorcycle = new Motorcycle("6565CFT");
        String licensePlate = motorcycle.getLicensePlate();
        assertEquals("6565CFT", licensePlate, "License plate should be 6565CFT");
    }

    @Test
    public void testCalculateToll() {
        
        
        Motorcycle motorcycle = new Motorcycle("6565CFT");
        int toll = motorcycle.calculateToll();
        assertEquals(50, toll, "Toll for a motorcycle should be 0");
    }
}

