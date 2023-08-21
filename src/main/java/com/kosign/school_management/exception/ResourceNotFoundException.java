package com.kosign.school_management.exception;

import com.kosign.school_management.common.api.StatusCode;
import jakarta.annotation.Resource;
import lombok.Builder;
import lombok.Getter;
import org.apache.catalina.connector.ResponseFacade;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * =>   With Error Handlers
 *      We have three ways to use @ResponseStatus to convert an Exception to an HTTP response status:
 *      * using @ExceptionHandler
 *      * using @ControllerAdvice
 *      * marking the Exception class
 *
 * */

/**
 * =>   ResponseStatusExceptionResolver
 *      This resolver was also introduced in Spring 3.0 and is enabled by default in the DispatcherServlet.
 *      Its main responsibility is to use the @ResponseStatus annotation available on custom exceptions and to map these exceptions to HTTP status codes.
 *      Such a custom exception may look like:
* */

/**
*       @ResponseStatus annotation available on custom exceptions and to map these exceptions to HTTP status codes.
* */

@ResponseStatus(value = HttpStatus.NOT_FOUND)
@Getter
public class ResourceNotFoundException extends RuntimeException{


   public ResourceNotFoundException(String message){
       super(message);
    }

}
