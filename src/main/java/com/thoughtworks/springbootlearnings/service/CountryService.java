package com.thoughtworks.springbootlearnings.service;

import com.thoughtworks.springbootlearnings.entity.Country;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class CountryService {

    HashMap<Integer, Country> countryMap;

    public CountryService() {

        countryMap = new HashMap<Integer, Country>();

        Country indiaCountry = new Country(1, "India", "Delhi");
        Country ukCountry = new Country(2, "UK", "London");

        countryMap.put(1, indiaCountry);
        countryMap.put(2, ukCountry);
    }

    public List getAllCountries() {
        List countries = new ArrayList(countryMap.values());
        return countries;
    }

    public Country getCountryById(int id) {
        Country country = countryMap.get(id);
        return country;
    }

    public Country getCountryByName(String countryName) {
        Country country = null;
        for (int i : countryMap.keySet()) {
            if (countryMap.get(i).getCountryName().equals(countryName))
                country = countryMap.get(i);
        }
        return country;
    }


}
