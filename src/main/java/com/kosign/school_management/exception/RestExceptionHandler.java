package com.kosign.school_management.exception;


import com.kosign.school_management.common.api.ApiResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.ErrorResponseException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.swing.text.html.parser.Entity;
import java.util.Date;

@RestControllerAdvice
@Component
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(MyResourceNotFoundException.class)
    public ResponseEntity<ErrorMessageResponse> resourceNotFoundException(MyResourceNotFoundException ex, WebRequest request) {
        ErrorMessageResponse message = new ErrorMessageResponse(
                HttpStatus.NOT_FOUND.value(),
                new Date(),
                ex.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<ErrorMessageResponse>(message, HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorMessageResponse> globalExceptionHandler(Exception ex, WebRequest request) {
        ErrorMessageResponse message = new ErrorMessageResponse(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                new Date(),
                ex.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<ErrorMessageResponse>(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
       ErrorMessageResponse response = new ErrorMessageResponse(
               HttpStatus.BAD_REQUEST.value(),
               new Date(),
               ex.getMessage(),
               request.getDescription(false)
       );
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @Override
    protected ResponseEntity<Object> handleErrorResponseException(ErrorResponseException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        return super.handleErrorResponseException(ex, headers, status, request);
    }
}
