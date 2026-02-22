package com.gocometdaw.dto;

public class RideAssignment {
    private Long driverId;
    private Long rideId;

    public RideAssignment() {}

    public RideAssignment(Long driverId, Long rideId) {
        this.driverId = driverId;
        this.rideId = rideId;
    }

    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    public Long getRideId() {
        return rideId;
    }

    public void setRideId(Long rideId) {
        this.rideId = rideId;
    }
}