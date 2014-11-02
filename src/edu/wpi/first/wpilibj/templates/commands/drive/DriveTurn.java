/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.drive;

import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author Thinkredstone
 */
public class DriveTurn extends CommandBase {

    public DriveTurn() {

    }

    // Called just before this Command runs the first time
    protected void initialize() {
        requires(driveTrain);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        driveTrain.turn(oi.getDriverX());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        driveTrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
