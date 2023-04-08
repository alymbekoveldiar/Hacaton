package com.example.Double2.Service;

import com.example.Double2.Entity.Shop;
import com.example.Double2.Repository.ShopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {
    @Autowired
    public ShopService(ShopRepo shopRepo) {
        this.shopRepo = shopRepo;
    }
    ShopRepo shopRepo;
    public Shop createShop(Shop shop){
        Shop shop1 = new Shop();
        shop1.setName(shop.getName());
        shop1.setCity(shop.getCity());
        shop1.setStreet(shop.getStreet());
        shop1.setHouse(shop.getHouse());
        shop1.setOpeningTime(shop.getOpeningTime());
        shop1.setClosingTime(shop.getClosingTime());
        shopRepo.save(shop1);
        return shop1;
    }

    public List<Shop> findAllShop (){
        return shopRepo.findAll();
    }

}