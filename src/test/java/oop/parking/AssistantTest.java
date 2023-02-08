package oop.parking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssistantTest {
    @Test
    public void itShouldParkCarInParking() {
        Parking parking = new Parking();
        Car car = new Car("0000BB");
        Assistant assistant = new Assistant();

        assistant.parkCar(car, parking);

        assertEquals(parking.getCars().get(0), car);
    }
}