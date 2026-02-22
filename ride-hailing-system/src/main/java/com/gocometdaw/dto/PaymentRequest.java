package com.gocometdaw.dto;

import com.gocometdaw.model.Payment;

public class PaymentRequest {
    private Long tripId;
    private Double amount;
    private String method;

    public PaymentRequest() {}

    public PaymentRequest(Long tripId, Double amount, String method) {
        this.tripId = tripId;
        this.amount = amount;
        this.method = method;
    }

    public Long getTripId() {
        return tripId;
    }

    public void setTripId(Long tripId) {
        this.tripId = tripId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}