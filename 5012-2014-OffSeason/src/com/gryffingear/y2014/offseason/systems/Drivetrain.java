/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gryffingear.y2014.offseason.systems;

import edu.wpi.first.wpilibj.Victor;

/**
 * Class containing methods and functions pertaining to the drivetrain.
 *
 * @author jeremy.germita@gmail.com (Jeremy Germita)
 */
public class Drivetrain {

    private Victor leftA = null;
    private Victor leftB = null;
    private Victor rightA = null;
    private Victor rightB = null;

    /**
     * Constructor.
     *
     * @param la
     * @param lb
     * @param ra
     * @param rb
     */
    public Drivetrain(int la, int lb, int ra, int rb) {
        leftA = new Victor(la);
        leftB = new Victor(lb);
        rightA = new Victor(ra);
        rightB = new Victor(rb);
    }

    /**
     * Tank drive method. sets left/right power
     *
     * @param leftV
     * @param rightV
     */
    public void tankDrive(double leftV, double rightV) {
        leftA.set(-leftV);
        leftB.set(-leftV);

        rightA.set(rightV);
        rightB.set(rightV);
    }

}
