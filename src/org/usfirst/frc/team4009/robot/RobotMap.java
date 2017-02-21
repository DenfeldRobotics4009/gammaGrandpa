package org.usfirst.frc.team4009.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;

    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
    public static int joystick1Port = 0;
    public static int joystick2Port = 1;

    public static int jostleForwardButton = 2;  //FIX
    public static int jostleBackwardButton = 2;
    public static int jostleMotorPort = 2;
    public static int jostleCurrentSensorPort = 3;
    public static double jostleCurrentLimit = 2.0; //grabbed from https://github.com/DenfeldRobotics4009/2015_Lopez_Jr/blob/3e8d36a42f5733bd1f57c4d7ee33e832d50f9c98/setpoints.py#L20
    public static double jostleCurrentCooldown = 1.0;

    public static int intakeOffButton = 3;
    public static int intakeOnButton = 5;
    public static int intakeReverseButton = 11;
    public static int intakeMotorPort = 5;

    public static int gearButton = 3;
    public static int gearMotorPort = 0;
    public static int gearLimitSwitch = 3;

    public static int climbDownButton = 8;
    public static int climbUpButton = 7;

    public static int climberPort1 = 4;
    public static int climberPort2 = 3;


    //drive
    public static int frontLeftMotor = 7;
    public static int leftMotor = 5;
    public static int rearLeftMotor = 1;
    public static int frontRightMotor = 3;
    public static int rightMotor = 0;
    public static int rearRightMotor = 4;

    //shooter
    public static int shootButton = 1;
    public static int shooterMotor = 6;

}
