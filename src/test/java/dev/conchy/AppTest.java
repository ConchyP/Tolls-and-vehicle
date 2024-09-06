package dev.conchy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import org.junit.jupiter.api.Test;


public class AppTest {

    @Test

    public void testAddVehicle() {
    TollStation station = new TollStation("Peaje Sablazo", "Langreo");
    Vehicle car = new Car("4539GTK");

    station.addVehicle(car);

    assertTrue(station.getVehicles().contains(car));
}

@Test
public void testTotalTollCalculation() {
    TollStation station = new TollStation("Peaje Sablazo", "Langreo");
    
    Vehicle car1 = new Car("4539GTK");
    Vehicle motorcycle = new Motorcycle("7684KSC");
    Vehicle truck = new Truck("6354MHL", 3); 
    Vehicle car2 = new Car("9876LMX");

    station.addVehicle(car1);
    station.addVehicle(motorcycle);
    station.addVehicle(truck);
    station.addVehicle(car2);

    assertEquals(400, station.getTotalCollected());
}

@Test
public void testGetVehicles() {
    TollStation station = new TollStation("Peaje Sablazo", "Langreo");
    Vehicle car1 = new Car("6547HTG");
    Vehicle car2 = new Car("8790LKM");

    station.addVehicle(car1);
    station.addVehicle(car2);

    List<Vehicle> vehicles = station.getVehicles();
    assertTrue(vehicles.contains(car1));
    assertTrue(vehicles.contains(car2));
}
@Test
public void testOutputFormat() {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));

    App.main(new String[]{});

    String output = new String(out.toByteArray());
    assertTrue(output.contains("Total recaudado en Peaje Sablazo: $400"));
    assertTrue(output.contains("Vehículos que han pasado por el peaje:"));
    assertTrue(output.contains("4844CWC"));
    assertTrue(output.contains("8976JSK"));
    assertTrue(output.contains("0123HTML"));
    assertTrue(output.contains("9876LMX"));
}
}