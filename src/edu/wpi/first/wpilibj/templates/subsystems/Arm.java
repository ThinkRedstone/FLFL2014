/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author AtidSpikes
 */
public class Arm extends Subsystem {

    private Relay spike;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public Arm(Relay spike, String name) {
        super(name);
        this.spike = spike;
    }

    public Arm(int spikePort, String name) {
        this(new Relay(spikePort), name);
    }

    public void moveUp() {
        //assuming forward moves up
        spike.set(Relay.Value.kForward);
    }

    public void moveDown() {
        spike.set(Relay.Value.kReverse);
    }

    public void stop() {
        spike.set(Relay.Value.kOff);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
