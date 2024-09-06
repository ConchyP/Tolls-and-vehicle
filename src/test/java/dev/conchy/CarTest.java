package dev.conchy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void testGetLicensePlate() {
    
        Car car = new Car("6565CFT");
        String licensePlate = car.getLicensePlate();
        assertEquals("6565CFT", licensePlate, "License plate should be 6565CFT");
    }

    @Test
    public void testCalculateToll() {
        
        Car car = new Car("6565CFT");
        int toll = car.calculateToll();
        assertEquals(100, toll, "Toll for a car should be 100");
    }
}
