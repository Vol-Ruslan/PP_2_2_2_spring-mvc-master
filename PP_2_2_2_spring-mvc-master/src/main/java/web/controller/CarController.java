package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {

    private static final List<Car> cars = new ArrayList<>();

    static {

        cars.add(new Car("BMW", "White", "5"));
        cars.add(new Car("Audi", "Black", "12"));
        cars.add(new Car("Lamborghini", "Green", "10"));
        cars.add(new Car("Shoda", "Normalnaya", "3"));
        cars.add(new Car("Infinity", "White", "2014"));

    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false, defaultValue = "5") int count, Model model) {

        model.addAttribute("cars", cars.stream().limit(count).collect(Collectors.toList()));

        return "cars";

    }
}
