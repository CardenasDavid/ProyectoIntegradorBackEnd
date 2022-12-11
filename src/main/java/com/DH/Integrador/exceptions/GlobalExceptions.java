package com.DH.Integrador.exceptions;


import com.DH.Integrador.Controller.OdontologoController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptions {

    private static final Logger logger= LoggerFactory.getLogger(OdontologoController.class);

    @ExceptionHandler({OdontologoNotFoundException.class})
    public ResponseEntity<?> error(OdontologoNotFoundException exception){
        logger.error(exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }
    @ExceptionHandler({PacienteNotFoundException.class})
    public ResponseEntity<?> error(PacienteNotFoundException exception){
        logger.error(exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }
    @ExceptionHandler({TurnoNotFoundException.class})
    public ResponseEntity<?> error(TurnoNotFoundException exception){
        logger.error(exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }




}
