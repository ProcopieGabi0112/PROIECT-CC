package com.project_cc.app_hotel.hotelservice.repository;

import com.project_cc.app_hotel.hotelservice.model.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelRepository extends MongoRepository<Hotel,String> {

}
