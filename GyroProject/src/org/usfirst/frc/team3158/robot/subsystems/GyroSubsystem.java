package org.usfirst.frc.team3158.robot.subsystems;

import org.usfirst.frc.team3158.robot.Navx;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GyroSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Navx navx;
	
	public GyroSubsystem() {
		super();
		navx = new Navx();
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void printGyro(){
    	System.out.println("Navx: " + navx.getYaw());
    	
    }
    public double getAngleNavx() {
    	return navx.getYaw();
    }
    public void getNavxInfo() {
    	navx.run();
    }
}