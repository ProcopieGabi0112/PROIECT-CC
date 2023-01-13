package app.hotel_service;

import app.hotel_service.model.Hotel;
import app.hotel_service.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import java.math.BigDecimal;

@SpringBootApplication
public class HotelServiceApplication
{


	public static void main(String[] args) {
		SpringApplication.run(HotelServiceApplication.class, args);
	}



}



/*
@SpringBootApplication
@EnableEurekaClient
@RequiredArgsConstructor
public class HotelServiceApplication implements CommandLineRunner
{
		private final HotelRepository hotelRepository;

		public static void main(String[] args) {
			SpringApplication.run(HotelServiceApplication.class, args);
		}

		@Override
		public void run(String... args) {
			if (hotelRepository.count() < 1) {
				Hotel hotel = new Hotel();
				hotel.setName("Grand Hotel Bucharest");
				hotel.setDescription(" 5 stele - servicii impecabile");
				hotel.setPrice(BigDecimal.valueOf(150));

				hotelRepository.save(hotel);
			}
		}
	}

*/



