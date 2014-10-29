/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author AtidSpikes
 */
public class JackElevator extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    Relay r1, r2;
    Talon door;
    DigitalInput up, down;
    DigitalInput open, closed;

    public JackElevator(String name, int relay1Port, int realy2Port, int doorPort, int upPort, int downPort, int openPort, int closedPort) {
        super(name);
        r1 = new Relay(relay1Port);
        r2 = new Relay(realy2Port);
        door = new Talon(doorPort);
        up = new DigitalInput(upPort);
        down = new DigitalInput(downPort);
        open = new DigitalInput(openPort);
        closed = new DigitalInput(closedPort);
    }

    public void up() {
        //assuming forward goes up
        r1.set(Relay.Value.kForward);
        r2.set(Relay.Value.kForward);
    }

    public void down() {
        r1.set(Relay.Value.kReverse);
        r2.set(Relay.Value.kReverse);
    }

    public void stop() {
        r1.set(Relay.Value.kOff);
        r2.set(Relay.Value.kOff);
    }

    public void openDoor() {
        door.set(1);
    }

    public void closeDoor() {
        door.set(-1);
    }

    public void stopDoor() {
        door.set(0);
    }

    public boolean isUp() {
        return up.get();
    }

    public boolean isDown() {
        return down.get();
    }

    public boolean isOpen() {
        return open.get();
    }

    public boolean isClosed() {
        return closed.get();
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
