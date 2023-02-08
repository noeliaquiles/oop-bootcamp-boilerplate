package oop.parking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    public void itShouldParkCarInParking() {
        Car car = new Car("0000BB");
        Parking parking = new Parking();

        car.parkCar(parking);

        assertEquals(parking.getCars().get(0), car);
    }
}