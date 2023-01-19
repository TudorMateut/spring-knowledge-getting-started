package ro.sda.product_app.exception.custom_exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ro.sda.product_app.exception.model.ClientError;

@RestControllerAdvice
public class AppExceptionHandler {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(AlreadyExistentException.class)
    public ClientError alreadyExistent() {
        return new ClientError("Already existent in the database!", 400);
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public ClientError notFound() {
        return new ClientError("Id not found in the database!", 400);
    }
}
