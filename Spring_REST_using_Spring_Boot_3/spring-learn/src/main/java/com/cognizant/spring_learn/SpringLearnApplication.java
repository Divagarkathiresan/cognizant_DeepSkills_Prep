package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

    // public static void main(String[] args) {
    //     displayCountry();
    // }

    // public static void displayCountry() {

    //     ApplicationContext context =
    //             new ClassPathXmlApplicationContext("country.xml");

    //     Country country = context.getBean("country", Country.class);

    //     System.out.println("Country : " + country);

    //     ((ClassPathXmlApplicationContext) context).close();
    // }

	public static void main(String[] args) {
        SpringApplication.run(SpringLearnApplication.class, args);
    }
}