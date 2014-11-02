package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.templates.commands.drive.DriveTurn;
import edu.wpi.first.wpilibj.templates.commands.jack.ScoreTubes;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI extends JoystickMap {
    public OI() {
        turn.whileHeld(new DriveTurn());
        scoreTubes.whenPressed(new ScoreTubes());
    }
}
