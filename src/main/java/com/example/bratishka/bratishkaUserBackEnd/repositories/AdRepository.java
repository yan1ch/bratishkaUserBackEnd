package com.example.bratishka.bratishkaUserBackEnd.repositories;

import com.example.bratishka.bratishkaUserBackEnd.models.Ad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdRepository extends JpaRepository<Ad, Long> {

    List<Ad> findAllByOrderByNumberAsc();

    @Query("SELECT e FROM Ad e WHERE e.number < :value ORDER BY e.number DESC LIMIT 1")
    Ad findClosestLessThan(@Param("value") int value);

    @Query("SELECT e FROM Ad e WHERE e.number > :value ORDER BY e.number ASC LIMIT 1")
    Ad findClosestGreaterThan(@Param("value") int value);
}
