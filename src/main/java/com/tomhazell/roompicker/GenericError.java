package com.tomhazell.roompicker;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Tom Hazell on 20/09/2016.
 */
@ResponseStatus(value= HttpStatus.BAD_REQUEST, reason="LOL SOMETHING HAPPENED")
public class GenericError extends RuntimeException {
}
