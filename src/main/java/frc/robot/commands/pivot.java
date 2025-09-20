package frc.robot.commands;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.controls.MotionMagicVoltage; 
import com.ctre.phoenix6.hardware.TalonFX; 

public class pivot extends SubsystemBase {
    private TalonFX motor = new TalonFX(30);
    private PIDController pid = new PIDController(0.05                                                                                                                                                                                                                                                                                                                                                                                                              , 0, 0);
    private TalonFX motor2 = new TalonFX(31);

    public pivot(){

    }
    @Override
    public void periodic(){
        motor2.setControl(new Follower(30, true));
        SmartDashboard.putNumber("motor position", motor.getPosition().getValueAsDouble());
SmartDashboard.putNumber("Motor", motor.getPosition().getValueAsDouble());
        

    }
    public void motor(double speed){
        motor.set(speed);
    
    }
    public void pidmotor(double setpoint){
        double output = pid.calculate(motor.getPosition().getValueAsDouble(),setpoint);
        motor.set(output);

    }



}