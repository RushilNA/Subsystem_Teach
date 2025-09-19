package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.ExampleSubsystem;

public class command extends Command{
    ExampleSubsystem subsystem; 
    double speed;

    public command(ExampleSubsystem subsystem, double speed){
        this.subsystem = subsystem;
        this.speed = speed;
        addRequirements(subsystem);

    }

    @Override
    public void initialize(){

    } 

    @Override
    public void execute(){
        subsystem.speed1(speed);
        
    }
    @Override
    public void end(boolean interrupted){

    }
    @Override
    public boolean isFinished(){
        return subsystem.getPosition() > 4;
    }

    
}
                                                                    