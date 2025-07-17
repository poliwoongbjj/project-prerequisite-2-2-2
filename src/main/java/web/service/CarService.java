package web.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars;
    private static final Logger logger = LoggerFactory.getLogger(CarService.class);

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2020));
        cars.add(new Car("Honda", "Civic", 2019));
        cars.add(new Car("BMW", "X5", 2021));
        cars.add(new Car("Mercedes", "C-Class", 2018));
        cars.add(new Car("Audi", "A4", 2022));
    }

    public List<Car> getCars(int count) {
        if (count <= 0) {
            logger.warn("Invalid count requested: {}, returning all cars", count);
            return new ArrayList<>(cars);
        }
        
        if (count >= cars.size()) {
            return new ArrayList<>(cars);
        }
        
        return new ArrayList<>(cars.subList(0, count));
    }

    public List<Car> getAllCars() {
        return new ArrayList<>(cars);
    }
} 