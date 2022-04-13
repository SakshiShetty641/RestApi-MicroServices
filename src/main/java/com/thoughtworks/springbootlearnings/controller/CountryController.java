package com.thoughtworks.springbootlearnings.controller;

import com.thoughtworks.springbootlearnings.entity.Country;
import com.thoughtworks.springbootlearnings.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    public CountryService countryService;

    @GetMapping("/getcountries")
    public List<Country> getCountries() {
        return countryService.getAllCountries();
    }

//    @GetMapping("/getcountries/{id}")
//    public Country getCountriesById(@PathVariable int id) {
//        return countryService.getCountryById(id);
//    }

    @PostMapping("/addcountries")
    public Country addCountry(@RequestBody Country country) {
        return countryService.addCountry(country);
    }

}
