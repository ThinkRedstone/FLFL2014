package edu.wpi.first.wpilibj.templates.subsystems;

import driveComponents.Gearbox;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.commands.drive.DriveStraight;

/**
 *@author ThinkRedstone
 */
public class DriveTrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private final Gearbox GBleft, GBright;

    public DriveTrain(String name, int leftPort1, int leftPort2, int rightPort1, int rightPort2) {
        super(name);
        this.GBleft = new Gearbox(leftPort1, leftPort2);
        this.GBright = new Gearbox(rightPort1, rightPort2);
        
    }

    public void straight(double s) {
        GBleft.set(s);
        GBright.set(-s);
    }

    public void turn(double s) {
        GBleft.set(s);
        GBright.set(s);
    }
    
    public void stop(){
        GBleft.set(0);
        GBright.set(0);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new DriveStraight());
    }
}
