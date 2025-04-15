package org.github.gabrielgodoi.payrollapi.domain;


import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PayRoll implements Serializable {
    private String workerName;
    private String description;
    private Double hourlyPrice;
    private Double workedHours;
    private Double totalPayment;
}

