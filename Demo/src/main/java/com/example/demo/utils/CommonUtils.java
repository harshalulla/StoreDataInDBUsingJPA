package com.example.demo.utils;

import org.springframework.beans.BeanUtils;

import com.example.demo.datamodel.Configuration;
import com.example.demo.datamodel.Employee;

public class CommonUtils {

	public static Configuration convert(Employee employee, Configuration configuration) {
		
		BeanUtils.copyProperties(employee, configuration);
		return configuration;
	}

}
