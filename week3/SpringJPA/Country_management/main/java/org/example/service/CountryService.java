package org.example.service;
import org.springframework.transaction.annotation.Transactional;

import org.example.model.Country;
import org.example.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    public List<Country> findByNameContaining(String name) {
        return countryRepository.findByNameContaining(name);
    }

    @Transactional(readOnly = true)
    public Country findCountryByCode(String code) {
        return countryRepository.findById(code)
                .orElseThrow(() -> new RuntimeException("Country not found"));
    }

    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    // CountryService.java
    public Country updateCountry(String code, Country updatedCountry) {
        Country existing = countryRepository.findById(code)
                .orElseThrow(() -> new RuntimeException("Country not found"));

        existing.setName(updatedCountry.getName());
        return countryRepository.save(existing);
    }

    @Transactional
    public void deleteCountry(String code) {
        countryRepository.deleteById(code);
    }
    @Transactional(readOnly = true)
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}
