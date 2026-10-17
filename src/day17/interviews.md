# Day 17 — Interview Questions and Answers

## Q1. What is a functional interface?

An interface with exactly one abstract method. It can be implemented using a lambda expression.

## Q2. What is the `java.util.function` package?

It provides commonly used functional interfaces such as Predicate, Function, Consumer and Supplier.

## Q3. What is Predicate?

Predicate accepts one input and returns a boolean. Its abstract method is `test()`.

## Q4. What is Function?

Function accepts one input and returns a result. Its abstract method is `apply()`.

## Q5. What is Consumer?

Consumer accepts one input and returns no result (`void`). Its abstract method is `accept()`.

## Q6. What is Supplier?

Supplier accepts no input and provides a result through `get()`.

## Q7. What is the difference between Predicate and Function?

Predicate returns a boolean to represent a condition. Function returns a value that may be of a different type from its input.

## Q8. What is the difference between Consumer and Supplier?

Consumer takes input and performs an action without returning a result. Supplier takes no input and returns a value.

## Q9. What are BiPredicate, BiFunction and BiConsumer?

They are built-in functional interfaces that accept two inputs:
- BiPredicate returns a boolean.
- BiFunction returns a result.
- BiConsumer returns no result.

## Q10. What is the difference between `test()`, `apply()`, `accept()` and `get()`?

- `test()` — evaluates a condition.
- `apply()` — calculates or transforms a result.
- `accept()` — performs an action.
- `get()` — retrieves a supplied value.

## Q11. Do these interfaces support lambda expressions?

Yes. Each has one abstract method and can be implemented using a compatible lambda expression.

## Q12. Where are built-in functional interfaces useful?

They are useful for conditions, data transformations, printing or processing values, supplying values, and working with collections and streams.