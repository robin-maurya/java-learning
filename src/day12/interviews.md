# Day 12 - Abstraction: Interview Questions

## Q1. What is Abstraction?

Abstraction is the process of hiding unnecessary implementation details and showing only the required functionality.

---

## Q2. How can we achieve Abstraction in Java?

Mainly through:

1. Abstract Class
2. Interface

---

## Q3. What is an Abstract Class?

An abstract class is a class declared using the `abstract` keyword.

It can contain:
- Abstract methods
- Concrete/normal methods
- Variables
- Constructors

---

## Q4. Can we create an object of an Abstract Class?

No.

```java
Animal animal = new Animal(); // Compile-time error
```

But an abstract class can be used as a reference type:

```java
Animal animal = new Dog();
```

---

## Q5. What is an Abstract Method?

An abstract method is a method without an implementation/body.

Example:

```java
abstract void sound();
```

---

## Q6. What happens if a concrete child class does not implement an abstract method?

The compiler gives an error.

Example:

```java
abstract class Animal {

    abstract void sound();
}

class Dog extends Animal {

}
```

`Dog` must implement `sound()` or `Dog` must also be declared `abstract`.

---

## Q7. Can an Abstract Class have normal methods?

Yes.

Example:

```java
abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Animal is eating");
    }
}
```

---

## Q8. Can an Abstract Class have a constructor?

Yes.

An abstract class can have constructors.

---

## Q9. Can an Abstract Class have variables?

Yes.

An abstract class can contain instance and static variables.

---

## Q10. What is an Interface?

An interface is a contract that defines what a class must do.

Example:

```java
interface Animal {

    void sound();
}
```

---

## Q11. How does a class implement an Interface?

Using the `implements` keyword.

Example:

```java
class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
```

---

## Q12. Can we create an object of an Interface?

No.

An interface cannot be instantiated directly.

This is invalid:

```java
Animal animal = new Animal();
```

But this is valid:

```java
Animal animal = new Dog();
```

---

## Q13. Can a class implement multiple interfaces?

Yes.

Example:

```java
class Dog implements Animal, Pet {

}
```

---

## Q14. Can a class extend multiple classes?

No.

Java does not support multiple inheritance through classes.

This is invalid:

```java
class Dog extends Animal, Mammal {

}
```

---

## Q15. Can a class extend one class and implement multiple interfaces?

Yes.

Example:

```java
class Tesla extends Vehicle implements ElectricVehicle, Rechargeable {

}
```

---

## Q16. What is the difference between Abstract Class and Interface?

| Abstract Class | Interface |
|---|---|
| Declared using `abstract class` | Declared using `interface` |
| Uses `extends` for class inheritance | Uses `implements` for class implementation |
| Can have abstract methods | Can have abstract methods |
| Can have concrete methods | Can have `default`/`static` methods with implementation |
| Can have constructors | Cannot have constructors |
| Can have instance variables | Fields are `public static final` by default |
| A class can extend only one class | A class can implement multiple interfaces |

---

## Q17. What is the difference between `extends` and `implements`?

`extends` is used when a class inherits another class.

```java
class Dog extends Animal {

}
```

`implements` is used when a class implements an interface.

```java
class Dog implements Animal {

}
```

---

## Q18. What is `@Override`?

`@Override` is an annotation used to indicate that a child class is overriding or implementing a method inherited/required from the parent type.

Example:

```java
@Override
public void sound() {
    System.out.println("Dog barks");
}
```

---

## Q19. Are Interface Methods Public by Default?

For interface methods declared without a body, they are implicitly `public abstract`.

Example:

```java
interface Animal {

    void sound();
}
```

The implementing method should therefore be public:

```java
public void sound() {

}
```

---

## Q20. What is a Default Method in an Interface?

A `default` method is an interface method that has an implementation.

Example:

```java
interface Animal {

    default void eat() {
        System.out.println("Animal is eating");
    }
}
```

---

## Q21. What is a Static Method in an Interface?

A static method belongs to the interface and is called using the interface name.

Example:

```java
interface Animal {

    static void info() {
        System.out.println("Animal");
    }
}
```

Call:

```java
Animal.info();
```

---

## Q22. What are Interface Variables by Default?

Fields declared in an interface are implicitly:

```java
public static final
```

Therefore, they behave like constants.

---

## Q23. Can an Abstract Class Implement an Interface?

Yes.

Example:

```java
abstract class Animal implements Pet {

}
```

An abstract class can leave interface methods unimplemented.

---

## Q24. Can an Interface Extend Another Interface?

Yes.

Example:

```java
interface Animal {

    void sound();
}

interface Pet extends Animal {

    void play();
}
```

---

## Q25. Can an Interface Extend Multiple Interfaces?

Yes.

Example:

```java
interface Pet extends Animal, Movable {

}
```

---

## Q26. What is this?

```java
Animal animal = new Dog();
```

`Animal` is the **reference type**.

`Dog` is the **actual object type**.

This can also be used for runtime polymorphism.

---

## Q27. Is this Runtime Polymorphism?

```java
Animal animal = new Dog();

animal.sound();
```

Yes, if `Dog` provides an overridden implementation of `sound()`.

The method is selected based on the actual object at runtime.

---

## Q28. What is the main purpose of an Interface?

The main purpose is to define a **contract or capability** that implementing classes must provide.

---

## Q29. What is the main purpose of an Abstract Class?

An abstract class is useful when we want a common base class that can provide shared implementation along with abstract behavior.

---

## Q30. Which is better: Abstract Class or Interface?

Neither is always better.

Use an **Abstract Class** when classes share common state or implementation.

Use an **Interface** when you want to define a contract/capability that multiple unrelated classes can implement.

---

# Quick Interview Revision

```text
Abstraction
    ↓
Hiding implementation details
    ↓
Abstract Class + Interface

Abstract Class
    ↓
extends
    ↓
Common base + shared implementation

Interface
    ↓
implements
    ↓
Contract / capability

One class
    ↓
Can extend ONE class
    ↓
Can implement MULTIPLE interfaces
```

---

# Most Important One-Liners

- Abstraction hides implementation details.
- Abstract classes cannot be instantiated directly.
- Abstract classes can contain abstract and concrete methods.
- A concrete child must implement inherited abstract methods.
- Interfaces define contracts.
- Classes implement interfaces using `implements`.
- A class can implement multiple interfaces.
- A class can extend only one class.
- An abstract class can implement interfaces.
- Interfaces can extend multiple interfaces.
- Interface abstract methods are public by default.
- Interface fields are `public static final` by default.
- `default` methods can have implementations.
- Static interface methods belong to the interface.
- `@Override` helps verify overriding/implementation.
- Interface references can be used for runtime polymorphism.

---

# ⭐ Day 12 Interview Quick Sheet

### Abstract Class
**Common base class + shared implementation**

### Interface
**Contract / capability**

### `extends`
**Class → Class inheritance**

### `implements`
**Class → Interface implementation**

### Multiple Inheritance
**Not supported through classes, but multiple interfaces are supported**

### Abstract Class + Interface
```java
class Tesla extends Vehicle implements ElectricVehicle, Rechargeable {
}
```

### Runtime Polymorphism
```java
Animal animal = new Dog();
animal.sound();
```

### Key Rule
```text
1 class → extends 1 class
1 class → implements multiple interfaces
1 interface → can extend multiple interfaces
```
