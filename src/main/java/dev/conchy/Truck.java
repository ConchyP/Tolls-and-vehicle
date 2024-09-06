package dev.conchy;

public class Truck extends Vehicle {

    private int axies;


    public Truck(String licensePlate, int axies) {
        super(licensePlate);
        this.axies = axies;
    }


    @Override
    public int calculateToll() {
        return axies * 50;
    }
    
}
