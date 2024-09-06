package dev.conchy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TruckTest {
  
    @Test
    public void testGetLicensePlate() {
    
        Truck truck = new Truck("6547DKJ", 3);
        String licensePlate = truck.getLicensePlate();
        assertEquals("6547DKJ", licensePlate, "License plate should be 6547CWC");
    }

    @Test
    public void testCalculateToll() {
        
        
        Truck truck = new Truck("6547DKJ", 3);
        int toll = truck.calculateToll();
        assertEquals(150, toll, "Toll for a truck with 3 axies should be 150");
    }
}
