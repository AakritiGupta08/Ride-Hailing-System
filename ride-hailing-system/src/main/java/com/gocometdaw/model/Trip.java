package com.gocometdaw.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "trips")
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Ride ride;

    @ManyToOne
    private Driver driver;

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String status = "ONGOING";

    public Trip() {}

    // Getters
    public Long getId() {
        return id;
    }

    public Ride getRide() {
        return ride;
    }

    public Driver getDriver() {
        return driver;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setRide(Ride ride) {
        this.ride = ride;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}