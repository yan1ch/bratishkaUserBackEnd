package com.example.bratishka.bratishkaUserBackEnd.repositories;

import com.example.bratishka.bratishkaUserBackEnd.models.City;
import com.example.bratishka.bratishkaUserBackEnd.models.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShopRepository extends JpaRepository<Shop, Integer> {
    List<Shop> findAllByCity(City city);
}