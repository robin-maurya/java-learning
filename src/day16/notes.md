# Day 16 — Lambda Expressions

**Date:** 13 October 2026  
**Topic:** Java Lambda Expressions

## 1. What is a Lambda Expression?

A Lambda Expression is a concise way to implement the abstract method of a functional interface in Java.

It reduces boilerplate code and makes code more readable.

## 2. Why do we use Lambda Expressions?

- To reduce unnecessary code.
- To provide a short implementation of a functional interface.
- To make code more readable.
- To work conveniently with Collections and Java Streams.
- To simplify operations such as sorting, filtering, and processing data.

## 3. Lambda Expression Syntax

```java
(parameters) -> {
    // implementation
};
```

Parts:
- `parameters`: Input values received by the method.
- `->`: Arrow operator separating parameters from the body.
- `{}`: Body containing the implementation.

## 4. Functional Interface

A functional interface has exactly one abstract method.

Example:

```java
@FunctionalInterface
interface Greeting {
    void show();
}
```

The `@FunctionalInterface` annotation is optional, but the compiler checks that the interface follows the functional-interface rules when it is used.

An interface may still contain default methods, static methods, and methods matching public methods of `Object`.

## 5. Lambda Without Parameters

```java
Greeting greeting = () -> {
    System.out.println("Hello Java");
};

greeting.show();
```

Use `()` when the abstract method has no parameters.

## 6. Lambda With One Parameter

```java
interface Message {
    void display(String text);
}

Message message = text -> System.out.println(text);
message.display("Hello");
```

Parentheses around a single parameter can be omitted when its type is inferred.

## 7. Lambda With a Return Value

```java
interface Square {
    int calculate(int number);
}

Square square = number -> number * number;

System.out.println(square.calculate(5));
```

Output:

```text
25
```

A single expression can return its value implicitly.

## 8. Lambda With Multiple Parameters

```java
interface Calculator {
    int calculate(int a, int b);
}

Calculator addition = (a, b) -> a + b;
Calculator multiplication = (a, b) -> a * b;

System.out.println(addition.calculate(10, 20));
System.out.println(multiplication.calculate(10, 20));
```

Output:

```text
30
200
```

Multiple parameters must be enclosed in parentheses.

## 9. Lambda Returning a Boolean

```java
interface NumberCheck {
    boolean check(int number);
}

NumberCheck isEven = number -> number % 2 == 0;

System.out.println(isEven.check(10));
System.out.println(isEven.check(7));
```

Output:

```text
true
false
```

The expression `number % 2 == 0` checks whether a number is even.

## 10. Lambda With Multiple Statements

```java
interface SumOperation {
    int calculate(int a, int b);
}

SumOperation operation = (a, b) -> {
    int sum = a + b;
    System.out.println("Sum: " + sum);
    return sum;
};

int result = operation.calculate(15, 25);
System.out.println("Returned value: " + result);
```

Output:

```text
Sum: 40
Returned value: 40
```

When a lambda contains multiple statements, use curly braces. If it returns a value, use an appropriate `return` statement.

## 11. Math.max() With Lambda

```java
interface Maximum {
    int findMax(int a, int b);
}

Maximum maximum = (a, b) -> Math.max(a, b);

System.out.println(maximum.findMax(15, 25));
```

Output:

```text
25
```

`Math.max(a, b)` returns the greater of the two values.

## 12. Important Rules

1. A lambda needs a compatible target type, commonly a functional interface.
2. The lambda parameter count and types must match the abstract method.
3. A single expression can be written without curly braces.
4. A single expression returning a value does not require an explicit `return`.
5. Multiple statements require curly braces.
6. A block lambda returning a value must return a compatible value on every applicable execution path.
7. Lambda parameter types can usually be inferred from the target functional interface.
8. Lambda expressions can be assigned to variables whose types are compatible functional interfaces.

## 13. Common Mistakes

- Using `()` incorrectly for a method that requires parameters.
- Forgetting `return` in a block lambda that must return a value.
- Forgetting curly braces around multiple statements.
- Trying to use a lambda with an interface that has multiple unrelated abstract methods.
- Confusing defining a lambda with executing it. Calling the functional interface method executes the lambda body.

## 14. Day 16 Practice Completed

- Practice 1: Greeting using Lambda.
- Practice 2: Square of a Number.
- Practice 3: Calculator — Addition, Subtraction, Multiplication.
- Practice 4: Even or Odd.
- Practice 5: Maximum of Two Numbers.
- Practice 6: String Length.
- Practice 7: Multiple Statements and Return Value.

## 15. Quick Revision

**Lambda Expression:** A concise implementation of a functional interface's abstract method.

**Functional Interface:** An interface with exactly one abstract method, subject to Java's functional-interface rules.

**Arrow Operator:** `->`

**Single-expression example:** `number -> number * number`

**Multiple-statement example:** `(a, b) -> { int sum = a + b; return sum; }`

**Main benefit:** Less boilerplate and clearer implementations.