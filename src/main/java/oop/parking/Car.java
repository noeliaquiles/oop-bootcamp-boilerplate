package oop.parking;

public class Car {
    private String plate;

    public Car(String plate) {
        this.plate = plate;
    }

    public void parkCar(Parking parking){
        parking.add(this);
    }
}
