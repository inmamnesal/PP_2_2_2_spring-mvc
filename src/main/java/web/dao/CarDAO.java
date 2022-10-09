package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class CarDAO {
    private List<Car> cars;

    {
        cars = Arrays.asList(
                new Car(1, "Ford", 88),
                new Car(2, "Mazda", 120),
                new Car(3, "Mercedes", 180),
                new Car(4, "BMW", 250),
                new Car(4, "Ferrari", 600)
        );
    }

    public List<Car> show(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
