package org.example.controller;

import org.example.model.Country;
import org.example.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/country")
public class CountryController {
    @Autowired
    private CountryService countryService;

    @GetMapping
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }
    @GetMapping("/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        return countryService.findCountryByCode(code);
    }

    @PostMapping
    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code) {
        return countryService.findCountryByCode(code);
    }

    @PutMapping("/country/{code}")
    public Country updateCountry(@PathVariable String code, @RequestBody Country country) {
        return countryService.updateCountry(code, country);
    }

    @DeleteMapping("/{code}")
    public void deleteCountry(@PathVariable String code) {
        countryService.deleteCountry(code);
    }

    @GetMapping("/search")
    public List<Country> searchByPartialName(@RequestParam String name) {
        return countryService.findByNameContaining(name);
    }
}
