package com.codecademy.goldmedal.repository;

import com.codecademy.goldmedal.model.GoldMedal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface GoldMedalRepository extends CrudRepository<GoldMedal, Integer> {
    List<GoldMedal> getByCountryOrderByYearAsc(String countryName);
    List<GoldMedal> getByCountryOrderByYearDesc(String countryName);


}
