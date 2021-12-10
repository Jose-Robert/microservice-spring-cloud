package br.com.microservices.hrpayroll.entities;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Worker implements Serializable {

    private Long id;
    private String name;
    private Double dailyIncome;
}
