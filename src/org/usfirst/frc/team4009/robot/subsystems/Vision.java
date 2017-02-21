package org.usfirst.frc.team4009.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

/**
 *
 */
public class Vision extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    NetworkTable table;

    public Vision() {
        table = NetworkTable.getTable("RoboSight");
    }

    public double getLeftMotor() {
        return table.getNumber("LeftMotor", 0.0);
    }

    public double getRightMotor() {
        return table.getNumber("RightMotor", 0.0);
    }

    public double getKey(String key) {
        return table.getNumber(key, 0.0);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

