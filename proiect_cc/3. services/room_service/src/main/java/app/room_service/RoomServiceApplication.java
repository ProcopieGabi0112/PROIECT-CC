package app.room_service;

import app.room_service.model.Room;
import app.room_service.repository.RoomRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RoomServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomServiceApplication.class, args);
	}

    @Bean
	public CommandLineRunner run(RoomRepository roomRepository){
		  return args -> {
			  Room room = new Room();
			  room.setSkuCode("gr_hotel");
			  room.setQuantity(100);

			  Room room1 = new Room();
			  room1.setSkuCode("petit_hotel");
			  room1.setQuantity(0);

			  roomRepository.save(room);
			  roomRepository.save(room1);

		  };
	}

}
