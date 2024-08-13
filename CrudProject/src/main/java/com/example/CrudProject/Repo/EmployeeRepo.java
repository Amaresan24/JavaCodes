package com.example.CrudProject.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CrudProject.Enity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
