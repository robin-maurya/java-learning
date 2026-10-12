# Day 16 — Lambda Expressions Interview Questions

**Date:** 13 October 2026

## Q1. What is a Lambda Expression?

A Lambda Expression is a concise way to implement the abstract method of a functional interface.

Example:

```java
Runnable task = () -> System.out.println("Hello Java");
task.run();
```

## Q2. Why were Lambda Expressions introduced in Java?

Lambda Expressions were introduced in Java 8 to reduce boilerplate code and make it easier to pass behavior as an argument or implement functional interfaces.

## Q3. What is a Functional Interface?

A functional interface is an interface with exactly one abstract method.

Example:

```java
@FunctionalInterface
interface Greeting {
    void show();
}
```

## Q4. What is the purpose of @FunctionalInterface?

It tells the compiler to verify that the interface follows functional-interface rules. The annotation is optional, but useful for catching mistakes.

## Q5. What is the syntax of a Lambda Expression?

```java
(parameters) -> expression
```

Or:

```java
(parameters) -> {
    // statements
};
```

## Q6. Can a Lambda Expression have no parameters?

Yes.

```java
Runnable task = () -> System.out.println("Hello");
```

The empty parentheses indicate that the method takes no parameters.

## Q7. Can a Lambda Expression have multiple parameters?

Yes.

```java
Calculator addition = (a, b) -> a + b;
```

The parameters are enclosed in parentheses.

## Q8. When can we omit parentheses around lambda parameters?

When there is exactly one parameter and its type is inferred.

Example:

```java
number -> number * number
```

For multiple parameters, parentheses are required.

## Q9. How does a Lambda Expression return a value?

A single expression can return its result implicitly.

```java
Square square = number -> number * number;
```

For a block lambda, use `return` when the functional method returns a value.

```java
Calculator addition = (a, b) -> {
    int sum = a + b;
    return sum;
};
```

## Q10. Can we use a Lambda Expression with any interface?

No. A lambda generally requires a compatible functional interface as its target type. An interface with multiple unrelated abstract methods cannot normally be implemented using one lambda.

## Q11. What is the difference between a Lambda Expression and an Anonymous Class?

A lambda is a concise implementation of a functional interface's abstract method. An anonymous class creates an unnamed class instance and can implement an interface or extend a class.

Lambdas do not introduce a new `this` context; `this` refers to the enclosing context. Anonymous classes have their own `this` context.

## Q12. What is the difference between these two expressions?

```java
number -> number * number
```

```java
number -> {
    return number * number;
}
```

Both calculate and return the square when used with a compatible interface. The first uses an expression body; the second uses a block body and explicit `return`.

## Q13. What does this lambda return?

```java
NumberCheck isEven = number -> number % 2 == 0;
```

It returns `true` for even numbers and `false` for odd numbers.

## Q14. Can we use Lambda Expressions with Collections?

Yes. They are commonly used with collection operations and methods such as `forEach()`, `removeIf()`, and `sort()`, as well as Java Streams.

Example:

```java
List<String> names = List.of("Amit", "Robin", "Neha");
names.forEach(name -> System.out.println(name));
```

## Q15. What is the difference between defining and executing a Lambda Expression?

Defining the lambda creates a functional-interface instance containing the implementation. Calling its abstract method executes the lambda body.

Example:

```java
Runnable task = () -> System.out.println("Running");
task.run();
```

The output appears when `run()` is called.

## Quick Interview Revision

- Lambda Expressions were introduced in Java 8.
- `->` is the lambda operator.
- A functional interface has exactly one abstract method.
- `@FunctionalInterface` enables compile-time verification.
- A single-expression lambda can return a value implicitly.
- A block lambda uses `{}` and may need an explicit `return`.
- Lambdas are widely used with Collections, sorting, and Streams.