package com.example.demo.service;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.datamodel.Configuration;

public interface ConfigurationRepository extends CrudRepository<Configuration, Long> {

}
