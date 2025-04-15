package org.github.gabrielgodoi.payrollapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PayrollDTO {
    private String description;
    private Double workedHours;
}
