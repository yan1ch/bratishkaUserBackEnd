package com.example.bratishka.bratishkaUserBackEnd.repositories;

import com.example.bratishka.bratishkaUserBackEnd.models.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Long> {
    List<City> findAllByOrderByCityNameAsc();
}