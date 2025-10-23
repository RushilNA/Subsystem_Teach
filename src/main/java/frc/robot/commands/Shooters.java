package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsytem.shooter;

public class Shooters extends Command{
    shooter subsystem; 
    double speed;

    public Shooters(shooter subsystem, double speed){
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
