package oop.parking;

public class Car {
    private String plate;

    public Car(String plate) {
        this.plate = plate;
    }

    public void park(Parking parking) {
        parking.add(this);
    }

    public void retrieve(Parking parking){
        parking.retrieve(this);
    }
}
