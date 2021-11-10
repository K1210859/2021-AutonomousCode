package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

public class Wait extends CommandBase
{
    private double startTime;
    private double time;

    public Wait(double time)
    {
        startTime = 0;
        this.time = time;
    }

    @Override
    public void initialize()
    {
        startTime = Timer.getFPGATimestamp();
        DriveTrain.arcadeSpeed = 0;
        DriveTrain.leftSpeed = 0;
        DriveTrain.rightSpeed = 0;
    }

    @Override
    public void execute()
    {

    }

    @Override
    public boolean isFinished()
    {
        return Timer.getFPGATimestamp() - startTime >= time;
    }

    @Override
    public void end(boolean interrupted)
    {
        startTime = Timer.getFPGATimestamp();
        time = 0;
    }
    
}
