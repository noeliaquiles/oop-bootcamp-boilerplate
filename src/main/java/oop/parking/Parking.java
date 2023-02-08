package oop.parking;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    private Integer space;
    private List<Car> carList = new ArrayList<>();

    public Parking(Integer space) {
        this.space = space;
    }

    public Boolean add(Car car) {
        if(carList.size() >= space*0.8) return false;
        return carList.add(car);
    }

    public List<Car> getCars() {
        return carList;
    }

    public void retrieve(Car car) {
        carList.remove(car);
    }
}
