package frc.robot.Subsytem;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.hardware.TalonFX;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType; 

public class intake extends SubsystemBase {
    private SparkMax motor5 = new SparkMax(10, MotorType.kBrushless);
    private SparkMax motor6 = new SparkMax(9, MotorType.kBrushless);
    private SparkMax motor7 = new SparkMax(14, MotorType.kBrushless);
        private DigitalInput beambreaker = new DigitalInput(0);



  
    public intake(){}

        @Override
        public void periodic(){
            SmartDashboard.putBoolean("Beam Break", beambreaker.get());
  
    }
    public void motor(double speed){
        motor5.set(-speed);
        motor6.set(speed);
        motor7.set(speed);
}
}