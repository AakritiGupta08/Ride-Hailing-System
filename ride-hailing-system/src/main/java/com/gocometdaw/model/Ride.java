package com.gocometdaw.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "rides")
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pickup;
    private String destination;
    private String tier;
    private String paymentMethod;
    private String status;
    private LocalDateTime createdAt = LocalDateTime.now();

    public Ride() {}

    // Getters
    public Long getId() {
        return id;
    }

    public String getPickup() {
        return pickup;
    }

    public String getDestination() {
        return destination;
    }

    public String getTier() {
        return tier;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    // Setters
    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}