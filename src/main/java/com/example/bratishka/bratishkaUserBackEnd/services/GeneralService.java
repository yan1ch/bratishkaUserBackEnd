package com.example.bratishka.bratishkaUserBackEnd.services;

import com.example.bratishka.bratishkaUserBackEnd.models.Ad;
import com.example.bratishka.bratishkaUserBackEnd.models.Barber;
import com.example.bratishka.bratishkaUserBackEnd.models.City;
import com.example.bratishka.bratishkaUserBackEnd.models.Shop;
import com.example.bratishka.bratishkaUserBackEnd.repositories.AdRepository;
import com.example.bratishka.bratishkaUserBackEnd.repositories.BarberRepository;
import com.example.bratishka.bratishkaUserBackEnd.repositories.CityRepository;
import com.example.bratishka.bratishkaUserBackEnd.repositories.ShopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneralService {
    private final CityRepository cityRepository;
    private final ShopRepository shopRepository;
    private final BarberRepository barberRepository;
    private final AdRepository adRepository;

    public GeneralService(CityRepository cityRepository, ShopRepository shopRepository, BarberRepository barberRepository, AdRepository adRepository) {
        this.cityRepository = cityRepository;
        this.shopRepository = shopRepository;
        this.barberRepository = barberRepository;
        this.adRepository = adRepository;
    }

    public List<City> getCities(){
        return cityRepository.findAllByOrderByCityNameAsc();
    }

    public List<Shop> getShops(City city){
        return shopRepository.findAllByCity(city);
    }

    public List<Barber> getBarbers(Shop shop){
        return barberRepository.findAllByShop(shop);
    }

    public List<Ad> getAds(){
        return adRepository.findAllByOrderByNumberAsc();
    }
}