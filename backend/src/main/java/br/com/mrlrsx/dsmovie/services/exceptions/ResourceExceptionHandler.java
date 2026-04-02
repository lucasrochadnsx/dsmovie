package br.com.mrlrsx.dsmovie.services.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;
@RestControllerAdvice
public class ResourceExceptionHandler {

        @ExceptionHandler(ResourceNotFoundException.class)
        public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e) {

            StandardError err = new StandardError();
            err.setTimestamp(Instant.now());
            err.setStatus(404);
            err.setError("Resource not found");
            err.setMessage(e.getMessage());
            err.setPath("/movies");

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
        }
}
