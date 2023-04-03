package seedu.penus.common.exceptions;

public class InvalidModuleException extends PenusException {
    public InvalidModuleException(String module) {
        super("The module code of " + module + " must be given.");
    }

    public InvalidModuleException() {
        super("This module is invalid. Please try again");
    }
}
