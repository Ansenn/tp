package seedu.penus.logic.commands;

import seedu.penus.common.exceptions.InvalidCommandException;
import seedu.penus.model.ModelManager;

public class InitCommand extends Command {  //set user name and course, command: init n/Jiun Yuan c/1
    public static final String COMMAND_WORD = "init";

    public static final String MESSAGE = "Initialization Complete";

    private final String name;

    private final Integer courseCode;

    public InitCommand (String name,  int courseCode ) {
        this.name = name;
        this.courseCode = courseCode;
    }

    @Override
    public CommandResult execute(ModelManager model) throws InvalidCommandException {
        /*
          TODO: implement init
          HOW:
          use model.setUserName() and setUserCourse() to set user prefs
          printing stuff edit the MESSAGE,

          if need more, add a new command to Ui.java
          Alternative: change command to init [NAME] [COURSE]
        */
        String course = "";
        model.setUserName(name);
        switch(courseCode) {
        case 1: course = "Biomedical Engineering";
            break;
        case 2: course = "Chemical Engineering";
            break;
        case 3: course = "Civil Engineering";
            break;
        case 4: course = "Computer Engineering";
            break;
        case 5: course = "Electrical Engineering";
            break;
        case 6: course = "Environmental Engineering";
            break;
        case 7: course = "Industrial and Systems Engineering";
            break;
        case 8: course = "Mechanical Engineering";
            break;
        default: throw new InvalidCommandException("Enter within the index. Please initialize again");
        }
        model.setUserCourse(course);
        return new CommandResult(MESSAGE);
    }
}
