package com.example.demo.bindings;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.datamodel.Employee;

import io.swagger.annotations.Api;

@Api(value = "employee", description = "Add Employee to Database")
@RestController
@RequestMapping("/employee")
public class EmployeeController {

	private EmployeeService employeeService;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity saveEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		return new ResponseEntity("Employee Details saved in Database successfully", HttpStatus.OK);
	}

}
