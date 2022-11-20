package frc.robot.Commands;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Subystems.Drivetrain;

public class DriveTeleop extends CommandBase {
    private BooleanSupplier isXButton;
    private double degrees;
    private Drivetrain m_drivetrain;
     
    public DriveTeleop(BooleanSupplier x, double deg, Drivetrain drvtrn){
        this.isXButton = x;
        this.degrees = deg;
        this.m_drivetrain = drvtrn;
        addRequirements(this.m_drivetrain);//why do we do this? idk. Maybe I'll find out soon. Just use the good ol' ask Edward or Mikita

    }


    public void execute(){
        if (this.isXButton.getAsBoolean()){
            this.degrees = 90.0;
        }
        this.m_drivetrain.setDegs(this.degrees);
    }
}
