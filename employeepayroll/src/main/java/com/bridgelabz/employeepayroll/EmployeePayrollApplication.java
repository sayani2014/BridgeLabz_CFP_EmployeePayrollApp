/**
 * Modified the Rest Controller to demonstrate the various HTTP Methods.
 * Introducing DTO and Model to Employee Payroll App.
 * Introducing Services Layer in Employee Payroll App.
 * Ability for the Services Layer to store the Employee Payroll Data.
 * Use Lombok Library to auto generate getters and setters for the DTO.
 * Use Lombok Library for Logging.
 * Determine the Logging Levels, Logging to Console or File, Logging Patterns, etc based on this application running in
   Dev, Staging or Production.
 * Add Validation to Fields so the REST call can be validated.
 * Provide User Friendly Error Response in case validation fails.
 * Ability to throw User Friendly Errors in case Employee Id is not found in Employee Payroll App.
 *
 * @author : SAYANI KOLEY
 * @since : 11.08.2021
 */

package com.bridgelabz.employeepayroll;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class EmployeePayrollApplication {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EmployeePayrollApplication.class, args);
		log.info("Employee Payroll Application Started in {} Environment",
									context.getEnvironment().getProperty("environment"));
		log.info("Inside Main Method.");
	}

}
