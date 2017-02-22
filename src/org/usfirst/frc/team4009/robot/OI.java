package org.usfirst.frc.team4009.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team4009.robot.commands.ClimbUp;
import org.usfirst.frc.team4009.robot.commands.GearDeploy;
import org.usfirst.frc.team4009.robot.commands.GearReset;
import org.usfirst.frc.team4009.robot.commands.IntakeOff;
import org.usfirst.frc.team4009.robot.commands.IntakeOn;
import org.usfirst.frc.team4009.robot.commands.IntakeReverse;
import org.usfirst.frc.team4009.robot.commands.JostleAndShoot;
//import org.usfirst.frc.team4009.robot.commands.JostleReverse;
import org.usfirst.frc.team4009.robot.commands.ShootReverse;

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
	public OI() {
		joystick1 = new Joystick(RobotMap.joystick1Port);
		joystick2 = new Joystick(RobotMap.joystick2Port);
		shoot = new JoystickButton(joystick2, RobotMap.shoot);
		shooterReverse = new JoystickButton(joystick2, RobotMap.shooterReverseButton);
		intakeOn = new JoystickButton(joystick2, RobotMap.intakeOnButton);
		intakeOff = new JoystickButton(joystick2, RobotMap.intakeOffButton);
		intakeReverse = new JoystickButton(joystick2, RobotMap.intakeReverseButton);
		jostle = new JoystickButton(joystick2, RobotMap.jostleButton);
		//jostleReverse = new JoystickButton(joystick2, RobotMap.jostleReverseButton);
		gearPlacer = new JoystickButton(joystick1, RobotMap.gearButton);
		gearReset = new JoystickButton(joystick1, RobotMap.gearButton);
		climbUp = new JoystickButton(joystick2, RobotMap.climbUpButton);

		shoot.whileHeld(new JostleAndShoot());
		shooterReverse.whileHeld(new ShootReverse());
		intakeOn.whenPressed(new IntakeOn());
		intakeOff.whenPressed(new IntakeOff());
		intakeReverse.whileHeld(new IntakeReverse());
		gearPlacer.whileHeld(new GearDeploy());
		gearReset.whenReleased(new GearReset());
		climbUp.whenPressed(new ClimbUp());
		jostle.whileHeld(new JostleAndShoot());
		//jostleReverse.whileHeld(new JostleReverse());
		// maybe add climbDown
	}

	public static Joystick joystick1;
	public static Joystick joystick2;
	public static Button shoot;
	public static Button intakeOn;
	public static Button intakeOff;
	public static Button intakeReverse;
	public static Button jostle;
	//public static Button jostleReverse;
	public static Button climbUp;
	public static Button climbDown;
	public static Button gearPlacer;
	public static Button gearReset;
	public static Button shooterReverse;
}
