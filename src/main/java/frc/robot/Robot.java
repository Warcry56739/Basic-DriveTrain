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
  public static final int left=
  public static final int right=
  /**
   * Initialize your motor controllers here
   * 
   * Pop quiz! How many motor controllers do we have? Make sure you initialize all of them
   *4 motor controllers
   */ 

  // private  final CANSparkMax motorcntrl_name = new CANSparkMax(cntrlID, MotorType.kBrushless);  
  private final CANSparkMax m_left1 = new CANSparkMax(1, MotorType.kBrushless);
  private final CANSparkMax m_left2= new CANSparkMax(2, MotorType.kBrushless);
  private final CANSparkMax m_right1= new CANSparkMax(3, MotorType.kBrushless);
  private final CANSparkMax m_right2= new CANSparkMax(4,MotorType.kBrushless);
  
  /*Initialize your drivetrain here
  * private final DifferentialDrive name = new DifferentialDrive( left , right );
  * NOTE: you can only have one left side and one right side motor controller in the drivetrain object
  */
  private final DifferentialDrive Cbt = new DifferentialDrive(m_left1 , m_right1);
  
  //Initialize your Joystick here
  //private final Joystick name = new Joystick(port);
  private final Joystick CBJ = new Joystick(0);
  /**
   * Pop quiz! When does this method run?
   * When the code starts/
   * */
  @Override
  public void robotInit() {}

  /**
   * Pop quiz! When does this method run?
   * during the teleop period
   * */
  
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
     m_left2.follow(m_left1);
     m_right2.follow(m_right1);
     //make it drive
     //drivetrain_name.arcadeDrive(speed, rotation);
    Cbt.arcadeDrive(CBJ.getY(), CBJ.getX());
    
  }
}
