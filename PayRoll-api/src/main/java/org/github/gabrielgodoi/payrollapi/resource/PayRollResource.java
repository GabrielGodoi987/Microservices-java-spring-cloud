package org.github.gabrielgodoi.payrollapi.resource;

import lombok.RequiredArgsConstructor;
import org.github.gabrielgodoi.payrollapi.domain.PayRoll;
import org.github.gabrielgodoi.payrollapi.domain.User;
import org.github.gabrielgodoi.payrollapi.feignClients.UserFeign;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/payments")
public class PayRollResource {

    private final UserFeign userFeign;

    @GetMapping(value = "/{id}")
    public ResponseEntity<PayRoll> getPayment(@PathVariable Long id, @RequestBody PayRoll payment) {
        User user = this.userFeign.findById(id).getBody();
        return ResponseEntity.ok().body(
                new PayRoll(
                        user.getName(),
                        payment.getDescription(),
                        user.getHourlyPrice(),
                        payment.getWorkedHours(),
                        user.getHourlyPrice() * payment.getWorkedHours()
                )
        );
    }
}
