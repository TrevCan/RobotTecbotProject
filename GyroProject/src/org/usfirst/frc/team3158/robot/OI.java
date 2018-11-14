package org.usfirst.frc.team3158.robot;


import org.usfirst.frc.team3158.robot.commands.PrintCommand;
import org.usfirst.frc.team3158.robot.commands.gyro.PrintValuesCommandGyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	public Joystick pilot;
	JoystickButton a;	//a button
	JoystickButton b;	//b button

	public OI() {
		pilot = new Joystick(0);
		a = new JoystickButton(pilot,1);
		b = new JoystickButton(pilot,2);
		a.whenPressed(new PrintValuesCommandGyro());
		b.whenPressed(new PrintCommand());
		Robot.moveChassis.drive(pilot.getX(), pilot.getY());
	}
}