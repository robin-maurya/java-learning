# Day 19 — Java Stream API Basics

## 1. What is Stream API?

The Java Stream API, introduced in Java 8, is used to process collections of data in a declarative way. It supports operations such as filtering, transforming, counting, and collecting elements.

A Stream does not store data; it processes data from a source such as a List.

## 2. Creating a Stream

```java
List<Integer> numbers = List.of(10, 20, 30);
numbers.stream().forEach(System.out::println);
```

## 3. Important Stream Operations

### `filter()`

Selects elements that satisfy a condition.

```java
numbers.stream()
       .filter(number -> number % 2 == 0)
       .forEach(System.out::println);
```

### `map()`

Transforms each element into another value.

```java
numbers.stream()
       .map(number -> number * number)
       .forEach(System.out::println);
```

### `forEach()`

Performs an action for each element in the Stream.

```java
numbers.stream().forEach(System.out::println);
```

### `count()`

Returns the number of elements remaining after previous operations. Its return type is `long`.

```java
long count = numbers.stream()
                    .filter(number -> number > 15)
                    .count();
```

### `toList()`

Collects Stream elements into a List. The List returned by `Stream.toList()` is unmodifiable.

```java
List<Integer> evenNumbers = numbers.stream()
        .filter(number -> number % 2 == 0)
        .toList();
```

## 4. Intermediate and Terminal Operations

**Intermediate operations:** `filter()`, `map()`

They return another Stream and are generally lazy.

**Terminal operations:** `forEach()`, `count()`, `toList()`

They produce a result or side effect and trigger Stream processing.

## 5. Chaining Operations

Multiple operations can be chained together.

```java
List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

numbers.stream()
       .filter(number -> number % 2 != 0)
       .map(number -> number * 2)
       .forEach(System.out::println);
```

Output:
```text
2
6
10
```

## 6. Important Points

- Streams were introduced in Java 8.
- A Stream does not store data.
- Intermediate operations are lazy.
- A Stream should not be reused after a terminal operation.
- `filter()` selects elements; `map()` transforms elements.
- `count()` returns a `long`.
- `Stream.toList()` returns an unmodifiable List.
- Stream operations generally do not modify the original collection.
