package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.templates.OI;
import edu.wpi.first.wpilibj.templates.subsystems.DriveTrain;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use
 * CommandBase.exampleSubsystem
 *
 * @author Author
 */
import constants.Ports;
import edu.wpi.first.wpilibj.templates.subsystems.JackElevator;

public abstract class CommandBase extends Command {

    public static OI oi;
    // Create a single static instance of all of your subsystems
    public static DriveTrain driveTrain = new DriveTrain("driveTrain", Ports.LEFT_TALON_1, Ports.LEFT_TALON_2, Ports.RIGHT_TALON_1, Ports.RIGHT_TALON_2);
    public static JackElevator jack = new JackElevator("jack", Ports.JACK_RELAY_1, Ports.JACK_REALY_2, Ports.JACK_DOOR, Ports.JACK_DI_UP, Ports.JACK_DI_DOWN, Ports.JACK_DI_OPEN, Ports.JACK_DI_CLOSED);

    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();

        // Show what command your subsystem is running on the SmartDashboard
        SmartDashboard.putData(driveTrain);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}