/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author AtidSpikes
 */
public class Arm extends Subsystem {

    private Relay spike;
    private DigitalInput up, down;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public Arm(Relay spike, DigitalInput up, DigitalInput down, String name) {
        super(name);
        this.spike = spike;
    }

    public Arm(int spikePort, int upPort, int downPort, String name) {
        this(new Relay(spikePort), new DigitalInput(upPort), new DigitalInput(downPort), name);
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

    public boolean isUp() {
        return up.get();
    }

    public boolean isDown() {
        return down.get();
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
