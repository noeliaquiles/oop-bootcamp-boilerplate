package oop.parking;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Owner implements PropertyChangeListener {
    public void setParking(Parking parking) {
        this.parking = parking;
    }

    private Parking parking;

    public Parking getParking() {
        return parking;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.setParking((Parking) evt.getNewValue());
    }
}
