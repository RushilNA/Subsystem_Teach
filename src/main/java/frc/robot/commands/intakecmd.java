package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;

public class intakecmd extends Command{
    intake subsystem; 
    double speed;

    public intakecmd(intake subsystem, double speed){
        this.subsystem = subsystem;
        this.speed = speed;
        addRequirements(subsystem);

    }

    @Override
    public void initialize(){
        

    } 

    @Override
    public void execute(){
        subsystem.motor(speed);
        
        
        
    }
    @Override
    public void end(boolean interrupted){

    }
    @Override
    public boolean isFinished(){
        return false;
    }

    
}
