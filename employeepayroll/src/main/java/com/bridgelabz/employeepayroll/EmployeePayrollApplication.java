/**
 * Database setting as Environment variable.
 * Added the concept of Interface.
 * Updated the Bean class and added validation and customized exception.
 * Ability to get employee from DB using department name.
 *
 * @author : SAYANI KOLEY
 * @since : 12.08.2021
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
