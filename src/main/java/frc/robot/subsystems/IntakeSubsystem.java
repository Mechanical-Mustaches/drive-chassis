package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
    private CANSparkMax intake_left = new CANSparkMax(9, MotorType.kBrushless);
    private CANSparkMax intake_right = new CANSparkMax(25, MotorType.kBrushless);

    public IntakeSubsystem(){
        intake_right.follow(intake_left, true);
        intake_right.setIdleMode(IdleMode.kCoast);
        intake_left.setIdleMode(IdleMode.kCoast);
    }
    public void intakeSpin(){
        intake_left.set(0.3);
    }
    public void intakeStop(){
        intake_left.set(0);
    }
}
