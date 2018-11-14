package org.usfirst.frc.team3158.robot.commands.gyro;
import org.usfirst.frc.team3158.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class GyroMeasureCommand extends Command {

    public GyroMeasureCommand() {
    	super();
        requires(Robot.gyroSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.gyroSubsystem.printGyro();
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return((Robot.gyroSubsystem.getAngleNavx()>=90)? true: false);
        
        /*	OR ALL THIS CODE
         * if(Robot.gyroSubsystem.getAngleNavx() >= 90){
        	return true;
        	}
        else{return false;}*/
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
