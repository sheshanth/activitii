package com.accelerator.activitii;

import org.activiti.engine.IdentityService;
import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.User;
import org.springframework.beans.factory.InitializingBean;
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
	
	/*
	 * @Bean InitializingBean usersAndGroupsInitializer(final IdentityService
	 * identityService) {
	 * 
	 * return new InitializingBean() { public void afterPropertiesSet() throws
	 * Exception {
	 * 
	 * Group group = identityService.newGroup("user"); group.setName("users");
	 * group.setType("security-role"); identityService.saveGroup(group);
	 * 
	 * User admin = identityService.newUser("admin"); admin.setPassword("admin");
	 * identityService.saveUser(admin); } }; }
	 */
	
}
