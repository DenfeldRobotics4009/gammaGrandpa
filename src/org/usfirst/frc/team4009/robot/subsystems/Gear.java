package org.usfirst.frc.team4009.robot.subsystems;

import org.usfirst.frc.team4009.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class Gear extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public Gear(){
    	gearPlacer = new TalonSRX(RobotMap.gearPort);
    	gearLimitSwitch = new DigitalInput(RobotMap.gearLimitSwitchPort);
    }
    
    public static void gearMotorSet(double speed){
    	// implement
    	gearPlacer.set(speed);
    }

    public static SpeedController gearPlacer;
    public static DigitalInput gearLimitSwitch;
}

