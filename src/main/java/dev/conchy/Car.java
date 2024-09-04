package dev.conchy;

public class Car extends Vehicle {

    public Car(String carRegistration) {
        super(carRegistration);
    }

    @Override
    public int calculateToll() {
        return 100;
    }
}
