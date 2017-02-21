package org.usfirst.frc.team4009.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team4009.robot.AugmentedHolonomicDrive;
import org.usfirst.frc.team4009.robot.RobotMap;
import org.usfirst.frc.team4009.robot.commands.DriveStick;

import com.ctre.CANTalon;

/**
 *
 */
public class Drive extends Subsystem {

    AugmentedHolonomicDrive drive;

    static final double DZ = 0.1;
    static final double twistDZ = 0.5;
    static final double pMin = 0.25; //Precision Minimum: Must be between 0-1 and less than pMax
    static final double pMax = 0.75; //Precision Maximum: Must be between 0-1 and more than pMin

    public Drive() {
        CANTalon frontLeftMotor  = new CANTalon(RobotMap.frontLeftMotor);
        CANTalon leftMotor       = new CANTalon(RobotMap.leftMotor);
        CANTalon rearLeftMotor   = new CANTalon(RobotMap.rearLeftMotor);
        CANTalon frontRightMotor = new CANTalon(RobotMap.frontRightMotor);
        CANTalon rightMotor      = new CANTalon(RobotMap.rightMotor);
        CANTalon rearRightMotor  = new CANTalon(RobotMap.rearRightMotor);
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

    public void drive(double x, double y, double rotation){
        drive.drive(x,y,rotation);
    }

    public void drive(Joystick stick){
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

