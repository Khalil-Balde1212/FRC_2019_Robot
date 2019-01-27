package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.defaultElevatorCommand;
import frc.robot.constants.RobotMap;

public class ElevatorSubsystem extends Subsystem {
    private CANSparkMax elevatorMotor1 = new CANSparkMax(RobotMap.ELEVATOR_MOTOR_MASTER_ADDRESS, MotorType.kBrushless);
    private CANSparkMax elevatorMotor2 = new CANSparkMax(RobotMap.ELEVATOR_MOTOR_SLAVE_ADDRESS, MotorType.kBrushless);

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new defaultElevatorCommand());
    }
}