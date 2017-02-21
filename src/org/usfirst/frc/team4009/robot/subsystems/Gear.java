package org.usfirst.frc.team4009.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.TalonSRX;

import org.usfirst.frc.team4009.robot.RobotMap;
import org.usfirst.frc.team4009.robot.commands.ResetGear;
/**
 *
 */
public class Gear extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    TalonSRX motor;
    DigitalInput limitSwitch;

    public Gear() {
        motor = new TalonSRX(RobotMap.gearMotorPort);
        limitSwitch = new DigitalInput(RobotMap.gearLimitSwitch);
    }

    public void set(double speed) {
        motor.set(speed);
    }

    public boolean readLimitSwitch(){
        return limitSwitch.get();
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

