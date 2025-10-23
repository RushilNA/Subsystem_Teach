package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsytem.pivot;

public class PIDcommand extends Command{
    pivot subsystem; 
    double setpoint;
    boolean end;

    public PIDcommand(pivot subsystem, double setpoint, boolean end){
        this.subsystem = subsystem;
        this.setpoint = setpoint;
        this.end = end;
        
        
        addRequirements(subsystem);

    }

    @Override
    public void initialize(){
        subsystem.resetpid();
        

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
        return (setpoint+0.5 < subsystem.getmotorposition() || subsystem.getmotorposition() < setpoint -0.5) &&end;        
    }

    
}

