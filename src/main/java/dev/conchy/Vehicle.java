package dev.conchy;

public abstract class Vehicle {

    private String carRegistration;

    public Vehicle(String carRegistration){
    this.carRegistration = carRegistration;
    }

    public String getCarRegistration() {
        return carRegistration;
    }

    public abstract int calculateToll();
}
