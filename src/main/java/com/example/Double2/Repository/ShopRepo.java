package com.example.Double2.Repository;

import com.example.Double2.Entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepo extends JpaRepository< Shop, Long> {
}
