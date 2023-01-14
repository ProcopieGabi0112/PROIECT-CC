package app.hotel_service.service;


import app.hotel_service.dto.HotelRequest;
import app.hotel_service.dto.HotelResponse;
import app.hotel_service.model.Hotel;
import app.hotel_service.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
@Slf4j
public class HotelService {

    private final HotelRepository hotelRepository;

    public void createHotel(HotelRequest productRequest) {
        Hotel hotel = Hotel.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        hotelRepository.save(hotel);
        log.info("Product {} is saved", hotel.getId());
    }

    public List<HotelResponse> getAllHotels() {
        List<Hotel> hotels = hotelRepository.findAll();

        return hotels.stream().map(this::mapToHotelResponse).toList();
    }

    private HotelResponse mapToHotelResponse(Hotel hotel) {
        return HotelResponse.builder()
                .id(hotel.getId())
                .name(hotel.getName())
                .description(hotel.getDescription())
                .price(hotel.getPrice())
                .build();
    }
}
