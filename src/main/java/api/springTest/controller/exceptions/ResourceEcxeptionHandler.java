package api.springTest.controller.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import api.springTest.service.exceptions.ObjectNotFoundException;
import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceEcxeptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StardardError>objectNotFound(ObjectNotFoundException ex, HttpServletRequest request){
        StardardError error=
                            new StardardError(LocalDateTime.now(), 
                                              HttpStatus.NOT_FOUND.value(),
                                              ex.getMessage(),
                                              request.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

}
