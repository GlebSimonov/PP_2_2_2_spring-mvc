package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("car1", 1, "red"));
        cars.add(new Car("car2", 2, "orange"));
        cars.add(new Car("car3", 3, "yellow"));
        cars.add(new Car("car4", 4, "green"));
        cars.add(new Car("car5", 5, "blue"));
        count = Math.max(count, 0);
        return count <= 5 ? cars.subList(0, count) : cars;
    }
}
