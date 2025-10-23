package frc.robot.Subsytem;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi. first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.hardware.TalonFX;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType; 

public class shooter extends SubsystemBase {
    private SparkMax motor3 = new SparkMax(13, MotorType.kBrushless);
    private SparkMax motor4 = new SparkMax(11, MotorType.kBrushless);
  
    public shooter(){}

        @Override
        public void periodic(){
  
    }
    public void motor(double speed){
        motor4.set(-speed);
        motor3.set(speed);

}
}