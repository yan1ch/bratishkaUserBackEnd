package com.example.bratishka.bratishkaUserBackEnd.repositories;

import com.example.bratishka.bratishkaUserBackEnd.models.Barber;
import com.example.bratishka.bratishkaUserBackEnd.models.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BarberRepository extends JpaRepository<Barber, Long> {
    List<Barber> findAllByShop(Shop shop);
}