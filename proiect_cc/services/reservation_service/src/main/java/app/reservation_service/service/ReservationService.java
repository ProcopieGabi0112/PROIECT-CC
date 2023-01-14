package app.reservation_service.service;

import app.reservation_service.dto.ReservationLineItemsDto;
import app.reservation_service.dto.ReservationRequest;
import app.reservation_service.model.Reservation;
import app.reservation_service.model.ReservationLineItems;
import app.reservation_service.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
public class ReservationService {

      private final ReservationRepository reservationRepository;

      public void placeReservation(ReservationRequest reservationRequest){
          Reservation reservation = new Reservation();
          reservation.setOrderNumber(UUID.randomUUID().toString());

         List<ReservationLineItems> reservationLineItems =  reservationRequest.getReservationLineItemsDtoList()
                  .stream()
                  .map(this::mapToDto)
                  .toList();

          reservation.setReservationLineItemsList(reservationLineItems);

          reservationRepository.save(reservation);
      }

    private ReservationLineItems mapToDto(ReservationLineItemsDto reservationLineItemsDto) {
          ReservationLineItems reservationLineItems = new ReservationLineItems();
          reservationLineItems.setPrice(reservationLineItemsDto.getPrice());
          reservationLineItems.setQuantity(reservationLineItemsDto.getQuantity());
          reservationLineItems.setSkuCode(reservationLineItemsDto.getSkuCode());
          return reservationLineItems;
    }

}
