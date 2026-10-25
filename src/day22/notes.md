# Day 22 — Java Optional

## 1. What is Optional?

`Optional<T>` is a container that may contain a non-null value or be empty. It helps represent potentially missing values and reduces explicit null checks.

## 2. Creating Optional

```java
Optional<String> a = Optional.of("Robin");
Optional<String> b = Optional.ofNullable(null);
Optional<String> c = Optional.empty();
```

- `of(value)`: value must not be null.
- `ofNullable(value)`: accepts null and returns an empty Optional for null.
- `empty()`: creates an empty Optional.

## 3. Checking and Retrieving Values

```java
optional.isPresent();
optional.isEmpty();
optional.get();
```

Avoid calling `get()` without checking whether a value exists. Prefer `orElse()`, `orElseGet()`, or `orElseThrow()`.

## 4. Default Values and Exceptions

```java
optional.orElse("Guest");
optional.orElseGet(() -> "Guest");
optional.orElseThrow();
optional.orElseThrow(() -> new IllegalArgumentException("Name missing"));
```

- `orElse()`: evaluates its fallback expression eagerly.
- `orElseGet()`: calls its Supplier only when the Optional is empty.
- `orElseThrow()`: throws an exception if empty.

## 5. Conditional Actions

```java
optional.ifPresent(System.out::println);

optional.ifPresentOrElse(
    System.out::println,
    () -> System.out.println("No value")
);
```

## 6. Transforming Values with map()

```java
String result = Optional.ofNullable("Robin")
        .map(value -> value.toUpperCase())
        .orElse("Guest");
```

Output: `ROBIN`

`map()` transforms a present value and wraps the result in an Optional.

## 7. Filtering Values

```java
String result = Optional.of("Robin")
        .filter(value -> value.length() > 3)
        .orElse("Invalid");
```

Output: `Robin`

If the condition fails, the Optional becomes empty.

## 8. Combining map() and filter()

```java
String result = Optional.ofNullable("Robin")
        .filter(value -> value.length() > 3)
        .map(String::toUpperCase)
        .orElse("Invalid");
```

Output: `ROBIN`

## 9. Important Type Change

```java
Integer length = Optional.of("Robin")
        .map(String::length)
        .orElse(0);
```

`Optional<String>` becomes `Optional<Integer>` after `map(String::length)`.

## 10. Best Practices

- Use Optional mainly as a method return type when a result may be absent.
- Never pass null to `Optional.of()`.
- Avoid calling `get()` without checking.
- Use `orElseGet()` when creating the fallback is expensive.
- Do not use Optional just to replace every null check.
