package com.example.librarymanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.example.librarymanagement.Service.EmployeeService;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class LibrarymanagementApplication implements CommandLineRunner{
	private static final Logger logger=LoggerFactory.getLogger(LibrarymanagementApplication.class);

	private ApplicationContext context;

    public LibrarymanagementApplication(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void run(String... args) {
        EmployeeService service = context.getBean("employeeService", EmployeeService.class);
        service.show();
    }
	public static void main(String[] args) {
		SpringApplication.run(LibrarymanagementApplication.class, args);
		logger.info("Main method executed");
	}

}
