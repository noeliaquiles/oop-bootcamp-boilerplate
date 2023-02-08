package oop.parking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    public void itShouldParkCar() {
        Parking parking = new Parking();
        Car car = new Car("0000BB");

        car.park(parking);

        assertEquals(parking.getCars().get(0), car);
    }

    @Test
    public void itShouldRetrieveCarFromParkingLot(){
        Parking parking = new Parking();
        Car car = new Car("0000B");

        car.park(parking);
        assertEquals(parking.getCars().get(0), car);
        car.retrieve(parking);
        assert(parking.getCars().isEmpty());
    }
}