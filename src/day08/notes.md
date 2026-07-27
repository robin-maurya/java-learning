# Day 08 - OOP Basics (Classes & Objects)

## Topics Covered

- OOP Introduction
- Class
- Object
- Instance Variables
- Constructor
- Parameterized Constructor
- Methods
- Multiple Objects

---

# What is OOP?

OOP (Object-Oriented Programming) is a programming paradigm based on objects.

Benefits:
- Code Reusability
- Easy Maintenance
- Better Security
- Modular Programming

---

# What is a Class?

A class is a blueprint or template used to create objects.

Example:

```java
class Student {

}
```

---

# What is an Object?

An object is an instance of a class.

Example:

```java
Student s1 = new Student();
```

Here:

- Student → Class
- s1 → Object Reference
- new → Creates Object

---

# Instance Variables

Variables declared inside a class but outside methods.

Example:

```java
class Student {

    String name;
    int age;

}
```

Every object has its own copy of instance variables.

---

# Constructor

A constructor is a special method that is automatically called when an object is created.

Rules:

- Constructor name must be same as class name.
- Constructor has no return type.
- Constructor is called automatically.

Example:

```java
Student() {
    System.out.println("Object Created");
}
```

---

# Parameterized Constructor

A constructor that accepts parameters.

Example:

```java
Student(String name, int age) {
    this.name = name;
    this.age = age;
}
```

Object Creation:

```java
Student s1 = new Student("Robin",25);
```

---

# Methods

Methods perform operations.

Example:

```java
void display() {
    System.out.println(name);
    System.out.println(age);
}
```

Method Call:

```java
s1.display();
```

---

# Constructor vs Method

| Constructor | Method |
|-------------|--------|
| Same name as class | Any valid name |
| No return type | Has return type |
| Called automatically | Called manually |
| Initializes object | Performs operations |

---

# Multiple Objects

Example:

```java
Student s1 = new Student("Robin",25);
Student s2 = new Student("Amit",23);
```

Each object stores its own data independently.

---

# Key Points

- Class is a blueprint.
- Object is an instance of a class.
- Every object has separate data.
- Constructor initializes objects.
- Parameterized constructor assigns values during object creation.
- Methods perform actions.