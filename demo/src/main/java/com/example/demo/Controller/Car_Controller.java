package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.example.demo.Entity.Car;
import com.example.demo.Service.Car_Service;

@RestController
public class Car_Controller {
@Autowired
Car_Service cs;

@PostMapping(value = "/post_car")
public String postCar(@RequestBody Car a) {
	return cs.postCar(a);
}

@GetMapping(value = "/get_car")
public List<Car> get_cars() {
	return cs.get_cars();
}


}
