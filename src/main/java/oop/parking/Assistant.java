package oop.parking;

import java.beans.PropertyChangeSupport;
import java.util.List;

public class Assistant {
    private List<Parking> parkings;

    private PropertyChangeSupport propertyChangeSupport;

    public Assistant(List<Parking> parkings) {
        this.parkings = parkings;
        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public Parking parkCar(Car car){
        for(Parking parking : parkings){
            if (parking.getOccupation() < 0.8){
                parking.add(car);
                if(parking.getOccupation() > 0.75)
                    propertyChangeSupport.firePropertyChange("parking", null, parking);
                return parking;
            }
        }
        return null;
    }
}
