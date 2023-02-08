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
    public void itShouldNotParkACarIfLotIsFull() {
        Parking parking = new Parking(5);
        Car car1 = new Car("00001BB");
        Car car2 = new Car("00002BB");
        Car car3 = new Car("00003BB");
        Car car4 = new Car("00004BB");
        Car car5 = new Car("00005BB");

        Boolean firstPark = parking.add(car1);
        parking.add(car2);
        parking.add(car3);
        Boolean secondPark = parking.add(car4);
        Boolean thirdPark = parking.add(car5);

        assertEquals(true, firstPark);
        assertEquals( true, secondPark);
        assertEquals(false, thirdPark);
    }
}