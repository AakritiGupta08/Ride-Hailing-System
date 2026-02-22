package com.gocometdaw.controller;

import com.gocometdaw.service.DriverService;
import com.gocometdaw.dto.LocationUpdate;
import com.gocometdaw.dto.RideAssignment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/drivers")
public class DriverController {
    private final DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    // POST /v1/drivers/{id}/location — Send driver location updates
    @PostMapping("/{id}/location")
    public ResponseEntity<String> updateLocation(@PathVariable Long id, @RequestBody LocationUpdate location) {
        driverService.updateLocation(id, location);
        return ResponseEntity.ok("Location updated");
    }

    // POST /v1/drivers/{id}/accept — Accept ride assignment
    @PostMapping("/{id}/accept")
    public ResponseEntity<String> acceptRide(@PathVariable Long id, @RequestBody RideAssignment assignment) {
        driverService.acceptRide(id, assignment.getRideId());
        return ResponseEntity.ok("Ride accepted");
    }
}