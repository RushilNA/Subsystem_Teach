package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;

public class PIDcommand extends Command{
    pivot subsystem; 
    double setpoint;

    public PIDcommand(pivot subsystem, double setpoint){
        this.subsystem = subsystem;
        this.setpoint = setpoint;
        
        
        addRequirements(subsystem);

    }

    @Override
    public void initialize(){
        

    } 

    @Override
    public void execute(){
        subsystem.pidmotor(setpoint);
        
        
        
    }
    @Override
    public void end(boolean interrupted){

    }
    @Override
    public boolean isFinished(){
        return false;
    }

    
}

