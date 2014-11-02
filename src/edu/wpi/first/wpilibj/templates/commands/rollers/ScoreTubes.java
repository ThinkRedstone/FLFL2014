/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.rollers;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author AtidSpikes
 */
public class ScoreTubes extends CommandGroup {

    public ScoreTubes() {
        addParallel(new RollRollers());
        addSequential(new ArmUp());
        addSequential(new ReleaseTubes());
    }
}
