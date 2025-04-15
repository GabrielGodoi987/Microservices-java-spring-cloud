package org.github.gabrielgodoi.payrollapi.exceptions;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class StandardError implements Serializable {
    private LocalDateTime timestamp;
    private String message;
    private Integer status;
    private String path;
}
