package com.example.CrudProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CrudProject.Enity.Employee;
import com.example.CrudProject.Service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService es;

	@PostMapping(value = "/postData")
	public String post_details(@RequestBody Employee e) {
		return es.post_details(e);

	}

	@GetMapping(value = "/getdata")
	public List<Employee> get_details() {
		return es.get_details();
	}

	@GetMapping(value = "/getbyid/{a}")

	public Employee getby_id(@PathVariable int a) {

		return es.getby_id(a);

	}

}
