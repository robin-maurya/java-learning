# Day 12 - Abstraction

## 1. What is Abstraction?

Abstraction is one of the main concepts of Object-Oriented Programming (OOP).

Abstraction means:

> Hiding unnecessary implementation details and showing only the required functionality.

### Real-world Example

When we drive a car, we use:

- Steering
- Brake
- Accelerator

We do not need to know the complete internal working of the engine.

We know **what to do**, while the internal implementation is hidden.

---

# 2. How to Achieve Abstraction in Java?

Java mainly provides two ways to achieve abstraction:

1. Abstract Class
2. Interface

---

# 3. Abstract Class

An abstract class is a class declared using the `abstract` keyword.

Example:

```java
abstract class Animal {

}
```
---
### Note:

An abstract class can contain:

Abstract methods
Concrete/normal methods
Variables
Constructors

# 4. Abstract Method

An abstract method is a method that does not have an implementation/body.

Example:

```
abstract void sound();
```

Notice that the method does not have:

```
{
```

// implementation

}

An abstract method only defines what the method should do.

The child class provides the implementation.

---

# 5. Abstract Class Example

```
abstract class Animal {
```

abstract void sound();

void eat() {

System.out.println("Animal is eating");

    }

}

Here:

```
abstract void sound();
```

is an abstract method.

And:

```
void eat() {
```

System.out.println("Animal is eating");

}

is a normal/concrete method.

---

# 6. Child Class of Abstract Class

A concrete child class must implement the abstract methods of the parent class.

Example:

```
class Dog extends Animal {
```

    @Override

void sound() {

System.out.println("Dog barks");

    }

}

Here `Dog` provides the implementation of `sound()`.

---

# 7. Complete Abstract Class Example

### Animal.java

```
abstract class Animal {
```

abstract void sound();

void eat() {

System.out.println("Animal is eating");

    }

}

### Dog.java

```
class Dog extends Animal {
```

    @Override

void sound() {

System.out.println("Dog barks");

    }

}

### Main

```
class AnimalDemo {
```

public static void main(String[] args) {

Dog dog = new Dog();

dog.sound();

dog.eat();

    }

}

Output:

```
Dog barks
```

Animal is eating

---

# 8. Abstract Class Cannot Be Instantiated

We cannot directly create an object of an abstract class.

This is invalid:

```
Animal animal = new Animal();
```

It will give a compile-time error.

But we can create a reference of an abstract class:

```
Animal animal = new Dog();
```

This is valid.

Here:

```
Animal = Reference Type
```

Dog    = Actual Object Type

---

# 9. Abstract Child Class

If a child class does not implement all abstract methods, then the child class must also be declared abstract.

Example:

```
abstract class Animal {
```

abstract void sound();

}

Child:

```
abstract class Dog extends Animal {
```

}

This is valid because `Dog` is also abstract.

But:

```
class Dog extends Animal {
```

}

is invalid because `Dog` is a concrete class and has not implemented `sound()`.

---

# 10. @Override Annotation

`@Override` is used to indicate that a child class method is overriding or implementing a parent class method.

Example:

```
@Override
```

void sound() {

System.out.println("Dog barks");

}

It helps the compiler identify incorrect method overriding.

---

# 11. Interface

An interface is used to define a contract.

Simple meaning:

> An interface tells a class what it must do.

Example:

```
interface Animal {
```

void sound();

}

The class implementing the interface must provide the implementation of `sound()`.

---

# 12. Implementing an Interface

A class uses the `implements` keyword to implement an interface.

### Animal.java

```
interface Animal {
```

void sound();

}

### Dog.java

```
class Dog implements Animal {
```

    @Override

public void sound() {

System.out.println("Dog barks");

    }

}

### Main

```
class AnimalDemo {
```

public static void main(String[] args) {

Dog dog = new Dog();

dog.sound();

    }

}

Output:

```
Dog barks
```

---

# 13. Interface Method

A traditional/basic interface method without a body is implicitly:

```
public abstract
```

For example:

```
interface Animal {
```

void sound();

}

is effectively:

```
interface Animal {
```

public abstract void sound();

}

Therefore, when implementing it in a class, the method should be public:

```
@Override
```

public void sound() {

System.out.println("Dog barks");

}

---

# 14. Multiple Interfaces

A Java class can implement multiple interfaces.

Example:

```
interface Animal {
```

void sound();

}

interface Pet {

void play();

}

class Dog implements Animal, Pet {

    @Override

public void sound() {

System.out.println("Dog barks");

    }

    @Override

public void play() {

System.out.println("Dog plays");

    }

}

This is valid Java.

---

# 15. Multiple Inheritance Through Classes

Java does not allow a class to extend multiple classes.

This is invalid:

```
class Dog extends Animal, Mammal {
```

}

A class can extend only one class.

But a class can implement multiple interfaces:

```
class Dog implements Animal, Pet {
```

}

---

# 16. Abstract Class + Interface Together

A class can extend one abstract/concrete class and implement multiple interfaces.

Example:

```
abstract class Vehicle {
```

abstract void start();

void stop() {

System.out.println("Vehicle stopped");

    }

}

Interface:

```
interface ElectricVehicle {
```

void charge();

}

Child class:

```
class Tesla extends Vehicle implements ElectricVehicle {
```

    @Override

void start() {

System.out.println("Tesla starts silently");

    }

    @Override

public void charge() {

System.out.println("Tesla is charging");

    }

}

Main:

```
class TeslaDemo {
```

public static void main(String[] args) {

Tesla tesla = new Tesla();

tesla.start();

tesla.charge();

tesla.stop();

    }

}

Output:

```
Tesla starts silently
```

Tesla is charging

Vehicle stopped

---

# 17. Interface default Method

Modern Java interfaces can contain `default` methods with an implementation.

Example:

```
interface Animal {
```

void sound();

default void eat() {

System.out.println("Animal is eating");

    }

}

The implementing class does not have to override the default method.

```
class Dog implements Animal {
```

    @Override

public void sound() {

System.out.println("Dog barks");

    }

}

We can use:

```
Dog dog = new Dog();
```

dog.sound();

dog.eat();

---

# 18. Interface static Method

An interface can also contain static methods.

Example:

```
interface Animal {
```

static void info() {

System.out.println("Animal interface");

    }

}

A static interface method is called using the interface name:

```
Animal.info();
```

It is not called through an object.

---

# 19. Abstract Class vs Interface

| FeatureAbstract ClassInterface |                                     |                                   |
| ------------------------------ | ----------------------------------- | --------------------------------- |
| Declaration                    | `abstract class`                    | `interface`                       |
| Inheritance keyword            | `extends`                           | `implements`                      |
| Abstract methods               | Yes                                 | Yes                               |
| Normal/concrete methods        | Yes                                 | Yes, e.g. `default`               |
| Variables                      | Instance/static variables allowed   | Fields are `public static final`  |
| Constructor                    | Yes                                 | No                                |
| Object creation                | Cannot create directly              | Cannot create directly            |
| Multiple inheritance           | Cannot extend multiple classes      | Can implement multiple interfaces |
| Main purpose                   | Common base + shared implementation | Contract/capability               |

---

# 20. Reference Type and Object Type

Example:

```
Animal animal = new Dog();
```

Here:

```
Animal = Reference Type
```

Dog    = Actual Object Type

This is also connected to runtime polymorphism.

At runtime, Java uses the actual object to determine the overridden method.

---

# 21. Interface and Runtime Polymorphism

Example:

```
interface Animal {
```

void sound();

}

class Dog implements Animal {

    @Override

public void sound() {

System.out.println("Dog barks");

    }

}

Now:

```
Animal animal = new Dog();
```

animal.sound();

Output:

```
Dog barks
```

Here:

```
Animal = Interface Reference
```

Dog    = Actual Object

This is runtime polymorphism.

---

# 22. Real-world Example - Payment

Interface:

```
interface Payment {
```

void pay();

}

UPI:

```
class UpiPayment implements Payment {
```

    @Override

public void pay() {

System.out.println("Payment using UPI");

    }

}

Usage:

```
Payment payment = new UpiPayment();
```

payment.pay();

Output:

```
Payment using UPI
```

The interface defines the contract:

```
Payment → pay()
```

The implementation is provided by:

```
UpiPayment
```

---

# 23. Real-world Example - Vehicle

Abstract class:

```
abstract class Vehicle {
```

abstract void start();

void stop() {

System.out.println("Vehicle stopped");

    }

}

Child:

```
class Car extends Vehicle {
```

    @Override

void start() {

System.out.println("Car starts with key");

    }

}

Usage:

```
Vehicle vehicle = new Car();
```

vehicle.start();

vehicle.stop();

Output:

```
Car starts with key
```

Vehicle stopped

---

# 24. Important Rules of Abstract Classes

1.  An abstract class uses the `abstract` keyword.
2.  An abstract class cannot be instantiated directly.
3.  An abstract class can have abstract methods.
4.  An abstract class can have normal methods.
5.  An abstract class can have variables.
6.  An abstract class can have constructors.
7.  A concrete child class must implement all abstract methods.
8.  An abstract child class can leave abstract methods unimplemented.
9.  An abstract class can be used as a reference type.

---

# 25. Important Rules of Interfaces

1.  An interface is declared using the `interface` keyword.
2.  A class uses `implements` to implement an interface.
3.  A class can implement multiple interfaces.
4.  An interface cannot be instantiated directly.
5.  Interface abstract methods are public by default.
6.  Interface fields are `public static final` by default.
7.  Interfaces can have `default` methods.
8.  Interfaces can have `static` methods.
9.  A class implementing an interface must implement its abstract methods unless the class is abstract.

---

# 26. Important Keywords

## abstract

Used for:

-  Abstract classes
-  Abstract methods

Example:

```
abstract class Animal {
```

abstract void sound();

}

---

## extends

Used when a class inherits another class.

```
class Dog extends Animal {
```

}

---

## implements

Used when a class implements an interface.

```
class Dog implements Animal {
```

}

---

## @Override

Used when a child class provides an implementation of an inherited/required method.

```
@Override
```

public void sound() {

}

---

# 27. Day 12 Practice Programs

## Practice 1 - Abstract Class

```
abstract class Animal {
```

abstract void sound();

void eat() {

System.out.println("Animal is eating");

    }

}

---

## Practice 2 - Interface

```
interface Payment {
```

void pay();

}

---

## Practice 3 - Multiple Interfaces

```
class Document implements Printable, Showable {
```

    @Override

public void print() {

System.out.println("Printing document");

    }

    @Override

public void show() {

System.out.println("Showing document");

    }

}

---

## Practice 4 - Abstract Class + Interface

```
class Tesla extends Vehicle implements ElectricVehicle {
```

    @Override

void start() {

System.out.println("Tesla starts silently");

    }

    @Override

public void charge() {

System.out.println("Tesla is charging");

    }

}

---

# 28. Quick Revision

```
                    ABSTRACTION
```

                         |

              \-----------------------

              \|                     |

        Abstract Class          Interface

              \|                     |

           extends              implements

              \|                     |

      Abstract Methods        Abstract Methods

      Normal Methods          default methods

      Variables               static methods

      Constructor             Constants

---

# 29. Most Important Interview Points

```
Abstraction = Hiding implementation details
```

Abstract Class = Common base + shared implementation

Interface = Contract

extends = Class inheritance

implements = Interface implementation

One class can extend only one class.

One class can implement multiple interfaces.

Abstract class cannot be instantiated.

Interface cannot be instantiated.

Concrete child class must implement abstract methods.

Abstract child class can leave abstract methods unimplemented.

Interface methods without body are public abstract.

Interface fields are public static final.

default methods can have implementation.

static interface methods belong to the interface.

---

# 30. Final Summary

Abstraction focuses on hiding unnecessary implementation details and exposing required functionality.

Java provides two major ways to achieve abstraction:

### Abstract Class

Used when we need:

-  Common base class
-  Shared implementation
-  Abstract methods
-  Variables
-  Constructors

### Interface

Used when we need:

-  A contract
-  Common behavior/capability
-  Multiple interfaces
-  Loose coupling

Example:

```
abstract class Vehicle {
```

abstract void start();

void stop() {

System.out.println("Vehicle stopped");

    }

}

interface ElectricVehicle {

void charge();

}

class Tesla extends Vehicle implements ElectricVehicle {

    @Override

void start() {

System.out.println("Tesla starts silently");

    }

    @Override

public void charge() {

System.out.println("Tesla is charging");

    }

}

This example combines:

-  Abstraction
-  Abstract Class
-  Abstract Method
-  Interface
- `extends`
- `implements`
-  Method Overriding

```
```