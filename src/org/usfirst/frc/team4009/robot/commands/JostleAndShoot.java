package org.usfirst.frc.team4009.robot.commands;
import edu.wpi.first.wpilibj.Timer;
import org.usfirst.frc.team4009.robot.subsystems.Jostle;
import org.usfirst.frc.team4009.robot.subsystems.Shoot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class JostleAndShoot extends Command {

    public JostleAndShoot() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	lastReset = new Timer();
    	lastReset.reset();
    	jostleSpeed = 1;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Shoot.shootMotorSet(1);
    	if(lastReset.hasPeriodPassed(0.5)){
    		Jostle.jostleMotorSet(jostleSpeed);
    		if (Math.abs(Jostle.currentSensor.getVoltage() - .55) > .35){
    			jostleSpeed = -jostleSpeed;
    			lastReset.reset();
    		}
    	}
    	else{
    		Jostle.jostleMotorSet(0);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	lastReset.reset();
    	Jostle.jostleMotorSet(0);
    	Shoot.shootMotorSet(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
Timer lastReset;
double jostleSpeed;
}