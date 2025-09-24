// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.commands.PIDcommand;
import frc.robot.commands.Shooters;
import frc.robot.commands.intake;
import frc.robot.commands.intakecmd;
import frc.robot.commands.shooter;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
  private final CommandXboxController joy = new CommandXboxController(0);
  private final frc.robot.commands.pivot pivot = new frc.robot.commands.pivot();
  private final PIDcommand pidhomecmd = new PIDcommand(pivot, 0);
  private final PIDcommand pidshooterposition = new PIDcommand(pivot, -10.6279296875);
  private final shooter shootersub = new shooter();
  private final intake intakesub = new intake();

  private final Shooters shooter = new Shooters(shootersub, 0.5);
  private final Shooters shooterstop = new Shooters(shootersub, 0);
  private final intakecmd intake = new intakecmd(intakesub, 0.5);
  private final intakecmd intakestop = new intakecmd(intakesub, 0);
  
  

  // Replace with CommandPS4Controller or CommandJoystick if needed


  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {

    // Configure the trigger bindings
    configureBindings();
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {


    // Schedule `exampleMethodCommand` when the Xbox controller's B button is pressed,
    // cancelling on release.


  joy.y().whileTrue(new SequentialCommandGroup(pidshooterposition,new ParallelCommandGroup(pidshooterposition,shooter)) ).whileFalse(new ParallelCommandGroup(pidshooterposition,new ParallelCommandGroup(pidshooterposition,shooter)) );

  



  //to do list
  //first show them good naming conventions
  //do sequential commands 
    // need to reiterate how to finish the command 
  // parralel 
  //.then . stuff
  // make commands in the subsystem 
  // show them how to do stuff like 
  // make them make actual bindings
  //
  
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return null;
  }
}
