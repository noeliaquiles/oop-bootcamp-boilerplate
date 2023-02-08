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
                if(parking.getOccupation() > 0.75) System.out.print("We need to buy more Space!!!");
                return parking;
            }
        }
        return null;
    }
}
