package org.github.gabrielgodoi.payrollapi.resource.exceptions;
import jakarta.servlet.http.HttpServletRequest;
import org.github.gabrielgodoi.payrollapi.exceptions.StandardError;
import org.github.gabrielgodoi.payrollapi.service.exceptions.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<StandardError> notFound(EntityNotFoundException e, HttpServletRequest request){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new StandardError(
                        LocalDateTime.now(),
                        e.getMessage(),
                        HttpStatus.NOT_FOUND.value(),
                        request.getRequestURI()
                )
        );
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<StandardError> IllegalArgumentException(IllegalArgumentException e, HttpServletRequest request){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new StandardError(
                        LocalDateTime.now(),
                        e.getMessage(),
                        HttpStatus.NOT_FOUND.value(),
                        request.getRequestURI()
                )
        );
    }
}
