/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package com.gryffingear.y2014.offseason;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Compressor;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

    //drivetrain
    Victor leftDrive1 = new Victor(3);
    Victor leftDrive2 = new Victor(4);
    Victor rightDrive1 = new Victor(1);
    Victor rightDrive2 = new Victor(9);
    RobotDrive maindrive = new RobotDrive(leftDrive1, leftDrive2, rightDrive1, rightDrive2);

    //Joysticks
    Joystick leftstick = new Joystick(1);
    Joystick rightstick = new Joystick(2);

    //Pneumatics
    Compressor compressor = new Compressor(2, 1);

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
        //compressor.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {

        double slowMode = .65;
        if (leftstick.getRawButton(1) || rightstick.getRawButton(1)) {
            slowMode = 1.0;
        }
        maindrive.tankDrive(-leftstick.getRawAxis(2) * slowMode, -rightstick.getRawAxis(2) * slowMode);

    }

    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {

    }

}
