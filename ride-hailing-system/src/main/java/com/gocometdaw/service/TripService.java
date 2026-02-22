package com.gocometdaw.service;

import com.gocometdaw.model.Trip;
import com.gocometdaw.repository.TripRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; 
import java.time.LocalDateTime;

@Service
public class TripService {
    private final TripRepository tripRepository;

    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    @Transactional
    public Trip endTrip(Long tripId) {
        Trip trip = tripRepository.findById(tripId)
                .orElseThrow(() -> new RuntimeException("Trip not found"));
        trip.setEndTime(LocalDateTime.now());
        trip.setStatus("COMPLETED");
        return tripRepository.save(trip);
    }
}