package com.example.CrudProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CrudProject.Dao.EmployeeDao;
import com.example.CrudProject.Enity.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao ed;

	public String post_details(Employee e) {
		// TODO Auto-generated method stub
		return ed.post_details(e);
	}

	public List<Employee> get_details() {
		// TODO Auto-generated method stub
		return ed.get_details();
	}

	public Employee getby_id(int a) {
		// TODO Auto-generated method stub
		return ed.getby_id(a);
	}

}
