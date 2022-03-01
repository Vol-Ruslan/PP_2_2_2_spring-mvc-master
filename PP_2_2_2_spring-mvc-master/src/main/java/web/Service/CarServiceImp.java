package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {


//    public CarServiceImp() {
//        cars.add(new Car("BMW", "White", "5"));
//        cars.add(new Car("Audi", "Black", "12"));
//        cars.add(new Car("Lamborghini", "Green", "10"));
//        cars.add(new Car("Shoda", "Normalnaya", "3"));
//        cars.add(new Car("Infinity", "White", "2014"));
//    }

    private static final List<Car> cars = new ArrayList<>();

    static {

        cars.add(new Car("BMW", "White", "5"));
        cars.add(new Car("Audi", "Black", "12"));
        cars.add(new Car("Lamborghini", "Green", "10"));
        cars.add(new Car("Shoda", "Normalnaya", "3"));
        cars.add(new Car("Infinity", "White", "2014"));

    }

    @Override
    public List<Car> getCars(int count) {

        return cars.stream().limit(count).collect(Collectors.toList());

    }
}
