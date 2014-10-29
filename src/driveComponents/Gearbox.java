/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driveComponents;

import edu.wpi.first.wpilibj.Talon;

/**
 *
 * @author ThinkRedstone
 */
public class Gearbox {

    Talon t1, t2;

    public Gearbox(Talon t1, Talon t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public Gearbox(int port1, int port2) {
        this(new Talon(port1), new Talon(port2));
    }
    public void set(double s){
        t1.set(s);
        t2.set(s);
    }

}
