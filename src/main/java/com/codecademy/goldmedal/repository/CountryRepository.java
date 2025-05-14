package com.codecademy.goldmedal.repository;

import com.codecademy.goldmedal.model.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface CountryRepository extends CrudRepository<Country, Integer> {
    Optional<Country> getByName(String countryName);
    List<Country> getAllByOrderByNameAsc();
    List<Country> getAllByOrderByNameDesc();
    List<Country> getAllByOrderByGdpAsc();
    List<Country> getAllByOrderByGdpDesc();
    List<Country> getAllByOrderByPopulationAsc();
    List<Country> getAllByOrderByPopulationDesc();

}