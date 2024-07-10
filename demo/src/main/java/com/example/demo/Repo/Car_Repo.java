package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Car;

public interface  Car_Repo extends JpaRepository<Car, Integer> {

}
