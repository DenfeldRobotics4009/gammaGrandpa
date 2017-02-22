package org.usfirst.frc.team4009.robot.subsystems;

import org.usfirst.frc.team4009.robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climber extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public Climber(){
    	climber1 = new TalonSRX(RobotMap.climberPort1);
    	climber2 = new TalonSRX(RobotMap.climberPort2);
    
    }

    public static void climbMotorSet(double speed){
    	climber1.set(-speed);
    	climber2.set(speed);
    }
    
    
    public static SpeedController climber1;
    public static SpeedController climber2;
    
}

