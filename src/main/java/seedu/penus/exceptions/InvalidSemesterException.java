package seedu.penus.exceptions;

public class InvalidSemesterException extends PenusException{
    private static final String message = "The semester number is invalid. Please try again";
    public InvalidSemesterException() {
        super(message);
    }
}
