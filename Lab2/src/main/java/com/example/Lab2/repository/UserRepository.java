package com.example.Lab2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Lab2.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
