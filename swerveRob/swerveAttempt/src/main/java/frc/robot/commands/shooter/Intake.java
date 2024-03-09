// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.shooter;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.intakeSub;
import frc.robot.subsystems.shooter;

public class Intake extends Command {
  /** Creates a new Intake. */
  
  private final intakeSub in;
  public Intake(intakeSub in) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.in = in;
    addRequirements(in);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    in.runIntake(false);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    in.zero();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
