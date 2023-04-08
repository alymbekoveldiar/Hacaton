package com.example.Double2.Repository;

import com.example.Double2.Entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepo extends JpaRepository<City,  Long > {
}
