package com.example.CrudProject.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.CrudProject.Enity.Employee;
import com.example.CrudProject.Repo.EmployeeRepo;

@Repository
public class EmployeeDao {

	@Autowired
	EmployeeRepo er;

	public String post_details(Employee e) {
		// TODO Auto-generated method stub
		er.save(e);

		return "Data Saved SuccesFully";

	}

	public List<Employee> get_details() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

	public Optional<Employee> getby_id(int a) {
		// TODO Auto-generated method stub
		return er.findById(a);
	}

}
