package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.ExampleSubsystem;
//Simular to the example subsystem this is a command file so we use the extends command to tell the code file that this is a command file and so we can use the methods like initialize execute end and isfinished
public class examplecommand extends Command{
    //this is where declare the variable and its type class which in this case is the ExampleSubsystem
    //we dont want create an object for the ExampleSubsyetem here because we want to use the one that is created in the RobotContainer file so multiple instances arent fighting over the same motors
    ExampleSubsystem subsystem; 
    //this is the what we are actualy calling when we call the command in the RobotContainer file
    //so we can give it multiple difrent prameters like speed or position
    public examplecommand(ExampleSubsystem subsystem){
        // "this.subsystem" refers to the class variable, while "subsystem" refers to the constructor parameter

        this.subsystem = subsystem;
        //this allows you to set which subsystem this command will use
        addRequirements(subsystem);

    }
    //this allows you to run code one time when the command is started
    @Override
    public void initialize(){

    } 
    //this method is constintly running after the command is started and is where the motors actualy move 
    @Override
    public void execute(){
        
    }
    //this is the method that runs when the command ends or is interrupted and runs once
    @Override
    public void end(boolean interrupted){

    }
    //this method is used to tell the command is finished and can be stopped this will return true when its finished and false when it is not
    @Override
    public boolean isFinished(){
        return false;
    }

    
}
                                                                    