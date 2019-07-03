package guru.springframework.recipeproj.recipeproj.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NumberFormatException {

    public NumberFormatException(){
        super();
    }


}
