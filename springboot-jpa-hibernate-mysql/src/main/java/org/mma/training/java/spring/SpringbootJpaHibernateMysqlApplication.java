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
		
		Employee employee = new Employee(200, "Hamed", "HA", "Azizi", "James");
		
		Employee employee1 = new Employee(300, "Nasrat", "NA", "Ahmadi", "Tejas");
		Employee employee2 = new Employee(300, "Shoaib", "SH", "karim", "Tariq");
		Employee employee3 = new Employee(400, "Najeeb", "NA", "Assadi", "Tejas");
		Employee employee4 = new Employee(500, "Tauseef", "TA", "Ahsan", "Jackie");
		Employee employee5 = new Employee(600, "Marry", "MA", "LU", "Jackie");
		Employee employee6 = new Employee(700, "Keegan", "KD", "Douvarjo", "Jackie");
		
		employeeRepository.save(employee);
		
	}

}
