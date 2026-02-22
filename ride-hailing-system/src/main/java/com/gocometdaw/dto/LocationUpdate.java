package com.gocometdaw.dto;

public class LocationUpdate {
    private Long driverId;
    private String location;
    private String coordinates;

    public LocationUpdate() {}

    public LocationUpdate(Long driverId, String location) {
        this.driverId = driverId;
        this.location = location;
    }

    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

}