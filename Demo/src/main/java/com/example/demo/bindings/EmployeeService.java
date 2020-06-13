package com.example.demo.bindings;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.datamodel.Configuration;
import com.example.demo.datamodel.Employee;
import com.example.demo.service.ConfigurationRepository;
import com.example.demo.utils.CommonUtils;


public class EmployeeService {
	@Autowired
	private ConfigurationRepository configRepository;

	public void saveEmployee(Employee employee) {
		Configuration master = CommonUtils.convert(employee, new Configuration());
		configRepository.save(master);
	
	}

}
