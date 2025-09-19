// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.command;

public class RobotContainer {
  // This is where you initialize your subsystems, controlers and other things that need to be initialized
  CommandXboxController joystick = new CommandXboxController(3); //joystick; use the command xbox controller class for easy button bindings
  ExampleSubsystem subsystem = new ExampleSubsystem();//Example subsystem initialization
  command command = new command(subsystem, 0.32);//This is an example of how to initialize a command 
  command zero = new command(subsystem, 0);
  public RobotContainer() {
    configureBindings();
  }
  // configureBindings is where you bind buttons to commands
  private void configureBindings() { 
    //joy is our controller
    //whileTrue means while the button is held down
    //whileFalse means while the button is not held down
    //we want a while false so that when we let go of the button the motor stops or goes back to home position if we are using a PID controller
    
    joystick.a().whileTrue(command).whileFalse(zero);
    //this is another way of initilizing the command without creating a new variablel
    joystick.b().whileTrue(new command(subsystem, -0.32)).whileFalse(new command(subsystem, 0));



  }
//this is where you return the auto command I will explain that more when we go over swerve drive
  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
