package service;

import model.Car;

import java.util.List;

public class CarService {

    public List<Car> getCars(List<Car> cars, int numberOfCars) {
        if (numberOfCars < 0) {
            cars.clear();
            return cars;
        }
        if (numberOfCars > cars.size()) {
            return cars;
        }
        return cars.subList(0, numberOfCars);
    }

}