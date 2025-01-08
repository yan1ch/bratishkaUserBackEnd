package com.example.bratishka.bratishkaUserBackEnd.repositories;

import com.example.bratishka.bratishkaUserBackEnd.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
