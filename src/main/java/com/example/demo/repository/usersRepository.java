package com.example.demo.repository;

import com.example.demo.entities.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usersRepository extends JpaRepository<user,Integer> {
}
