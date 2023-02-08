package oop.parking;

import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class Parking {
    private Integer space;
    private List<Car> carList = new ArrayList<>();
    private PropertyChangeSupport propertyChangeSupport;

    public Parking(Integer space) {
        this.space = space;
        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public Boolean add(Car car) {
        if(carList.size() >= space) return false;
        carList.add(car);
        propertyChangeSupport.firePropertyChange("parking", null, this);
        return true;
    }

    public List<Car> getCars() {
        return carList;
    }

    public void retrieve(Car car) {
        carList.remove(car);
    }

    public double getOccupation() {
        return this.carList.size() / this.space.doubleValue();
    }

    public void addPropertyChangeListener(Owner owner) {
        propertyChangeSupport.addPropertyChangeListener(owner);
    }
}
