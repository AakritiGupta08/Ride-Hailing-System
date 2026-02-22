package com.gocometdaw.controller;

import com.gocometdaw.model.Trip;
import com.gocometdaw.service.TripService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/trips")
public class TripController {
    private final TripService tripService;

    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    // POST /v1/trips/{id}/end — End trip and trigger fare calculation
    @PostMapping("/{id}/end")
    public ResponseEntity<Trip> endTrip(@PathVariable Long id) {
        Trip trip = tripService.endTrip(id);
        return ResponseEntity.ok(trip);
    }
}