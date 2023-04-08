package com.example.Double2.Controller;

import com.example.Double2.Entity.City;
import com.example.Double2.Entity.Shop;
import com.example.Double2.Entity.Street;
import com.example.Double2.Service.CityService;
import com.example.Double2.Service.ShopService;
import com.example.Double2.Service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController("/")
public class Controller {
    ShopService shopService;
    StreetService streetService;
    CityService cityService;
    @Autowired

    public Controller(ShopService shopService, StreetService streetService, CityService cityService) {
        this.shopService = shopService;
        this.streetService = streetService;
        this.cityService = cityService;
    }

    @GetMapping("city/")
    List<City> getAll(){
        return cityService.findAll();
    }

    @GetMapping("city//street")
    List<Street> getAllStreet(){
        return streetService.findAll();
    }

    @PostMapping("shop")
     Shop create(@RequestBody Shop shop){
        return shopService.createShop(shop);
    }

    @GetMapping("/shopAll")
    List<Shop> al (){
        return shopService.findAllShop();
    }
}
