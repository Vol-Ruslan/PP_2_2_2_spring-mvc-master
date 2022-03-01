package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarServiceImp;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {

    @Autowired
    private CarServiceImp carServiceImp;

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false, defaultValue = "5") int count,
                          Model model) {

        model.addAttribute("cars", carServiceImp.getCars(count));

        return "cars";

    }
}
