package oop.parking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AssistantTest {
    @Test
    public void itShouldParkCarInParking() {
        Parking parking = new Parking(2);
        Car car = new Car("0000BB");
        Assistant assistant = new Assistant(new ArrayList<Parking>(Arrays.asList(parking)));

        Parking actual = assistant.parkCar(car);

        assertEquals(parking, actual);
    }

    @Test
    public void itShouldParkCarInFirstParkingWithSpace() {
        Car car = new Car("0000BB");
        Parking parking1 = new Parking(0);
        Parking parking2 = new Parking(2);
        Assistant assistant = new Assistant(new ArrayList(Arrays.asList(parking1,parking2)));

        assertEquals(assistant.parkCar(car), parking2);
    }

    @Test
    public void itShouldNotParkACarIfLotIsFullUpTo80Percent() {
        Parking parking = new Parking(5);
        Assistant assistant = new Assistant(Collections.singletonList(parking));
        Car car1 = new Car("00001BB");
        Car car2 = new Car("00002BB");
        Car car3 = new Car("00003BB");
        Car car4 = new Car("00004BB");
        Car car5 = new Car("00005BB");

        Parking parking1 = assistant.parkCar(car1);
        assistant.parkCar(car2);
        assistant.parkCar(car3);
        Parking parking4 = assistant.parkCar(car4);
        Parking parking5 = assistant.parkCar(car5);

        assertEquals(parking, parking1);
        assertEquals( parking, parking4);
        assertEquals(null, parking5);
    }
}