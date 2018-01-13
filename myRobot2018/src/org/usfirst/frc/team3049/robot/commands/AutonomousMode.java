package org.usfirst.frc.team3049.robot.commands;

import org.usfirst.frc.team3049.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3049.robot.commands.DriveStraightCommand;

/**
 *
 */
public class AutonomousMode extends Command {
	private static Drivetrain m_drivetrain;
	private static double m_time;

    public AutonomousMode(Drivetrain drivetrain, double time) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	m_drivetrain = drivetrain;
        m_time = time;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // This is where all of the Autonomous Directions are coded
    protected void execute() {
    	
    	m_drivetrain.drive(-0.5,0);
    	
    	//new DriveStraightCommand(m_drivetrain, 0.5); // time (s), speed
    	//turnRight(3, 0.5); // time (s), speed
    	//turnLeft(3, 0.5); // time (s), speed
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	timeSinceInitialized();
    	setTimeout(m_time);
    	if(isTimedOut()){
    		return true;
    	};
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
    
    
//    protected void driveStraight(double time, double speed){
//    	m_drivetrain.drive(-speed, 0); // fwd/aft,left/right
//    }
//    
//    
//    protected void turnRight(double time, double speed) {
//    	m_drivetrain.drive(0,speed);
//    }
//    
//    protected void turnLeft(double time, double speed) {
//    	m_drivetrain.drive(0,-speed);
//    }
    
    
    
    
    
    
}
