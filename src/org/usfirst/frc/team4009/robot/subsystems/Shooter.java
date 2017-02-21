package org.usfirst.frc.team4009.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.TalonSRX;

import org.usfirst.frc.team4009.robot.RobotMap;
/**
 *
 */
public class Shooter extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    TalonSRX motor;

    public Shooter() {
        motor = new TalonSRX(RobotMap.shooterMotor);
    }

    public void set(double speed) {
        motor.set(speed);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

