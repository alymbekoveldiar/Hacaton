package com.example.Double2.Service;

import com.example.Double2.Entity.Street;
import com.example.Double2.Repository.StreetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreetService {
    @Autowired
    public StreetService(StreetRepo streetRepo) {
        this.streetRepo = streetRepo;
    }

    StreetRepo streetRepo;
    public List<Street> findAll(){
        return streetRepo.findAll();
    }
}
