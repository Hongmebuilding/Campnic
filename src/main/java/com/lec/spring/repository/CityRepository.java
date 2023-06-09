package com.lec.spring.repository;

import com.lec.spring.domain.City;
import com.lec.spring.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Long> {
    City findByCity(String city);
}