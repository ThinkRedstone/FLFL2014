package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.templates.commands.drive.DriveTurn;
import edu.wpi.first.wpilibj.templates.commands.jack.ScoreTubesJack;
import edu.wpi.first.wpilibj.templates.commands.rollers.PickTube;
import edu.wpi.first.wpilibj.templates.commands.rollers.ScoreTubesRollerArm;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI extends JoystickMap {

    public OI() {
        turn.whileHeld(new DriveTurn());
        scoreTubesJack.whenPressed(new ScoreTubesJack());
        pickTubes.whenPressed(new PickTube());
        scoreTubesRollerArm.whenPressed(new ScoreTubesRollerArm());
    }
}
