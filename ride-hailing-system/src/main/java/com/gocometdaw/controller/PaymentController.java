package com.gocometdaw.controller;

import com.gocometdaw.model.Payment;
import com.gocometdaw.service.PaymentService;
import com.gocometdaw.dto.PaymentRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/payments")
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    // POST /v1/payments — Trigger payment flow
    @PostMapping
    public ResponseEntity<Payment> triggerPayment(@RequestBody PaymentRequest request) {
        Payment payment = paymentService.processPayment(request);
        return ResponseEntity.ok(payment);
    }
}