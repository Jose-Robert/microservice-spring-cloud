package br.com.microservices.hrpayroll.services;

import br.com.microservices.hrpayroll.entities.Payment;
import br.com.microservices.hrpayroll.entities.Worker;
import br.com.microservices.hrpayroll.feignclients.WorkerFeignClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClients workerFeignClients;

    public Payment getPayment(long workerId, int days) {
        Worker worker = workerFeignClients.findById(workerId).getBody();
        return Payment.builder()
                .name(worker.getName())
                .dailyIncome(worker.getDailyIncome())
                .days(days)
                .build();
    }

}
