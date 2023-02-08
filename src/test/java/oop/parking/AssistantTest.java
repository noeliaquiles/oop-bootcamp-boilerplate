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

        assistant.parkCar(car);

        assertEquals(parking.getCars().get(0), car);
    }

    @Test
    public void itShouldParkCarInFirstParkingWithSpace() {
        Car car = new Car("0000BB");
        Parking parking1 = mock(Parking.class);
            when(parking1.add(car)).thenReturn(false);
        Parking parking2 = mock(Parking.class);
            when(parking2.add(car)).thenReturn(true);
        Assistant assistant = new Assistant(new ArrayList<Parking>(Arrays.asList(parking1,parking2)));

        assertEquals(assistant.parkCar(car), parking2);
    }
}