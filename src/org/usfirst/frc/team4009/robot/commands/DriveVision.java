package org.usfirst.frc.team4009.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4009.robot.Robot;

/**
 *
 */
public class DriveVision extends Command {
	public DriveVision() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.drive);
		requires(Robot.vision);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
        setTimeout(15);
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
        double leftMotor = Robot.vision.getLeftMotor();
        double rightMotor = Robot.vision.getRightMotor();

        double x = 0;
        double y = leftMotor + rightMotor;
        double rotation = leftMotor - rightMotor;
        Robot.drive.drive(x,y,rotation);
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return isTimedOut();
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
        Robot.drive.drive(0,0,0);
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
        end();
	}
}
