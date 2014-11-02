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
public class Rollers extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private Relay[] spikes = new Relay[4];

    public Rollers(String name, int port1, int port2, int port3, int port4) {
        super(name);
        spikes[0] = new Relay(port1);
        spikes[1] = new Relay(port2);
        spikes[3] = new Relay(port3);
        spikes[4] = new Relay(port4);
    }

    public void rockNroll() {
        for (int i = 0; i < spikes.length; i++) {
            spikes[i].set(Relay.Value.kForward);
        }
    }

    public void release() {
        for (int i = 0; i < spikes.length; i++) {
            spikes[i].set(Relay.Value.kReverse);
        }
    }

    public void stop() {
        for (int i = 0; i < spikes.length; i++) {
            spikes[i].set(Relay.Value.kOff);
        }
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
