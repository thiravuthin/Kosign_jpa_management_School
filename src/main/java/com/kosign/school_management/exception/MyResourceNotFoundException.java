package com.kosign.school_management.exception;


import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
@Getter
public class MyResourceNotFoundException extends RuntimeException{
   public MyResourceNotFoundException(String message){
       super(message);
    }

}
