package ch.noseryoung.customer_elif_team_b.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Throwable {
    private static final long serialVersionUID=1L;
    public ResourceNotFoundException(String message) {
        super(message);

    }




}
