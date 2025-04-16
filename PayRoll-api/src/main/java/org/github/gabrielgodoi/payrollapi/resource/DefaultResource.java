package org.github.gabrielgodoi.payrollapi.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DefaultResource {

    @GetMapping
    public ResponseEntity<String> defaultResponse() {
        return ResponseEntity.ok().body("Funfou");
    }
}
