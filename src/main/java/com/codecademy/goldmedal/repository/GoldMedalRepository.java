package com.codecademy.goldmedal.repository;

import com.codecademy.goldmedal.model.GoldMedal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface GoldMedalRepository extends CrudRepository<GoldMedal, Integer> {

    // SELECT * FROM gold_medal WHERE country = ? ORDER BY year ASC;
    List<GoldMedal> getByCountryOrderByYearAsc(String countryName);

    List<GoldMedal> getByCountryOrderByYearDesc(String countryName);
    List<GoldMedal> getByCountryOrderBySeasonAsc(String countryName);
    List<GoldMedal> getByCountryOrderBySeasonDesc(String countryName);
    List<GoldMedal> getByCountryOrderByCityAsc(String countryName);
    List<GoldMedal> getByCountryOrderByCityDesc(String countryName);
    List<GoldMedal> getByCountryOrderByNameAsc(String countryName);
    List<GoldMedal> getByCountryOrderByNameDesc(String countryName);
    List<GoldMedal> getByCountryOrderByEventAsc(String countryName);
    List<GoldMedal> getByCountryOrderByEventDesc(String countryName);


    // SELECT COUNT(*) FROM gold_medal WHERE country = ?;
    Integer countByCountry(String countryName);

    // SELECT * FROM gold_medal WHERE season = ? ORDER BY year ASC;
    List<GoldMedal> getBySeasonOrderByYearAsc(String summer);

    // SELECT COUNT(*) FROM gold_medal WHERE season = 'Summer';
    Integer countBySeason(String summer);
}
