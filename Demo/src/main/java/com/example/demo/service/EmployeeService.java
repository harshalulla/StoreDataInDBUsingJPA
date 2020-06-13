package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.datamodel.Configuration;
import com.example.demo.datamodel.Employee;
import com.example.demo.utils.CommonUtils;

@Component
public class EmployeeService {
	@Autowired
	private ConfigurationRepository configRepository;

	public void saveEmployee(Employee employee) {
		Configuration master = CommonUtils.convert(employee, new Configuration());
		configRepository.save(master);
	
	}

}
