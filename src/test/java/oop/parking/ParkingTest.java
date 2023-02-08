package oop.parking;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingTest {

    @Test
    public void itShouldParkCar() {
        Parking parking = new Parking();
        Car car = new Car("0000BB");

        parking.add(car);

        assertEquals(parking.getCars().get(0), car);
    }

    @Test
    public void itShouldRetrieveCarFromParkingLot(){
        Parking parking = new Parking();
        Car car = new Car("0000B");

        parking.add(car);
        assertEquals(parking.getCars().get(0), car);
        parking.retrieve(car);
        assert(parking.getCars().isEmpty());
    }
}