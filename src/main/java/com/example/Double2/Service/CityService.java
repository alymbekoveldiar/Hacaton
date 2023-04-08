package com.example.Double2.Service;

import com.example.Double2.Entity.City;
import com.example.Double2.Repository.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    public CityService(CityRepo cityRepo) {
        this.cityRepo = cityRepo;
    }
    CityRepo cityRepo;
    public List<City> findAll(){
        return cityRepo.findAll();
    }

}
