package com.gocometdaw.service;

import com.gocometdaw.model.Ride;
import com.gocometdaw.repository.RideRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; 
@Service
public class RideService {
    private final RideRepository rideRepository;

    public RideService(RideRepository rideRepository) {
        this.rideRepository = rideRepository;
    }

    @Transactional
    public Ride createRide(Ride rideRequest) {
        // Ensure default status is set before saving
        rideRequest.setStatus("REQUESTED");
        return rideRepository.save(rideRequest);
    }

    public Ride getRide(Long id) {
        return rideRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ride not found with id: " + id));
    }
}