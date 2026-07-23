package com.cognizant.spring_learn.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.Country;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/country")
public class CountryController {
    public final static Logger LOGGER = LoggerFactory.getLogger(CountryController.class);
    @GetMapping("/hello")
    public String sayHello() {
        LOGGER.info("START - sayHello()");
        String message = "Hello World!!";
        LOGGER.info("END - sayHello()");
        return message;
    }

    @GetMapping
    public Country getCountryIndia() {

        LOGGER.info("START");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        Country country =
                context.getBean("country", Country.class);

        LOGGER.info("END");

        ((ClassPathXmlApplicationContext) context).close();

        return country;
    }
}
