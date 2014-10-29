
package edu.wpi.first.wpilibj.templates;

import constants.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.templates.commands.drive.*;
import edu.wpi.first.wpilibj.templates.commands.jack.ScoreTubes;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    Joystick  driverJ = new Joystick(Ports.JOYSTICK);
    Button turn = new JoystickButton(driverJ, 1);
    Button scoreTubes=new JoystickButton(driverJ, 2);

    public OI() {
        turn.whileHeld(new DriveTurn());
        scoreTubes.whenPressed(new ScoreTubes());
    }
    
    public double getDriverX() {
        return driverJ.getX();
    }
    public double getDriverY(){
        return driverJ.getY();
    }
    
}

