package org.usfirst.frc.team4009.robot.subsystems;

import org.usfirst.frc.team4009.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Jostle extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	public Jostle() {
		jostleMotor = new TalonSRX(RobotMap.jostleMotorPort);
		currentSensor = new AnalogInput(RobotMap.currentSensorPort);
	}

	public static void jostleMotorSet(double speed) {
		jostleMotor.set(speed);

	}

	public static SpeedController jostleMotor;
	public static AnalogInput currentSensor;
}
