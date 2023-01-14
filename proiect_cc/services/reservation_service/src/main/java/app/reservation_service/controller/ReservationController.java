package app.reservation_service.controller;

import app.reservation_service.dto.ReservationRequest;
import app.reservation_service.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reservation")
@RequiredArgsConstructor
public class ReservationController {

    private final ReservationService reservationService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeReservation(@RequestBody ReservationRequest reservationRequest){
        reservationService.placeReservation(reservationRequest);
        return "Reservation Place Successfully";
    }
}
