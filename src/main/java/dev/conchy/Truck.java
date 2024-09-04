package dev.conchy;

public class Truck extends Vehicle {

    private int axes;

    public Truck(String carRegistration, int axes) {
        super(carRegistration);
        this.axes = axes;
    }
    

    @Override
    public int calculateToll() {
        return axes * 50;
    }
    
}
