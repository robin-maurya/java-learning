# Day 18 — Method References

## 1. What is a Method Reference?

A method reference is a shorthand way to refer to an existing method. It uses the `::` operator and can be used when a lambda expression simply calls a compatible existing method.

Example:

```java
Consumer<String> printer = System.out::println;
printer.accept("Hello Java");
```

Equivalent lambda:

```java
message -> System.out.println(message)
```

## 2. Types of Method References

### A. Static Method Reference

Syntax:

```java
ClassName::staticMethodName
```

Example:

```java
Function<Integer, Integer> absValue = Math::abs;
System.out.println(absValue.apply(-15)); // 15
```

The method belongs to a class and does not require an object.

### B. Instance Method of a Particular Object

Syntax:

```java
object::methodName
```

Example:

```java
Consumer<String> printer = System.out::println;
printer.accept("Java");
```

Here, `System.out` is an existing object and `println` is its instance method.

### C. Instance Method of an Arbitrary Object

Syntax:

```java
ClassName::instanceMethodName
```

Example:

```java
Function<String, String> uppercase = String::toUpperCase;
System.out.println(uppercase.apply("java")); // JAVA
```

The input object is supplied when the functional interface method is called.

Equivalent lambda:

```java
text -> text.toUpperCase()
```

### D. Constructor Reference

Syntax:

```java
ClassName::new
```

Example:

```java
Supplier<ArrayList<String>> supplier = ArrayList::new;
ArrayList<String> names = supplier.get();
```

Equivalent lambda:

```java
() -> new ArrayList<String>()
```

The constructor is invoked when `get()` is called.

## 3. Method Reference vs Lambda

| Lambda | Method Reference |
|---|---|
| `message -> System.out.println(message)` | `System.out::println` |
| `number -> Math.abs(number)` | `Math::abs` |
| `text -> text.toUpperCase()` | `String::toUpperCase` |
| `() -> new ArrayList<String>()` | `ArrayList::new` |

A method reference is useful when a lambda only calls an existing compatible method. Not every lambda can be replaced with a method reference.

## Key Takeaway

- `::` is the method reference operator.
- Method references improve readability when applicable.
- Method references do not execute a method immediately; the referenced method executes when the functional interface method is invoked.
- The method's parameters and return type must be compatible with the functional interface's abstract method.