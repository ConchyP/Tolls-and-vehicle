package dev.conchy;

public class Motorcycle extends Vehicle {

    public Motorcycle(String carRegistration) {
        super(carRegistration);
    }

    @Override
    public int calculateToll() {
        return 50;
    }


}
