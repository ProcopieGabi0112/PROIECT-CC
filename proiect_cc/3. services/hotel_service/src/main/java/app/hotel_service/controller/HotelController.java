package app.hotel_service.controller;

import app.hotel_service.dto.HotelRequest;
import app.hotel_service.dto.HotelResponse;
import app.hotel_service.model.Hotel;
import app.hotel_service.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hotel")
@RequiredArgsConstructor
public class HotelController {

    private final HotelService hotelService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createHotel(@RequestBody HotelRequest hotelRequest) {
        hotelService.createHotel(hotelRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<HotelResponse> getAllHotels() {
        return hotelService.getAllHotels();
    }
}
