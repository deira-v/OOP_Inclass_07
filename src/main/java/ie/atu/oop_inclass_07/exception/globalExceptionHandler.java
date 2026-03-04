package ie.atu.oop_inclass_07.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class globalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String HandleValidationException(MethodArgumentNotValidException ex){
        return "Error" + ex.getBindingResult().getFieldError().getDefaultMessage();
    }
}
