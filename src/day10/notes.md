# Day 10 - Inheritance

## Topics Covered

- Inheritance
- Parent Class
- Child Class
- extends Keyword
- Method Overriding
- @Override
- super Keyword

---

# What is Inheritance?

Inheritance is the process of acquiring properties and methods of one class into another class.

Main Benefit:

- Code Reusability

---

# Parent Class

Also known as:

- Super Class
- Base Class

Example:

```java
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }

}
```

---

# Child Class

Also known as:

- Sub Class
- Derived Class

Example:

```java
class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }

}
```

---

# extends Keyword

Used to inherit another class.

Example:

```java
class Dog extends Animal
```

---

# Method Overriding

Providing a new implementation of a parent class method.

Example:

```java
@Override
void sound() {
    System.out.println("Dog barks");
}
```

---

# super Keyword

Used to access parent class methods or constructors.

Example:

```java
super.eat();
```

---

# Advantages of Inheritance

- Code Reusability
- Better Code Organization
- Easier Maintenance
- Supports Polymorphism

---

# Key Points

- Java supports single inheritance using classes.
- Child class inherits parent properties and methods.
- Override methods to provide child-specific behavior.
- Use super to call parent implementation.