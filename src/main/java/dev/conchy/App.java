package dev.conchy;

import java.util.ArrayList;


public final class App {
    private App() {
    }
    
    public static void main(String[] args) {
        TollStation station = new TollStation("Peaje Conchy", "Langrep", 0, new ArrayList<>());

        Vehicle car1 = new Car("JUYT3");
        Vehicle motorcycle1 = new Motorcycle("XYZ789");
        Vehicle truck1 = new Truck("LMN456", 4);

        station.addVehicle(car1);
        station.addVehicle(motorcycle1);
        station.addVehicle(truck1);


        System.out.println("Total recaudado en " + station.getName() + ": $" + station.getTotalCollected());

         System.out.println("Vehículos que han pasado por el peaje:");
        for (Vehicle vehicle : station.getVehicles()) {
            System.out.println(vehicle.getCarRegistration());
        }
    }
}
