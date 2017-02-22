package org.usfirst.frc.team4009.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team4009.robot.AugmentedHolonomicDrive;
import org.usfirst.frc.team4009.robot.RobotMap;
import org.usfirst.frc.team4009.robot.commands.DriveStick;

import com.ctre.CANTalon;

/**
 *
 */
public class Drive extends Subsystem {

    static AugmentedHolonomicDrive drive;

    static final double DZ = 0.1;
    static final double twistDZ = 0.5;
    static final double pMin = 0.25; //Precision Minimum: Must be between 0-1 and less than pMax
    static final double pMax = 0.75; //Precision Maximum: Must be between 0-1 and more than pMin

    public Drive() {
        CANTalon frontLeftMotor  = new CANTalon(RobotMap.frontLeftMotorPort);
        CANTalon leftMotor       = new CANTalon(RobotMap.leftMotorPort);
        CANTalon rearLeftMotor   = new CANTalon(RobotMap.rearLeftMotorPort);
        CANTalon frontRightMotor = new CANTalon(RobotMap.frontRightMotorPort);
        CANTalon rightMotor      = new CANTalon(RobotMap.rightMotorPort);
        CANTalon rearRightMotor  = new CANTalon(RobotMap.rearRightMotorPort);
        drive = new AugmentedHolonomicDrive(
                frontLeftMotor,
                leftMotor,
                rearLeftMotor,
                frontRightMotor,
                rightMotor,
                rearRightMotor);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new DriveStick());
    }

    private static double deadZone(double input, double deadZone) {
        if ((input <= deadZone) || (input >= -deadZone)) {
            return 0;
        }
        else if (input > 0){
            return ((input-deadZone)/(1-deadZone));
        }
        return ((-input-deadZone)/(deadZone-1));
    }

    public static void drive(double x, double y, double rotation){
    	rotation += x* 0.1;
    	drive.drive(x,y,rotation);
    }

    public static void drive(Joystick stick){
        boolean isPrecisionMode = stick.getTrigger();
        double pMag = (stick.getThrottle() + 1) / 2;

        double pScale = 1;
        if (isPrecisionMode){
            pScale=(pMag*(pMax-pMin)+pMin);
        }

        double x = deadZone(stick.getX(), DZ) * pScale;
        double y = deadZone(stick.getX(), DZ) * pScale;
        double rotation = deadZone(stick.getX(), twistDZ) * pScale;
        drive(x,y,rotation);
    }
}

