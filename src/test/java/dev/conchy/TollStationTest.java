package dev.conchy;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;

public class TollStationTest {

    @Test
    public void testTollStation() {
        TollStation tollStation = new TollStation("West Gate", "Madrid");

        assertEquals("West Gate", tollStation.getName());
        assertEquals("Madrid", tollStation.getCity());
        assertEquals(0.0, tollStation.getTotalCollected(), 0.01);
        assertTrue(tollStation.getVehicles().isEmpty());
    }

    @Test
    public void testAddVehicle() {
        TollStation tollStation = new TollStation("North Gate", "Leon");
        Car car1 = new Car("1234XYZ");
        Car car2 = new Car("5678BBC");

        tollStation.addVehicle(car1);
        tollStation.addVehicle(car2);

        assertEquals(2, tollStation.getVehicles().size());
        assertTrue(tollStation.getVehicles().contains(car1));
        assertTrue(tollStation.getVehicles().contains(car2));

        assertEquals(200, tollStation.getTotalCollected(), 0.01);
    }

    @Test
    public void testGetTollCollected() {
        TollStation tollStation = new TollStation("South Gate", "Asturias");
        Truck truck1 = new Truck("1234XYZ", 6);

        tollStation.addVehicle(truck1);

        assertEquals(300, tollStation.getTotalCollected(), 0.01);
    }

    @Test
    public void testGetTolLCollectedWithCar() {
        TollStation tollStation = new TollStation("South Gate", "Asturias");
        Car car1 = new Car("ABC123");

        tollStation.addVehicle(car1);

        assertEquals(100, tollStation.getTotalCollected(), 0.01);
    }

    @Test
    public void testGetTolLCollectedWithMotorcycle() {
        TollStation tollStation = new TollStation("South Gate", "Asturias");
        Motorcycle motorcycle1 = new Motorcycle("DEF456");

        tollStation.addVehicle(motorcycle1);

        assertEquals(50, tollStation.getTotalCollected(), 0.01);
    }

    @Test
    public void testGetTolLCollectedWithTruck() {
        TollStation tollStation = new TollStation("South Gate", "Asturias");
        Truck truck1 = new Truck("1234XYZ", 6);

        tollStation.addVehicle(truck1);

        assertEquals(300, tollStation.getTotalCollected(), 0.01);
    }

    @Test
    public void testPrintReport() {
        TollStation tollStation = new TollStation("South Gate", "Asturias");
        Car car1 = new Car("ABC123");
        Motorcycle motorcycle1 = new Motorcycle("DEF456");
        Truck truck1 = new Truck("1234XYZ", 6);

        tollStation.addVehicle(car1);
        tollStation.addVehicle(motorcycle1);
        tollStation.addVehicle(truck1);
    }

}


