/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.jack;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author ThinkRedstone
 */
public class ScoreTubesJack extends CommandGroup {
    
    public ScoreTubesJack() {
        addSequential(new JackUp());
        addSequential(new JackOpen());
        addSequential(new JackClose());
        addSequential(new JackDown());
    }
}
