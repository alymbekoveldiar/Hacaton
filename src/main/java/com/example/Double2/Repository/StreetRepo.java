package com.example.Double2.Repository;

import com.example.Double2.Entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreetRepo extends JpaRepository< Street, Long> {
}
