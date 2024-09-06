package dev.conchy;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;

public class TollStationTest {

    @Test
    public void testTollStation() {
        TollStation tollStation = new TollStation("Peaje Centro", "Madrid");

        assertEquals("Peaje Centro", tollStation.getName());
        assertEquals("Madrid", tollStation.getCity());
        assertEquals(0.0, tollStation.getTotalCollected(), 0.01);
        assertTrue(tollStation.getVehicles().isEmpty());
    }

    @Test
    public void testAddVehicle() {
        TollStation tollStation = new TollStation("Peaje Centro", "Madrid");
        Car car1 = new Car("3453JKL");
        Car car2 = new Car("5765KML");

        tollStation.addVehicle(car1);
        tollStation.addVehicle(car2);

        assertEquals(2, tollStation.getVehicles().size());
        assertTrue(tollStation.getVehicles().contains(car1));
        assertTrue(tollStation.getVehicles().contains(car2));

        assertEquals(200, tollStation.getTotalCollected(), 0.01);
    }

    @Test
    public void testGetTollCollected() {
        TollStation tollStation = new TollStation("Peaje Centro", "Madrid");
        Truck truck1 = new Truck("3453KHJ", 4);

        tollStation.addVehicle(truck1);

        assertEquals(200, tollStation.getTotalCollected(), 0.01);
    }

    @Test
    public void testGetTolLCollectedWithCar() {
        TollStation tollStation = new TollStation("Peaje Centro", "Madrid");
        Car car1 = new Car("ABC123");

        tollStation.addVehicle(car1);

        assertEquals(100, tollStation.getTotalCollected(), 0.01);
    }

    @Test
    public void testGetTolLCollectedWithMotorcycle() {
        TollStation tollStation = new TollStation("Peaje Centro", "Madrid");
        Motorcycle motorcycle1 = new Motorcycle("3453FTY");

        tollStation.addVehicle(motorcycle1);

        assertEquals(50, tollStation.getTotalCollected(), 0.01);
    }

    @Test
    public void testGetTolLCollectedWithTruck() {
        TollStation tollStation = new TollStation("Peaje Centro", "Madrid");
        Truck truck1 = new Truck("3456GTR", 6);

        tollStation.addVehicle(truck1);

        assertEquals(300, tollStation.getTotalCollected(), 0.01);
    }

    @Test
    public void testPrintReport() {
        TollStation tollStation = new TollStation("Peaje Centro", "Madrid");
        Car car1 = new Car("4563JKS");
        Motorcycle motorcycle1 = new Motorcycle("7689LMN");
        Truck truck1 = new Truck("3231KKL", 4);

        tollStation.addVehicle(car1);
        tollStation.addVehicle(motorcycle1);
        tollStation.addVehicle(truck1);
    }

}


