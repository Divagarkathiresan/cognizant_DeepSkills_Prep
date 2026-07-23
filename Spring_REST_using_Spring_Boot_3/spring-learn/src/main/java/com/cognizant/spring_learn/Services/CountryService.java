package com.cognizant.spring_learn.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.Country;

@Service
public class CountryService {

    private static List<Country> countryList = new ArrayList<>();

    static {

        Country india = new Country();
        india.setCode("IN");
        india.setName("India");

        Country usa = new Country();
        usa.setCode("US");
        usa.setName("United States");

        Country japan = new Country();
        japan.setCode("JP");
        japan.setName("Japan");

        Country australia = new Country();
        australia.setCode("AU");
        australia.setName("Australia");

        countryList.add(india);
        countryList.add(usa);
        countryList.add(japan);
        countryList.add(australia);
    }

    public Country getCountry(String code) {

        for (Country country : countryList) {
            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }
        }

        return null;
    }
}