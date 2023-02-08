package oop.parking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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

    @Test
    public void itShouldParkCarInFirstParkingWithSpace() {
        Parking parking1 = new Parking();
        Parking parking2 = new Parking();
        Car car = new Car("0000BB");
        Assistant assistant = new Assistant(new ArrayList<Parking>(Arrays.asList(parking1,parking2)));

        assistant.parkCar(car);
        assertEquals();
    }
}