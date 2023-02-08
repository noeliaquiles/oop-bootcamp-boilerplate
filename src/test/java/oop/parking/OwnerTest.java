package oop.parking;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

    @Test
    public void itShouldTriggerNotificationIfParkingIsOver75Percent() {
        Owner owner = new Owner();
        Parking parking = new Parking(5);
        Assistant assistant = new Assistant(Collections.singletonList(parking));
        Car car1 = new Car("00001BB");
        Car car2 = new Car("00002BB");
        Car car3 = new Car("00003BB");
        Car car4 = new Car("00004BB");

        parking.addPropertyChangeListener(owner);
        assistant.parkCar(car1);
        assistant.parkCar(car2);
        assistant.parkCar(car3);
        assistant.parkCar(car4);

        assertEquals(parking, owner.getParking());
    }

    @Test
    public void itShouldTriggerNotificationIfParkingIsBelow20Percent() {
        Owner owner = new Owner();
        Parking parking = new Parking(6);
        Assistant assistant = new Assistant(Collections.singletonList(parking));
        Car car1 = new Car("00001BB");

        parking.addPropertyChangeListener(owner);
        assistant.parkCar(car1);

        assertEquals(parking, owner.getParking());
    }

}