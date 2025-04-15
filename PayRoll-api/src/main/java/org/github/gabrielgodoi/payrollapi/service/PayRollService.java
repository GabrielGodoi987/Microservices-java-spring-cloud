package org.github.gabrielgodoi.payrollapi.service;

import feign.FeignException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.github.gabrielgodoi.payrollapi.domain.PayRoll;
import org.github.gabrielgodoi.payrollapi.dto.PayrollDTO;
import org.github.gabrielgodoi.payrollapi.feignClients.UserFeign;
import org.github.gabrielgodoi.payrollapi.service.exceptions.EntityNotFoundException;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Objects;

@RequiredArgsConstructor
@Slf4j
@Service
public class PayRollService {
    private final Environment env;
    private final UserFeign userFeign;

    public PayRoll getPayment(Long workedId, PayrollDTO payRoll) {
        log.info("PAYROLL_SERVICE ::: Get request on {} port", env.getProperty("local.server.port") + " port");
        try {
            var user = userFeign.findById(workedId).getBody();
            if (Objects.nonNull(user)) {
                return new PayRoll(
                        user.getName(),
                        payRoll.getDescription(),
                        user.getHourlyPrice(),
                        payRoll.getWorkedHours(),
                        user.getHourlyPrice() * user.getHourlyPrice()
                );
            }
        } catch (FeignException.NotFound ex) {
            throw new EntityNotFoundException("entity not found");
        } catch (Exception ex) {
            throw new IllegalArgumentException("Illegal argument exception");
        }
        return null;
    }
}
