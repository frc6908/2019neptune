/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.hatchintake;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class IntakeHatch extends Command {
  public IntakeHatch() {
    setInterruptible(true);
    requires(Robot.hatchIntake);
  }

  @Override
  protected void initialize() {
    Robot.hatchIntake.intake();
  }

  @Override
  protected void execute() {
  }

  @Override
  protected boolean isFinished() { 
    return false;
  }

  @Override
  protected void end() {
  }

  @Override
  protected void interrupted() {
  }
}
