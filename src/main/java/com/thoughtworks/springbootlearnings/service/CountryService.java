package com.thoughtworks.springbootlearnings.service;

import com.thoughtworks.springbootlearnings.entity.Country;
import com.thoughtworks.springbootlearnings.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Country getCountryById(int id) {
     return countryRepository.findById(id).get();
    }

    public Country addCountry(Country country) {
       return countryRepository.save(country);
    }

}
