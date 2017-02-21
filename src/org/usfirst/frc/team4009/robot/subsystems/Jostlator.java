package org.usfirst.frc.team4009.robot.subsystems;

import org.usfirst.frc.team4009.robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Jostlator extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    //
    SpeedController jostleMotor;
    AnalogInput currentSensor;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());

    }

    public Jostlator() {
    	jostleMotor = new TalonSRX(RobotMap.jostleMotorPort);
        currentSensor = new AnalogInput(RobotMap.jostleCurrentSensorPort);
    }

    public void set(double speed) {
        jostleMotor.set(speed);
    }

    public double readCurrent() {
        return currentSensor.getVoltage();
    }

}
