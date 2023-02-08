package oop.parking;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingTest {

    @Test
    public void itShouldParkCar() {
        Parking parking = new Parking(2);
        Car car = new Car("0000BB");

        parking.add(car);

        assertEquals(parking.getCars().get(0), car);
    }

    @Test
    public void itShouldRetrieveCarFromParkingLot(){
        Parking parking = new Parking(2);
        Car car = new Car("0000B");

        parking.add(car);
        assertEquals(parking.getCars().get(0), car);
        parking.retrieve(car);
        assert(parking.getCars().isEmpty());
    }

    @Test
    public void itShouldNotParkCarIfParkingIsFull() {
        Parking parking = new Parking(1);
        Car car = new Car("0000BB");
        Car car2 = new Car("0002BB");

        parking.add(car);
        assertEquals(parking.add(car2), false);
    }

    @Test
    public void itShouldReturnTheOccupationOfTheParking() {
        Parking parking = new Parking(2);
        Car car = new Car("0001BB");

        parking.add(car);
        assertEquals(parking.getOccupation(),0.5);
    }
}