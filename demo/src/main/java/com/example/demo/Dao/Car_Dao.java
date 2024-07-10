package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Car;
import com.example.demo.Repo.Car_Repo;

@Repository
public class Car_Dao {
@Autowired
Car_Repo cr;
	public String postCar(Car a) {
		// TODO Auto-generated method stub
		cr.save(a);
		return "------------Saved Sucesfully-------";
	}
	public List<Car> get_cars() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

}
