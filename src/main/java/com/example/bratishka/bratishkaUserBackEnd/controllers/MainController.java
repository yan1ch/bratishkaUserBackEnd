package com.example.bratishka.bratishkaUserBackEnd.controllers;

import com.example.bratishka.bratishkaUserBackEnd.models.Ad;
import com.example.bratishka.bratishkaUserBackEnd.models.Barber;
import com.example.bratishka.bratishkaUserBackEnd.models.City;
import com.example.bratishka.bratishkaUserBackEnd.models.Shop;
import com.example.bratishka.bratishkaUserBackEnd.services.GeneralService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    private final GeneralService generalService;

    public MainController(final GeneralService generalService) {
        this.generalService = generalService;
    }

    @GetMapping("/getCities")
    public ResponseEntity<List<City>> getAllCities() {
        return ResponseEntity.ok(generalService.getCities());
    }

    @PostMapping("/getShops")
    public ResponseEntity<List<Shop>> getShopsByCity(@RequestBody City city) {
        return ResponseEntity.ok(generalService.getShops(city));
    }

    @PostMapping("/getBarbers")
    public ResponseEntity<List<Barber>> getBarbersByShop(@RequestBody Shop shop) {
        return ResponseEntity.ok(generalService.getBarbers(shop));
    }

    @GetMapping("/getAds")
    public ResponseEntity<List<Ad>> getAllAds() {
        return new ResponseEntity<>(generalService.getAds(), HttpStatus.OK);
    }
}
