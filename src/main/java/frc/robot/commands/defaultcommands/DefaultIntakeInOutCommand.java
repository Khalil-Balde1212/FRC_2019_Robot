package frc.robot.commands.defaultcommands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.oi.OI;
import frc.robot.subsystems.IntakeInOutSubsystem;

public class DefaultIntakeInOutCommand extends Command {
    private IntakeInOutSubsystem c_intakeInOut = Robot.getIntakeInOutSubsystem();

    public DefaultIntakeInOutCommand() {
        requires(c_intakeInOut);
    }
    @Override
    public void execute() {
        boolean intakeIn = OI.getOperatorIntakeIn();
        boolean intakeOut = OI.getOperatorIntakeOut();
        if(!(intakeIn && intakeOut)) { //Precaution: makes sure both aren't pressed at the same time
            if(intakeIn) {
                c_intakeInOut.in(true);
            } else {
                c_intakeInOut.out(true);
            }
        }
        if(!intakeIn) { //turns off if not pressed
            c_intakeInOut.in(false);
        }
        if(!intakeOut) { //turns off if not pressed
            c_intakeInOut.out(false);
        }
    }
    
    @Override
    public boolean isFinished() {
        return false;
    }
}