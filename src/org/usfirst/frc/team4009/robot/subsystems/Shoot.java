package org.usfirst.frc.team4009.robot.subsystems;

import org.usfirst.frc.team4009.robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shoot extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	public Shoot() {
		shooter = new TalonSRX(RobotMap.shooterPort);
		jostleMotor = new TalonSRX(RobotMap.jostleMotorPort);
	}

	public static void shootMotorSet(double speed) {
		shooter.set(speed);

	}

	static SpeedController shooter;
	static SpeedController jostleMotor;
}