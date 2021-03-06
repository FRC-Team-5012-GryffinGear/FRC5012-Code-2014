/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gryffingear.y2014.offseason.commands;

import com.gryffingear.y2014.offseason.systems.Arm;
import com.gryffingear.y2014.offseason.systems.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Command to control intake system.
 *
 * @author jeremy.germita@gmail.com (Jeremy Germita)
 */
public class IntakeCommand extends Command {

    private double speed = 0.0;
    private boolean position = false;

    public IntakeCommand(double speed, boolean position) {
        this.speed = speed;
        this.position = position;
    }

    protected void initialize() {
        Robot.getInstance().shooter.intake.set(speed);
        Robot.getInstance().shooter.intake.setJaw(position);
    }

    protected void execute() {
    }

    protected void interrupted() {

    }

    protected void end() {

    }

    protected boolean isFinished() {
        return true;
    }

}
