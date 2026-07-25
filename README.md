# Object-Oriented Programming - Week 1 Lab

- **Student:** Huzaifa Mukhtar
- **Seat number:** B25110006058
- **Section:** B
- **Date:** 25 July 2026

## Files in this folder

- `CarDemo` contains my `Car` class, the program I used to test it, and its UML diagram.
- `CalculatorDemo` contains the calculator class, its test program, and its UML diagram.
- `Documentation` contains the lab PDF, Laptop UML, stack and heap diagram, reflection, work plan, and my viva notes.
- `SampleOutput.txt` contains the output I got after running both programs.

I kept the `CarDemo` and `CalculatorDemo` folder names because they are the names used in the lab manual. Separate folders also allow both programs to have their own `Main.java`.

## Running the programs

For the car program, open a terminal in `CarDemo` and run:

```text
javac Car.java Main.java
java Main
```

For the calculator program, open a terminal in `CalculatorDemo` and run:

```text
javac Calculator.java Main.java
java Main
```

## Notes about my code

I kept the fields in `Car` private and changed them through methods. The car cannot move when its engine is off or its fuel is empty. Its speed cannot go below zero, and stopping the engine also resets the speed, gear, and turbo mode.

The two car objects in `Main` keep separate values even though they use the same class. The calculator checks division and modulus by zero, and it also checks that `average()` and `maximum()` receive at least one number.
