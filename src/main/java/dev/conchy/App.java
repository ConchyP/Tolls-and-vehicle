package dev.conchy;


public final class App {
    
    public static void main(String[] args) {
        TollStation station = new TollStation("Peaje Sablazo", "Mieres");

        Vehicle car1 = new Car("4844CWC");
        Vehicle motorcycle1 = new Motorcycle("8976JSK");
        Vehicle truck1 = new Truck("0123HTML", 3);
        Vehicle car2 = new Car("9876LMX");


        station.addVehicle(car1);
        station.addVehicle(motorcycle1);
        station.addVehicle(truck1);
        station.addVehicle(car2);



        System.out.println("Total recaudado en " + station.getName() + ": $" + station.getTotalCollected());

         System.out.println("Vehículos que han pasado por el peaje:");
        for (Vehicle vehicle : station.getVehicles()) {
            System.out.println(vehicle.getLicensePlate());
        }
    }
    }
