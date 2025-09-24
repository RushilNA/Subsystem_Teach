// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;



import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
//Use the extends subsytembase to tell the code file that this is a subsystem file and so we can use the methods like periodic
//Subsystems are used to control motors and read sensors
public class ExampleSubsystem extends SubsystemBase {
  //This is where you initialize motors sensors PID controllers and other things you need for your subsystem
    private TalonFX pivot = new TalonFX(1);
    private PIDController pivotPID = new PIDController(0, 0, 0);
    







   
  
 // this method allows us to run code one time when the subsystem is created simular to the initialize method in the commands
  public ExampleSubsystem() {
  


  }



  // this method is constintly running after the object is created and can be used to update values on smaertdashboard or other things that need to be updated constintly
  @Override
  public void periodic() {
    SmartDashboard.putNumber("pivot", pivot.getPosition().getValueAsDouble() );
    SmartDashboard.putBoolean("pivot", pivot.getPosition().getValueAsDouble() < 15);
    
  }
//this method is an example of a method that is used to get the position of the motor that has a return type of a double
//think of this as the hellping methods basicly allowing the command to get information from the subsystem
  public double getPosition(){
    return pivot.getPosition().getValueAsDouble();
    



  }

  //this method is an example of a method that is used to set the speed of the motor that has a parameter of a double and no return type
  //these void methods can be thought of as the action method basicly allowing the command to tell the subsystem what to do

  public void speed1(double speed1){
   
   pivot.set(speed1);


  }
  
  



  


  

  



  
}

