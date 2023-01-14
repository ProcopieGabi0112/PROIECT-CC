package app.room_service.service;

import app.room_service.repository.RoomRepository;
;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;

    @Transactional(readOnly = true)
    public boolean isInStock(String skuCode){
       return roomRepository.findBySkuCode().isPresent();
    }
}
