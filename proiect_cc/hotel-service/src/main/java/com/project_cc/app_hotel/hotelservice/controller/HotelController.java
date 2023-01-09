package com.project_cc.app_hotel.hotelservice.controller;

import com.project_cc.app_hotel.hotelservice.model.Hotel;
import com.project_cc.app_hotel.hotelservice.repository.HotelRepository;
import com.project_cc.app_hotel.hotelservice.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hotel")
@RequiredArgsConstructor
public class HotelController {

    private final HotelRepository hotelRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Hotel> findAll() {
        return hotelRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createHotel(@RequestBody Hotel hotel) {
        hotelRepository.save(hotel);
    }
}
