package br.com.microservices.hrpayroll.services;

import br.com.microservices.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, int days) {
        return Payment.builder()
                .name("Robert")
                .dailyIncome(200.0)
                .days(days)
                .build();
    }

}
