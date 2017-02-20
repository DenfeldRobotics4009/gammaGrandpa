package org.usfirst.frc.team4009.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team4009.robot.commands.ExampleCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	public OI(){
		joystick1 = new Joystick (RobotMap.joystick1Port);
		joystick2 = new Joystick (RobotMap.joystick2Port);
		shoot = joystick2.getTrigger();
		intakeOn = new JoystickButton(joystick2, RobotMap.intakeOnButton);
		intakeOff = new JoystickButton(joystick2, RobotMap.intakeOffButton);
		intakeReverse = new JoystickButton(joystick2, RobotMap.intakeReverseButton);
		jostleForward = new JoystickButton(joystick2, RobotMap.jostleForwardButton);
		jostleBackward = new JoystickButton(joystick2, RobotMap.jostleBackwardButton);
		gear = new JoystickButton(joystick1, RobotMap.gearButton);
		climbUp = new JoystickButton(joystick2, RobotMap.climbUpButton);
		climbDown = new JoystickButton(joystick2, RobotMap.climbDownButton);
		
	}
	public static Joystick joystick1;			//Driver
	public static Joystick joystick2;			//Operator
	public static Boolean shoot;				//While held
	public static Button intakeOn;				//Press and release
	public static Button intakeOff;				//Press and release
	public static Button intakeReverse;			//While held
	public static Button jostleForward;				//While shooter is on
	public static Button jostleBackward;
	public static Button climbUp;				//While held
	public static Button climbDown;				//While held
	public static Button gear;					//
	
}
