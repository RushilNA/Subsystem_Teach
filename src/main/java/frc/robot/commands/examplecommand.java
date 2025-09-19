package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.ExampleSubsystem;

public class examplecommand extends Command{
    ExampleSubsystem subsystem; 

    public examplecommand(ExampleSubsystem subsystem, double speed){
        this.subsystem = subsystem;
        
        addRequirements(subsystem);

    }

    @Override
    public void initialize(){

    } 

    @Override
    public void execute(){
        
    }
    @Override
    public void end(boolean interrupted){

    }
    @Override
    public boolean isFinished(){
        return false;
    }

    
}
                                                                    