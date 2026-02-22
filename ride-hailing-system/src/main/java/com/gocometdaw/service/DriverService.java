package com.gocometdaw.service;

import com.gocometdaw.model.Driver;
import com.gocometdaw.repository.DriverRepository;
import com.gocometdaw.dto.LocationUpdate;
import com.gocometdaw.dto.RideAssignment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DriverService {
    private final DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @Transactional
    public void updateLocation(Long driverId, LocationUpdate location) {
        Driver driver = driverRepository.findById(driverId)
                .orElseThrow(() -> new RuntimeException("Driver not found"));
        driver.setLocation(location.getCoordinates());
        driverRepository.save(driver);
    }

    @Transactional
    public void acceptRide(Long driverId, Long rideId) {
        Driver driver = driverRepository.findById(driverId)
                .orElseThrow(() -> new RuntimeException("Driver not found"));
        driver.setStatus("ASSIGNED");
        driverRepository.save(driver);
    }
}