// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;



import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsystem extends SubsystemBase {
    private TalonFX pivot = new TalonFX(1);
    private PIDController pivotPID = new PIDController(0, 0, 0);
    double x = 3;
    double y= 4;
    double new1;







   
  
 
  public ExampleSubsystem() {


  }



  
  @Override
  public void periodic() {
    SmartDashboard.putNumber("pivot", pivot.getPosition().getValueAsDouble() );
    SmartDashboard.putBoolean("pivot", pivot.getPosition().getValueAsDouble() < 15);
    
  }

  public double getPosition(){
    return pivot.getPosition().getValueAsDouble();
    



  }

  public void speed1(double speed1){
   
   pivot.set(speed1);


  }
  
  



  


  

  



  
}

