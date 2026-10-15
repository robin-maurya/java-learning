# Day 17 — Built-in Functional Interfaces

## 1. What are Functional Interfaces?

A functional interface is an interface that contains exactly one abstract method. It can be implemented using a lambda expression.

Java provides built-in functional interfaces in the `java.util.function` package.

## 2. Predicate<T>

- Takes one input and returns a boolean.
- Abstract method: `test()`
- Used for checking conditions.

```java
Predicate<Integer> isEven = number -> number % 2 == 0;
System.out.println(isEven.test(10)); // true
```

## 3. Function<T, R>

- Takes one input and returns a result.
- Abstract method: `apply()`
- `T` represents input type; `R` represents return type.

```java
Function<String, Integer> getLength = text -> text.length();
System.out.println(getLength.apply("Java")); // 4
```

## 4. Consumer<T>

- Takes one input and returns no result.
- Abstract method: `accept()`
- Used to perform an action on input.

```java
Consumer<String> print = message -> System.out.println(message);
print.accept("Hello Java");
```

## 5. Supplier<T>

- Takes no input and returns a value.
- Abstract method: `get()`

```java
Supplier<String> message = () -> "Welcome to Java";
System.out.println(message.get());
```

## 6. BiPredicate<T, U>

- Takes two inputs and returns a boolean.
- Abstract method: `test()`

```java
BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;
System.out.println(isGreater.test(20, 10)); // true
```

## 7. BiFunction<T, U, R>

- Takes two inputs and returns a result.
- Abstract method: `apply()`

```java
BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
System.out.println(add.apply(20, 30)); // 50
```

## 8. BiConsumer<T, U>

- Takes two inputs and returns no result.
- Abstract method: `accept()`

```java
BiConsumer<String, Integer> details =
        (name, age) -> System.out.println(name + " is " + age + " years old");

details.accept("Robin", 28);
```

## Quick Revision

| Interface | Inputs | Returns | Method |
|---|---|---|---|
| Predicate<T> | One | boolean | test() |
| Function<T, R> | One | Result | apply() |
| Consumer<T> | One | void | accept() |
| Supplier<T> | None | Value | get() |
| BiPredicate<T, U> | Two | boolean | test() |
| BiFunction<T, U, R> | Two | Result | apply() |
| BiConsumer<T, U> | Two | void | accept() |

## Key Takeaway

- Predicate checks a condition.
- Function transforms or calculates a result.
- Consumer performs an action.
- Supplier provides a value.
- The `Bi` prefix generally indicates two inputs.

All these interfaces belong to `java.util.function`.