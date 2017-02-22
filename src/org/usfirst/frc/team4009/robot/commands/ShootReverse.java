package org.usfirst.frc.team4009.robot.commands;

import org.usfirst.frc.team4009.robot.subsystems.Shoot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShootReverse extends Command {

    public ShootReverse() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Shoot.shootMotorSet(-1);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Shoot.shootMotorSet(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
