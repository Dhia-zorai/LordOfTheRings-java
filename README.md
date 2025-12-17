💍 Lord of the Rings: OOP with Java
📜 Project Overview
This repository contains a Java implementation of a character management system based on the Lord of the Rings universe. This was developed as part of a Programming Oriented Object (POO) exam.

The goal of this project was to model different Middle earth races and character archetypes using core Java principles like Inheritance, Abstract Classes, Interfaces, and Encapsulation.

🏗️ Technical Architecture
The project is structured around an abstract base class Character which defines the foundational attributes for any inhabitant of Middle-earth:

Attributes: Name, Health (initialized at 100), Position (x, y), Movement Speed, and Currency.

The "Coins" Variable: A key part of the assignment was managing character wealth through the (coins/money) variable.

Movement Logic: Includes a seDeplacer method that calculates character movement over time t in a 2D coordinate system.

🧝 Races (Inheritance)
Each race extends the Character class and implements its own unique speaks() method:

Humans: Speed 5, says "One does not simply walk into Mordor."

Elves: Speed 7, says "A star shines on the hour of our meeting."

Dwarves: Speed 2, says "May your beard grow ever longer."

Hobbits: Speed 5, says "All’s well that ends better."

⚔️ Combat & Skills (Interfaces)
To handle special abilities like attacking or stealing without cluttering the main inheritance tree, I used Interfaces:

Warrior: Defines attacks(Character p) to reduce an opponent's health.

Thief: Defines steals(Character p) to transfer "sous" (coins) between characters.

💍 The One Ring (Special Logic)
The project also includes a SauronsRing class that implements a Ring abstraction. It handles visibility logic:

wear(): Sets visibility to false.

remove(): Sets visibility to true.

🚀 How to Run
Ensure you have JDK 8+ installed.

Clone the repository:

Bash

git clone https://github.com/yourusername/lotr-java-oop.git
Compile and run the Main.java file to see a simulation of:

Character stats initialization.

Dialogue triggers.

Interaction logic (e.g., Durin stealing from and attacking Boromir).

🎓 Learning Objectives
Solidifying JAVA skills through more complicated projects.

Implementing Abstract Classes for shared logic.

Using Interfaces for multi-role characters (like a Warrior-Thief-Dwarf).

Translating real-world (or fantasy-world) requirements into clean, encapsulated Java code.

🛠️ Next Steps
I might expand this by:

Adding a GUI to visualize the character movement on the (x, y) plane.

Adding a Magicien interface for spell-casting logic.

Implementing a "Mount Doom" event.

Developed for the "Java End Of Semester 3 test" - December 2025.
