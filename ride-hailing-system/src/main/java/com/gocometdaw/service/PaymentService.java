package com.gocometdaw.service;

import com.gocometdaw.model.Payment;
import com.gocometdaw.model.Trip;
import com.gocometdaw.repository.PaymentRepository;
import com.gocometdaw.repository.TripRepository;
import com.gocometdaw.dto.PaymentRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;
    private final TripRepository tripRepository;

    public PaymentService(PaymentRepository paymentRepository, TripRepository tripRepository) {
        this.paymentRepository = paymentRepository;
        this.tripRepository = tripRepository;
    }

    @Transactional
    public Payment processPayment(PaymentRequest request) {
        Payment payment = new Payment();

        // Fetch Trip entity using tripId from the request
        Trip trip = tripRepository.findById(request.getTripId())
                .orElseThrow(() -> new RuntimeException("Trip not found"));

        payment.setTrip(trip);
        payment.setAmount(request.getAmount());
        payment.setMethod(request.getMethod());
        payment.setStatus("SUCCESS");

        return paymentRepository.save(payment);
    }
}