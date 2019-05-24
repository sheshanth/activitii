package com.accelerator.activitii;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.accelerator.activitii.service.EmployeeService;

@SpringBootApplication
public class ActivitiiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivitiiApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(final EmployeeService employeeService) {

		return new CommandLineRunner() {
			public void run(String... strings) throws Exception {
				employeeService.createEmployee();
			}
		};
	}
	
}
