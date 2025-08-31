# Digital Library System 

A simple Java project demonstrating **OOP’s 4 Pillars** + **DSA**.

## Features
- Encapsulation → Private fields with getters/setters in `Book.java`
- Inheritance → `Student` and `Teacher` extend `User`
- Polymorphism → `borrow()` method overridden in `Student` & `Teacher`
- Abstraction → `User` provides a common blueprint
- DSA → `ArrayList` (for dynamic storage) & `HashMap` (for fast lookup)

## Project Structure
DigitalLibrarySystem/
│
├── src/
│ ├── Main.java
│ ├── Book.java
│ ├── Library.java
│ ├── User.java
│
└── README.md

## Run the Project
```bash
javac src/*.java
java -cp src Main
Available Books in Library:
Java Basics by James Gosling (Available)
DSA in Java by Robert Lafore (Available)
Effective Java by Joshua Bloch (Available)

Student Alice borrowed: Java Basics has been borrowed.
Teacher Mr. Bob borrowed: Java Basics is not available.
Teacher Mr. Bob borrowed: Effective Java has been borrowed.
Java Basics has been returned.

Available Books in Library:
Java Basics by James Gosling (Available)
DSA in Java by Robert Lafore (Available)
Effective Java by Joshua Bloch (Borrowed)

