package com.example.Double2.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToOne(optional=false, cascade=CascadeType.ALL)
    private City city;

    @OneToOne(optional=false, cascade=CascadeType.ALL)
    private Street Street;

    private String House;
    private LocalDateTime OpeningTime;
    private LocalDateTime ClosingTime;

    public Shop(Long id, String name, City city, com.example.Double2.Entity.Street street, String house, LocalDateTime openingTime, LocalDateTime closingTime) {
        this.id = id;
        this.name = name;
        this.city = city;
        Street = street;
        House = house;
        OpeningTime = openingTime;
        ClosingTime = closingTime;
    }

    public Shop() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public com.example.Double2.Entity.Street getStreet() {
        return Street;
    }

    public void setStreet(com.example.Double2.Entity.Street street) {
        Street = street;
    }

    public String getHouse() {
        return House;
    }

    public void setHouse(String house) {
        House = house;
    }

    public LocalDateTime getOpeningTime() {
        return OpeningTime;
    }

    public void setOpeningTime(LocalDateTime openingTime) {
        OpeningTime = openingTime;
    }

    public LocalDateTime getClosingTime() {
        return ClosingTime;
    }

    public void setClosingTime(LocalDateTime closingTime) {
        ClosingTime = closingTime;
    }
}
