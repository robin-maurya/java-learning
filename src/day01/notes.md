# Day 01 - Java Basics

## 📌 Topics Covered

- Introduction to Java
- Hello World Program
- Variables
- Data Types
- Print Statements
- Comments
- Naming Conventions

---

# What is Java?

Java is a high-level, object-oriented, platform-independent programming language developed by Sun Microsystems (now Oracle).

Java follows the principle:

**Write Once, Run Anywhere (WORA)**

which means Java code can run on any operating system that has JVM.

---

# Why Java?

Java is widely used for:

- Web Development
- Android Development
- Enterprise Applications
- Banking Systems
- Spring Boot Backend
- Microservices

---

# Hello World Program

```java
public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World");

    }

}
```

## Explanation

public → Accessible from anywhere

class → Blueprint of Java Program

main() → Starting point of execution

System.out.println() → Prints output and moves to next line

---

# Variables

A variable is a container used to store data.

Example:

```java
int age = 25;
String name = "Robin";
```

Rules:

- Cannot start with number
- Cannot contain spaces
- Cannot use Java keywords
- Use meaningful names

Good:

employeeName

Bad:

abc

---

# Data Types

Primitive Data Types

byte

short

int

long

float

double

char

boolean

Reference Data Types

String

Array

Class

Object

---

# Comments

Single Line

```java
// comment
```

Multi Line

```java
/*
comment
*/
```

Documentation

```java
/**
 *
 */
```

---

# Print Methods

System.out.print()

Prints on same line.

System.out.println()

Prints on next line.

System.out.printf()

Formatted output.

---

# Real World Example

Employee Management System

```java
String employeeName;

int employeeId;

double salary;
```

---

# Best Practices

Use meaningful variable names.

Follow camelCase naming.

Keep code properly formatted.

Write comments only where necessary.

---

# Common Mistakes

❌ Variable names starting with numbers

❌ Missing semicolon

❌ Wrong data type

❌ Wrong class name

---

# Key Points

Java is platform independent.

main() is the entry point.

Variables store data.

Data Types define the type of data.

System.out.println() prints output.
