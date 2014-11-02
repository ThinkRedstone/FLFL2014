/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.rollers;

import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author AtidSpikes
 */
public class ArmDown extends CommandBase {

    public ArmDown() {
        requires(arm);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {

    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        arm.moveDown();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return arm.isDown();
    }

    // Called once after isFinished returns true
    protected void end() {
        arm.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
