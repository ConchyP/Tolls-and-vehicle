package dev.conchy;

import java.util.ArrayList;
import java.util.List;

public class TollStation {

  private String name;
  private String city;
  private int totalCollected;
  private List<Vehicle> vehicles;


  public TollStation(String name, String city, int i, ArrayList arrayList) {
    this.name = name;
    this.city = city;
    this.totalCollected = 0;
    this.vehicles = new ArrayList<>();
  }


  public void addVehicle(Vehicle vehicle) {
    int toll = vehicle.calculateToll();
    totalCollected += toll;
    vehicles.add(vehicle);
  }


  public String getName() {
    return name;
  }


  public String getCity() {
    return city;
  }


  public int getTotalCollected() {
    return totalCollected;
  }


  public List<Vehicle> getVehicles() {
    return vehicles;
  }




}
