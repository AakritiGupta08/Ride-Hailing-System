package com.gocometdaw.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Trip trip;

    private Double amount;
    private String method;
    private String status = "PENDING";
    private LocalDateTime createdAt = LocalDateTime.now();

    public Payment() {}

    // Getters
    public Long getId() {
        return id;
    }

    public Trip getTrip() {
        return trip;
    }

    public Double getAmount() {
        return amount;
    }

    public String getMethod() {
        return method;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    // Setters
    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}