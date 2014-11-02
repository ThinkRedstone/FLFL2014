/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.templates.commands.drive.DriveTurn;
import edu.wpi.first.wpilibj.templates.commands.jack.ScoreTubesJack;

/**
 *
 * @author Thinkredstone
 */
public class JoystickMap {

    static final Joystick driverJ = new Joystick(RobotMap.JOYSTICK);
    static final Button turn = new JoystickButton(driverJ, 1);
    static final Button scoreTubesJack = new JoystickButton(driverJ, 2);
    static final Button pickTubes = new JoystickButton(driverJ, 3);
    static final Button scoreTubesRollerArm = new JoystickButton(driverJ, 4);

    public double getDriverX() {
        return driverJ.getX();
    }

    public double getDriverY() {
        return driverJ.getY();
    }

}
