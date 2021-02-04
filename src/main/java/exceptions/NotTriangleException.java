package exceptions;

import org.slf4j.helpers.MessageFormatter;

import java.security.InvalidParameterException;

public class NotTriangleException extends InvalidParameterException {

    public NotTriangleException(String arguments) {
        super(MessageFormatter.format("I can't make a triangle : {}", arguments).getMessage());
    }

}
