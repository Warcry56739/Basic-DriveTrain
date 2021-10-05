# Tank-Drive
Simple code for operating a Tank Drive practice bot.

## Features
- Simple, direct control of Tank Drive robots with up to six motor controllers (three per side)
- Each side reversable via SmartDashboard to suit different configurations
- SmartDashboard-based speed throttling

## Instructions
**Warning: If using more than one motor per side of the drivetrain, ensure all motors are spinning the correct (same) directions and are wired correctly. Not doing so may result in burned motors or stripped gearboxes.**
#### Wire Motor Controllers:
PWM Configuration is as follows (use of all PWM ports not required):
- Left side of drivetrain uses PWM ports 0, 1, 2
- Right side of drivetrain uses PWM ports 3, 4, 5

#### Connect Joysticks:
This program requires the use of two flightsticks on USB ports 0 & 1, representing left and right, respectively.

#### Deploy, Test, and Edit SmartDashboard Configuration
Depending on the robot's physical and electrical configuration, the robot may behave incorrectly, spinning around or driving backwards. If so, follow these steps to change parameters found in SmartDashboard:
- If robot moves inversely to the joysticks' movements, change *both* SmartDashboard parameters (true to false, false to true)
- If robot spins around when both joysticks are pressed forward, change *one* SmartDashboard parameter. If this results in the robot driving backwards, change *both* SmartDashboard parameters.

To throttle the speed of the drivetrain, change the "Speed Percentage" SmartDashboard number to another value between 0 and 100 (default is 100).
