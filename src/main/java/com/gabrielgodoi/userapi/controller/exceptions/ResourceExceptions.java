package com.gabrielgodoi.userapi.controller.exceptions;

import com.gabrielgodoi.userapi.exceptions.EntityNotFoundException;
import com.gabrielgodoi.userapi.exceptions.StandarError;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpServerErrorException;

import java.time.LocalDateTime;

@ControllerAdvice
public class ResourceExceptions {
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<StandarError> notFound(EntityNotFoundException e, HttpServletRequest request){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new StandarError(
                        LocalDateTime.now(),
                        e.getMessage(),
                        HttpStatus.NOT_FOUND.value(),
                        request.getContextPath()
                )
        );
    }
}
