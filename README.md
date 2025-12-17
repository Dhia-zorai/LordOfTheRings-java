# 💍 Lord of the Rings — OOP with Java 📜

## Project Overview

This repository contains a **Java implementation of a character management system** based on the **Lord of the Rings** universe. It was developed as part of a **Programming Oriented Object (POO)** exam.

The objective is to model different **Middle earth races** and **character archetypes** using core Java principles such as:

* Inheritance
* Abstract Classes
* Interfaces
* Encapsulation

---

## 🏗️ Technical Architecture

The project revolves around an **abstract base class** `Character`, which defines the shared attributes and behaviors of all Middle-earth inhabitants.

### Core Attributes

* `name`
* `health` (initialized to **100**)
* `position` → `(x, y)` coordinates
* `movementSpeed`
* `coins` (character currency)

### 💰 Currency Logic

Managing character wealth through the `coins` variable is a key part of the assignment.

### 🧭 Movement Logic

A `seDeplacer(t)` method calculates movement over time `t` in a **2D coordinate system**.

---

## 🧝 Races (Inheritance)

Each race **extends** the `Character` class and overrides its own `speaks()` method.

| Race    | Speed | Quote                                       |
| ------- | ----- | ------------------------------------------- |
| Humans  | 5     | "One does not simply walk into Mordor."     |
| Elves   | 7     | "A star shines on the hour of our meeting." |
| Dwarves | 2     | "May your beard grow ever longer."          |
| Hobbits | 5     | "All’s well that ends better."              |

---

## ⚔️ Combat & Skills (Interfaces)

To avoid bloating the inheritance tree, **interfaces** are used to define special abilities.

### 🗡️ Warrior Interface

```java
void attacks(Character p);
```

* Reduces the opponent’s health

### 🕵️ Thief Interface

```java
void steals(Character p);
```

* Transfers coins (`Coins`) between characters

This allows flexible combinations such as a **Warrior–Thief–Dwarf**.

---

## 💍 The One Ring (Special Logic)

A `SauronsRing` class implements the `Ring` abstraction and handles visibility logic.

### Ring Behavior

* `wear()` → sets visibility to `false`
* `remove()` → sets visibility to `true`

---

## 🚀 How to Run

### Requirements

* **JDK 8+**

### Clone the Repository

```bash
git clone https://github.com/yourusername/lotr-java-oop.git
```

### Run

Compile and run `Main.java` to see:

* Character initialization
* Dialogue triggers
* Interaction logic (e.g. *Durin stealing from and attacking Boromir*)

---

## 🎓 Learning Objectives

* Strengthen **Java OOP fundamentals**
* Use **Abstract Classes** for shared logic
* Apply **Interfaces** for multi-role characters
* Translate fantasy-world rules into **clean, maintainable Java code**

---

## 🛠️ Next Steps

Possible future extensions:

* GUI to visualize character movement on the `(x, y)` plane
* Add a `Magician` interface for spell-casting
* Implement a **Mount Doom** global event

---

## 📅 Academic Context

Developed for the **Java End of Semester 3 Test** — *December 2025*
