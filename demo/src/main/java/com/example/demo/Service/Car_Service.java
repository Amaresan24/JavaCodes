package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.Car_Dao;
import com.example.demo.Entity.Car;
import java.util.*;

@Service
public class Car_Service {
	@Autowired
	Car_Dao cd;

	public String postCar(Car a) {
		// TODO Auto-generated method stub
		return cd.postCar(a);
	}

	public List<Car> get_cars() {
		// TODO Auto-generated method stub
		return  cd.get_cars();
	}

}
