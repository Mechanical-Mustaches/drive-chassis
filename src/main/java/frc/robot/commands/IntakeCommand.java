package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.IntakeSubsystem;

public class IntakeCommand extends Command {
    IntakeSubsystem intake;

    public IntakeCommand(IntakeSubsystem intake){
        this.intake = intake;
    }
    @Override
    public void initialize(){
        intake.intakeSpin();
    }
    @Override
    public void end(boolean interupt){
        intake.intakeStop();
    }
}
