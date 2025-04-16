package org.github.gabrielgodoi.payrollapi.feignClients;

import org.github.gabrielgodoi.payrollapi.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "user-api") // passamos apenas o nome do serviço e ele irá fazer um balanceamento de carga automático
public interface UserFeign {
    @GetMapping(value = "/api/users/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id);

    @GetMapping
    public ResponseEntity<List<User>> findAll();
}
