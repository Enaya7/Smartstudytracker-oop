Smart Study Tracker – Java OOP Project
Project Overview
Smart Study Tracker is a simple Java console application developed using Object-Oriented Programming (OOP) concepts.
The purpose of this project is to help students organize and monitor their study activities in an interactive way.
The system allows users to:
Enter study subjects and topics
Track planned and completed study hours
Receive reminders when study goals are incomplete
Manage multiple study methods such as coding, reading, and video learning
This project was created to demonstrate the practical implementation of core OOP concepts in Java in a simple and understandable way.
Project Files
The project contains the following Java files:
MainSt.java
Study.java
CodingStudy.java
ReadingStudy.java
VideoStudy.java
OOP Concepts Implemented
1. Encapsulation
Encapsulation is implemented by storing variables privately inside classes and accessing them using getters and setters.
1, the study.java show encapsulation clearly
Examples:
setSubject()
getSubject()
setHours()
setCompleted()
This helps protect the data and keeps the program organized.
2. Inheritance
Inheritance is implemented by creating child classes that inherit from the parent Study class.
1, codingstudy.java,readingstudy.java,and videostudy.java all files show inheritance clearly
Example:
CodingStudy extends Study
ReadingStudy extends Study
VideoStudy extends Study
The child classes automatically inherit common properties and methods from the parent class.
3. Runtime Polymorphism (Method Overriding)
Runtime polymorphism is demonstrated using superclass references.
1, used in all .java files except the MainSt.java by using the startstudy method()
Example:
Study s1 = new CodingStudy();
Study s2 = new ReadingStudy();
Study s3 = new VideoStudy();
The startStudy() method behaves differently depending on the actual object type.
This allows one common method to perform different actions dynamically.
4. Compile-Time Polymorphism (Method Overloading)
Method overloading is implemented using multiple methods with the same name but different parameters.
1,used in study.java , codingstudy.java and in the mainst.java
Example:
completeTask();
completeTask(String unit);
This improves flexibility and readability in the program.
5.Classes and objects
Additional Features
The project also includes:
User input handling using Scanner
Conditional statements (if/else)
Looping structures (for loop)
Reminder system for incomplete study goals
Separate behaviors for coding, reading, and video study activities
How the Program Works
The user enters:
Subject name
Study unit/topic
Planned study hours
Completed study hours
The system analyzes the progress.
If the completed hours are lower than the planned hours, reminder messages are displayed.
Different study types are then demonstrated using OOP concepts.
How to Compile or Run
Run: use the below file to run the code
MainSt.java file
Sample Features Demonstrated
Study progress tracking
Dynamic study behaviors
Object interaction
Parent-child class relationships
Runtime method selection

##Java OOP Mid Project##
