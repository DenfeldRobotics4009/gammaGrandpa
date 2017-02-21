package org.usfirst.frc.team4009.robot.subsystems;

import org.usfirst.frc.team4009.robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climber extends Subsystem {

    TalonSRX climber1;
    TalonSRX climber2;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    public Climber(){
        climber1 = new TalonSRX(RobotMap.climberPort1);
        climber2 = new TalonSRX(RobotMap.climberPort2);

    }

    public void set(double speed){
        climber1.set(speed);
        climber2.set(-speed);
    }

}

