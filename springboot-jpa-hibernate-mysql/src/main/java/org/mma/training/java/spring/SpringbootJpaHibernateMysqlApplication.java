package org.mma.training.java.spring;

import org.mma.training.java.spring.model.Employee;
import org.mma.training.java.spring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJpaHibernateMysqlApplication implements CommandLineRunner{
	
	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaHibernateMysqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Employee employee = new Employee(100, "John", "Doe", "Harry Potter");
		employeeRepository.save(employee);
		
	}

}
