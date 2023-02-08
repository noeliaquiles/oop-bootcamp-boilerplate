package oop.parking;

import java.util.List;

public class Assistant {
    private List<Parking> parkings;

    public Assistant(List<Parking> parkings) {
        this.parkings = parkings;
    }

    public Parking parkCar(Car car){
        for(Parking parking : parkings){
            if (parking.getOccupation() < 0.8){
                parking.add(car);
                return parking;
            }
        }
        return null;
    }
}
