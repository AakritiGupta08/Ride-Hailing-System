package com.gocometdaw.controller;

import com.gocometdaw.dto.PaymentRequest;
import com.gocometdaw.model.Payment;
import com.gocometdaw.service.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rides")
public class RideController {

    private final PaymentService paymentService;

    public RideController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    // Endpoint to process a payment for a ride
    @PostMapping("/{rideId}/payment")
    public Payment makePayment(@PathVariable Long rideId, @RequestBody PaymentRequest request) {
        // Delegate to PaymentService
        return paymentService.processPayment(request);
    }
}