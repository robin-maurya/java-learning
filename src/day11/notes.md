# Day 11 - Polymorphism

## 1. What is Polymorphism?

Polymorphism is one of the main pillars of Object-Oriented Programming (OOP).

The word **Polymorphism** means:

> Many Forms

In Java, polymorphism allows the same method name or reference to behave differently depending on the situation.

### Types of Polymorphism

Java mainly has two types:

1. Compile-time Polymorphism
2. Runtime Polymorphism

---

# 2. Compile-time Polymorphism

Compile-time polymorphism is also called:

- Static Polymorphism
- Static Binding
- Early Binding

Compile-time polymorphism is achieved through:

> Method Overloading

The compiler decides which overloaded method should be executed based on the method arguments.

## Method Overloading

Method Overloading means having multiple methods with the same name but different parameters.

### Example

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

### Method Calls

```java
Calculator calculator = new Calculator();

System.out.println(calculator.add(10, 20));
System.out.println(calculator.add(10, 20, 30));
```

### Output

```text
30
60
```

The compiler determines which method should be called.

### Important

```text
Method Overloading
        ↓
Compile-time Polymorphism
        ↓
Compiler decides the method
```

---

# 3. Rules of Method Overloading

Methods can be overloaded by changing:

## 1. Number of Parameters

```java
add(int a, int b)

add(int a, int b, int c)
```

## 2. Data Type of Parameters

```java
add(int a, int b)

add(double a, double b)
```

## 3. Order of Parameters

```java
display(int age, String name)

display(String name, int age)
```

---

## Return Type Alone Cannot Overload a Method

This is **NOT valid**:

```java
int add(int a, int b) {
    return a + b;
}

double add(int a, int b) {
    return a + b;
}
```

This causes a compile-time error because the method parameters are exactly the same.

Changing only the return type is not method overloading.

---

# 4. Runtime Polymorphism

Runtime polymorphism is also called:

- Dynamic Polymorphism
- Dynamic Binding
- Late Binding

Runtime polymorphism is achieved through:

> Method Overriding

In runtime polymorphism, Java decides which overridden method should execute during program execution.

---

# 5. Method Overriding

Method Overriding occurs when a child class provides its own implementation of a method inherited from the parent class.

### Parent Class

```java
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}
```

### Child Class

```java
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

The `Dog` class overrides the `sound()` method of the `Animal` class.

---

# 6. @Override Annotation

`@Override` is an annotation used to indicate that a child class method is overriding a parent class method.

Example:

```java
@Override
void sound() {
    System.out.println("Dog barks");
}
```

It helps the compiler detect mistakes.

For example, if the parent method is:

```java
void sound()
```

and we accidentally write:

```java
@Override
void sounds()
```

The compiler will report an error because `sounds()` does not override the parent method.

---

# 7. Runtime Polymorphism Example

### Animal.java

```java
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}
```

### Dog.java

```java
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

### Main

```java
Animal animal = new Dog();

animal.sound();
```

### Output

```text
Dog barks
```

---

# 8. Why Does Dog.sound() Execute?

Look at this statement:

```java
Animal animal = new Dog();
```

There are two important things here.

### Reference Type

```text
Animal
```

`Animal` is the reference type.

### Actual Object Type

```text
Dog
```

`Dog` is the actual object type.

Therefore:

```java
Animal animal = new Dog();
```

means:

> An Animal reference is pointing to a Dog object.

At runtime Java checks the actual object.

The actual object is:

```text
Dog
```

Therefore:

```text
Dog.sound()
```

is executed.

---

# 9. Dynamic Method Dispatch

Dynamic Method Dispatch is the mechanism by which Java determines at runtime which overridden method should execute based on the actual object.

### Example 1

```java
Animal animal = new Dog();

animal.sound();
```

Output:

```text
Dog barks
```

### Example 2

```java
Animal animal = new Cat();

animal.sound();
```

Output:

```text
Cat meows
```

The reference type is the same:

```text
Animal
```

But the actual objects are different:

```text
Dog
Cat
```

Therefore, different implementations are executed.

---

# 10. Multiple Child Classes

### Animal.java

```java
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}
```

### Dog.java

```java
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

### Cat.java

```java
class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
```

### Main

```java
Animal animal1 = new Dog();
Animal animal2 = new Cat();

animal1.sound();
animal2.sound();
```

### Output

```text
Dog barks
Cat meows
```

This is an example of runtime polymorphism.

---

# 11. Overloading vs Overriding

| Feature | Method Overloading | Method Overriding |
|---|---|---|
| Polymorphism Type | Compile-time | Runtime |
| Binding | Static | Dynamic |
| Method Name | Same | Same |
| Parameters | Must be different | Must be same |
| Return Type | Cannot differ only by return type | Same or covariant |
| Inheritance Required | No | Yes |
| Usually Occurs | Same class | Parent-child classes |
| Decision | Compiler | Runtime |
| Purpose | Multiple ways to call a method | Change inherited behavior |

---

# 12. Compile-time vs Runtime Polymorphism

## Compile-time Polymorphism

```text
Method Overloading
        ↓
Compiler
        ↓
Method Selected
```

### Example

```java
add(10, 20);
add(10, 20, 30);
```

---

## Runtime Polymorphism

```text
Method Overriding
        ↓
Runtime
        ↓
Actual Object
        ↓
Overridden Method
```

### Example

```java
Animal animal = new Dog();

animal.sound();
```

---

# 13. Reference Type vs Object Type

Consider:

```java
Animal animal = new Dog();
```

### Reference Type

```text
Animal
```

The reference type determines what members are available through the reference at compile time.

### Object Type

```text
Dog
```

The actual object determines which overridden method executes at runtime.

---

# 14. Important Example

```java
Animal animal = new Dog();

animal.sound();
```

If `Dog` overrides `sound()`, then:

```text
Dog.sound()
```

will execute.

Not:

```text
Animal.sound()
```

---

# 15. Parent Reference Can Point to Child Object

Java allows:

```java
Animal animal = new Dog();
```

This is called:

> Upcasting

The parent class reference is pointing to a child class object.

Another example:

```java
Animal animal = new Cat();
```

This is also valid.

---

# 16. Why Runtime Polymorphism Is Useful

Runtime polymorphism provides flexibility.

Example:

```java
Animal animal;

animal = new Dog();
animal.sound();

animal = new Cat();
animal.sound();
```

The same reference can work with different implementations.

### Output

```text
Dog barks
Cat meows
```

This makes code more flexible and easier to extend.

---

# 17. Real-world Example

Suppose we have:

```text
Payment
   |
   |---- CreditCardPayment
   |
   |---- UPIPayment
   |
   |---- NetBankingPayment
```

### Parent

```java
class Payment {

    void pay() {
        System.out.println("Payment");
    }
}
```

### Child Classes

```java
class CreditCardPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Payment using Credit Card");
    }
}
```

```java
class UPIPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Payment using UPI");
    }
}
```

### Usage

```java
Payment payment;

payment = new CreditCardPayment();
payment.pay();

payment = new UPIPayment();
payment.pay();
```

### Output

```text
Payment using Credit Card
Payment using UPI
```

This is runtime polymorphism.

---

# 18. Important Rules of Method Overriding

1. Method name must be the same.
2. Parameters must be the same.
3. There must be a parent-child relationship.
4. Return type must be the same or covariant.
5. Access level cannot be more restrictive in the child.
6. `private` methods cannot be overridden.
7. `final` methods cannot be overridden.
8. `static` methods are hidden, not overridden.
9. `@Override` annotation is recommended.

---

# 19. Method Overriding and Access Modifier

### Parent

```java
class Animal {

    protected void sound() {
        System.out.println("Animal");
    }
}
```

### Child

```java
class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Dog");
    }
}
```

This is valid because `public` is less restrictive than `protected`.

But this is not valid:

```java
class Dog extends Animal {

    @Override
    private void sound() {
        System.out.println("Dog");
    }
}
```

Because the child cannot reduce the visibility of the overridden method.

---

# 20. Can Private Methods Be Overridden?

No.

A private method belongs only to its own class and is not inherited by the child class.

Example:

```java
class Animal {

    private void sound() {
        System.out.println("Animal");
    }
}
```

The child class cannot override this method.

---

# 21. Can Final Methods Be Overridden?

No.

Example:

```java
class Animal {

    final void sound() {
        System.out.println("Animal");
    }
}
```

The child class cannot override `sound()`.

---

# 22. Can Static Methods Be Overridden?

Static methods are not overridden.

They are **method-hidden**.

Example:

```java
class Animal {

    static void sound() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {

    static void sound() {
        System.out.println("Dog");
    }
}
```

This is called:

> Method Hiding

not Method Overriding.

---

# 23. Key Interview Points

Remember these:

```text
Polymorphism = Many Forms

Overloading = Compile-time Polymorphism

Overriding = Runtime Polymorphism

Overloading = Different Parameters

Overriding = Same Method Signature

Runtime Polymorphism = Inheritance + Overriding

Dynamic Method Dispatch = Runtime method selection

Parent Reference → Child Object = Upcasting
```

---

# 24. Quick Revision

```text
                    POLYMORPHISM
                         |
              -----------------------
              |                     |
         Compile-time           Runtime
              |                     |
        Method Overloading     Method Overriding
              |                     |
          Compiler              Runtime
              |                     |
        Static Binding        Dynamic Binding
```

---

# 25. Practice Programs Completed

## Program 1 - Method Overloading

```java
add(int a, int b)

add(int a, int b, int c)
```

## Program 2 - Method Overriding

```java
Animal.sound()
Dog.sound()
```

## Program 3 - Runtime Polymorphism

```java
Animal animal = new Dog();

animal.sound();
```

## Program 4 - Multiple Child Classes

```java
Animal animal1 = new Dog();
Animal animal2 = new Cat();
```

---

# 26. Day 11 Quick Revision Checklist

- [x] What is Polymorphism?
- [x] Compile-time Polymorphism
- [x] Runtime Polymorphism
- [x] Method Overloading
- [x] Method Overriding
- [x] `@Override`
- [x] Dynamic Method Dispatch
- [x] Reference Type
- [x] Object Type
- [x] Upcasting
- [x] Overloading vs Overriding
- [x] Rules of Method Overriding
- [x] Access Modifiers in Overriding
- [x] Private Methods
- [x] Final Methods
- [x] Static Methods / Method Hiding
- [x] Real-world Polymorphism Example

---

# Final Summary

Polymorphism allows Java objects and methods to take many forms.

## Compile-time Polymorphism

Achieved using Method Overloading.

```text
Same method name
+
Different parameters
=
Compile-time Polymorphism
```

## Runtime Polymorphism

Achieved using Method Overriding.

```text
Parent reference
+
Child object
+
Overridden method
=
Runtime Polymorphism
```

The most important example is:

```java
Animal animal = new Dog();

animal.sound();
```

The actual object is `Dog`, so the overridden `Dog.sound()` method executes.
