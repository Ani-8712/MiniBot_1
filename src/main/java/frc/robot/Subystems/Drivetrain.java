package frc.robot.Subystems;

import java.util.function.DoubleSupplier;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class Drivetrain extends SubsystemBase {
    private double degrees;
    private TalonFX right;
    private TalonFX left;

    public Drivetrain(TalonFX l, TalonFX r){
        this.degrees = 0;
        this.right = r;
        this.left = l;
    }
    public void periodic(){
        this.right.set(ControlMode.Position, this.degrees);
        this.left.set(ControlMode.Position, this.degrees);
        
    }
    
    public void setDegs(double degrees2){
        this.degrees = degrees2;
    }
//gets encoder ticks for right motor
    public double getRightEncoderTicks() {
       return right.getSelectedSensorPosition();
    }
    //gets encoder ticks for left motor
    public double getLeftEncoderTicks(){
        return left.getSelectedSensorPosition();
    }
    
    

}
