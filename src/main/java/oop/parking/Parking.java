package oop.parking;

import java.util.ArrayList;
import java.util.List;

public class Parking {

    private List<Car> carList = new ArrayList<>();

    public void add(Car car) {
        carList.add(car);
    }

    public List<Car> getCars() {
        return carList;
    }

    public void retrieve(Car car) {
        carList.remove(car);
    }
}
