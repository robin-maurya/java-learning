# Day 19 — Java Stream API Interview Questions

## Q1. What is the Java Stream API?

The Stream API processes data from collections or other sources using operations such as filtering, mapping, sorting, and collecting.

## Q2. When was the Stream API introduced?

It was introduced in Java 8.

## Q3. What is the difference between a Collection and a Stream?

A Collection stores data. A Stream processes data from a source and does not store the elements itself.

## Q4. What is `filter()`?

`filter()` selects elements that satisfy a given condition.

Example:
```java
numbers.stream().filter(n -> n > 10);
```

## Q5. What is `map()`?

`map()` transforms each element into another value.

Example:
```java
numbers.stream().map(n -> n * 2);
```

## Q6. What is the difference between `filter()` and `map()`?

- `filter()` selects which elements should remain.
- `map()` transforms each element.

## Q7. What are intermediate operations?

Intermediate operations return another Stream. Examples include `filter()` and `map()`. They are generally lazy.

## Q8. What are terminal operations?

Terminal operations produce a result or perform an action and trigger processing. Examples include `forEach()`, `count()`, and `toList()`.

## Q9. What does lazy evaluation mean in Streams?

Intermediate operations do not process all elements immediately. Processing begins when a terminal operation is invoked.

## Q10. What is the return type of `count()`?

The return type is `long`.

## Q11. Can a Stream be reused?

No. After a terminal operation consumes a Stream, it cannot be reused. Create a new Stream from the source when needed.

## Q12. Does Stream processing modify the original List?

Stream operations generally do not modify the source collection unless the code explicitly performs a modification as a side effect.

## Q13. What does `Stream.toList()` return?

It returns a List containing the Stream elements. The returned List is unmodifiable.

## Q14. How do you filter even numbers and double them?

```java
numbers.stream()
       .filter(n -> n % 2 == 0)
       .map(n -> n * 2)
       .forEach(System.out::println);
```

## Q15. What is the difference between `forEach()` and `count()`?

`forEach()` performs an action for each element. `count()` returns the number of elements in the Stream after preceding operations.
