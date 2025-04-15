package org.github.gabrielgodoi.payrollapi.resource;

import lombok.RequiredArgsConstructor;
import org.github.gabrielgodoi.payrollapi.domain.PayRoll;
import org.github.gabrielgodoi.payrollapi.domain.User;
import org.github.gabrielgodoi.payrollapi.dto.PayrollDTO;
import org.github.gabrielgodoi.payrollapi.feignClients.UserFeign;
import org.github.gabrielgodoi.payrollapi.service.PayRollService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/payments")
public class PayRollResource {
    private final PayRollService payRollService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<PayRoll> getPayment(@PathVariable Long id, @RequestBody PayrollDTO payment) {
        return ResponseEntity.ok().body(payRollService.getPayment(id, payment));
    }
}
