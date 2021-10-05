/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends TimedRobot {

  //Joysticks
  Joystick leftJoy = new Joystick(0);
  Joystick rightJoy = new Joystick(1);

  //Motor Controllers (Left Side)
  Spark sparkL1 = new Spark(0);
  Spark sparkL2 = new Spark(1);
  Spark sparkL3 = new Spark(2);

  //Motor Controllers (Right Side)
  Spark sparkR1 = new Spark(3);
  Spark sparkR2 = new Spark(4);
  Spark sparkR3 = new Spark(5);

  SendableChooser<Number> speed = new SendableChooser<>();

  @Override
  public void robotInit() {
    SmartDashboard.putBoolean("Reverse Left Drivetrain?", false);
    SmartDashboard.putBoolean("Reverse Right Drivetrain?", true);
    SmartDashboard.putNumber("Speed Percentage", 100);
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {

    double driveSpeed = SmartDashboard.getNumber("Speed Percentage", 100)/100;
    
  //The robot may drive backwards or spin around due to different drivetrain configurations.
  //Play with these SmartDashboard parameters so it drives correctly.
    if(SmartDashboard.getBoolean("Reverse Left Drivetrain?", true)){
      sparkL1.set(-leftJoy.getY() * driveSpeed);
      sparkL2.set(-leftJoy.getY() * driveSpeed);
      sparkL3.set(-leftJoy.getY() * driveSpeed);
    } else {
      sparkL1.set(leftJoy.getY() * driveSpeed);
      sparkL2.set(leftJoy.getY() * driveSpeed);
      sparkL3.set(leftJoy.getY() * driveSpeed);
    }

    if(SmartDashboard.getBoolean("Reverse Right Drivetrain?", false)){
      sparkR1.set(-rightJoy.getY() * driveSpeed);
      sparkR2.set(-rightJoy.getY() * driveSpeed);
      sparkR3.set(-rightJoy.getY() * driveSpeed);
    } else {
      sparkR1.set(rightJoy.getY() * driveSpeed);
      sparkR2.set(rightJoy.getY() * driveSpeed);
      sparkR3.set(rightJoy.getY() * driveSpeed);
    }
    
  }

  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
  }

}
