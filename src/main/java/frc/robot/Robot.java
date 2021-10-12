/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

/**
 * Import statements
 * ~ All the classes you need to make the robot work ~ 
 */
package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
// import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

/**
 * Robot Class, where all your code goes.
 * all of your comments should have an example underneath of it to help you
 * 
 * NOTE: standard naming conventions: m_name
 * Why? IDK that's just the way its done
    * e.g m_robotdrive
          m_joystick
 */
public class Robot extends TimedRobot {

  //if you want any variables put them here
  //public static final int name = value;
  

  /**
   * Initialize your motor controllers here
   * 
   * Pop quiz! How many motor controllers do we have? Make sure you initialize all of them
   */

  // private final CANSparkMax motorcntrl_name = new CANSparkMax(cntrlID, MotorType.kBrushless);  
  
  /*Initialize your drivetrain here
  * private final DifferentialDrive name = new DifferentialDrive( left , right );
  * NOTE: you can only have one left side and one right side motor controller in the drivetrain object
  */

  //Initialize your Joystick here
  //private final Joystick name = new Joystick(port);

  /**
   * Pop quiz! When does this method run?
   */
  @Override
  public void robotInit() {
  }

  /**
   * Pop quiz! When does this method run?
   */
  @Override
  public void teleopPeriodic() {
    //We want to drive with arcade drive!
    /**
     * NOTE: If you have more than 2 motor controllers (I'm not saying you should or should not but if you do)
     * you need to make a "lead" motor for each side (left and right) that will receive the commands and the other
     * ones need to "follow" those motors
     * 
     * If you only have 2 motor controllers then you're golden!
     */
    
     //follow cmd
     //motorcntrl.follow(leadercntrl);

     //make it drive
     //drivetrain_name.arcadeDrive(speed, rotation);
  }
}
