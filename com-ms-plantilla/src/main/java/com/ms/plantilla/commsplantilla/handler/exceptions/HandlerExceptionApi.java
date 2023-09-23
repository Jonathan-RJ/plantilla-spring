package com.ms.plantilla.commsplantilla.handler.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ms.plantilla.commsplantilla.handler.exceptions.collections.HandlerRequestException400;
import com.ms.plantilla.commsplantilla.handler.exceptions.collections.HandlerRequestException401;
import com.ms.plantilla.commsplantilla.handler.exceptions.collections.HandlerRequestException404;
import com.ms.plantilla.commsplantilla.handler.exceptions.collections.HandlerRequestException500;
import com.ms.plantilla.commsplantilla.handler.response.ResponseBad;

@ControllerAdvice
public class HandlerExceptionApi {

    @ExceptionHandler(value = {HandlerRequestException400.class})
    public ResponseEntity<Object> handlerRequestException400(HandlerRequestException400 e){
        ResponseBad responseBad = new ResponseBad(
           e.getCodigo(),
           e.getMensaje(),
           e.getInformacion(),
           e.getDetalles()
        );
        return new ResponseEntity<>(responseBad, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = {HandlerRequestException401.class})
    public ResponseEntity<Object> handlerRequestException401(HandlerRequestException401 e){
        ResponseBad responseBad = new ResponseBad(
           e.getCodigo(),
           e.getMensaje(),
           e.getInformacion(),
           e.getDetalles()
        );
        return new ResponseEntity<>(responseBad, HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(value = {HandlerRequestException404.class})
    public ResponseEntity<Object> handlerRequestException404(HandlerRequestException404 e){
        ResponseBad responseBad = new ResponseBad(
           e.getCodigo(),
           e.getMensaje(),
           e.getInformacion(),
           e.getDetalles()
        );
        return new ResponseEntity<>(responseBad, HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(value = {HandlerRequestException500.class})
    public ResponseEntity<Object> handlerRequestException500(HandlerRequestException500 e){
        ResponseBad responseBad = new ResponseBad(
           e.getCodigo(),
           e.getMensaje(),
           e.getInformacion(),
           e.getDetalles()
        );
        return new ResponseEntity<>(responseBad, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
