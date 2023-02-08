package oop.parking;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    private Integer space;

    public Parking(Integer space) {
        this.space = space;
    }

    private List<Car> carList = new ArrayList<>();

    public Boolean add(Car car) {
        return carList.add(car);
    }

    public List<Car> getCars() {
        return carList;
    }

    public void retrieve(Car car) {
        carList.remove(car);
    }
}
