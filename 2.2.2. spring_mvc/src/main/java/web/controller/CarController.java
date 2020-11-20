package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value="count", defaultValue = "5") int count,
                           ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("model1", 1, 2001));
        cars.add(new Car("модель2", 2, 2002));
        cars.add(new Car("model3", 3, 2003));
        cars.add(new Car("model4", 4, 2004));
        cars.add(new Car("model5", 5, 2005));
        CarService carService = new CarService();
        cars = carService.getCars(cars, count);
        model.addAttribute("cars", cars);
        return "cars";
    }

}
