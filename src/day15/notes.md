# Day 15 — Java Generics

## 1. What are Generics?

Generics allow us to write classes, interfaces, and methods that work with different data types while providing compile-time type safety.

**Why do we use Generics?**
- To reuse code with different data types.
- To reduce explicit type casting.
- To catch type-related errors at compile time.

Example:

```java
List<String> names = new ArrayList<>();
names.add("Robin");

String name = names.get(0);
```

Here, the list accepts String values.

## 2. Generic Class

A generic class uses a type parameter such as `T`.

```java
class Container<T> {
    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
```

Usage:

```java
Container<String> c1 = new Container<>();
c1.setData("Robin");

Container<Integer> c2 = new Container<>();
c2.setData(100);
```

**When to use:** When the same class should work with different types.

## 3. Generic Method

A generic method declares its own type parameter before the return type.

```java
public static <T> void printData(T data) {
    System.out.println(data);
}
```

Usage:

```java
printData("Robin");
printData(100);
printData(10.5);
```

**When to use:** When a method needs to work with different data types independently of its class.

## 4. Multiple Type Parameters

A generic class or method can have more than one type parameter.

```java
public static <T, U> void printPair(T first, U second) {
    System.out.println(first);
    System.out.println(second);
}
```

Usage:

```java
printPair("Robin", 100);
```

Here, T can represent String and U can represent Integer.

## 5. Bounded Generics

A bound restricts the types that can be used with a type parameter.

```java
public static <T extends Number> void printNumber(T number) {
    System.out.println(number);
}
```

Usage:

```java
printNumber(10);
printNumber(10.5);
```

Integer, Double, Float, and other Number subclasses are allowed.

A String is not allowed because String does not extend Number.

**When to use:** When a generic method or class needs a specific type or its subclasses.

## 6. Unbounded Wildcard — `<?>`

The wildcard `?` represents an unknown type.

```java
public static void printList(List<?> list) {
    for (Object item : list) {
        System.out.println(item);
    }
}
```

It can accept lists of different types:

```java
printList(List.of("Java", "Spring"));
printList(List.of(10, 20, 30));
```

You generally cannot add a non-null value to `List<?>` because its actual element type is unknown. Reading elements as Object is allowed.

## 7. Upper-bounded Wildcard — `<? extends Number>`

This accepts a list whose element type is Number or a subclass of Number.

```java
public static double sum(List<? extends Number> list) {
    double total = 0;

    for (Number number : list) {
        total += number.doubleValue();
    }

    return total;
}
```

Usage:

```java
System.out.println(sum(List.of(10, 20, 30)));
System.out.println(sum(List.of(1.5, 2.5)));
```

**Remember:** Useful when you need to read values from different lists of Number subclasses.

Adding a non-null value is generally not allowed because the actual element type is unknown.

## 8. Lower-bounded Wildcard — `<? super Integer>`

This accepts a list whose element type is Integer or a supertype of Integer, such as Number or Object.

```java
public static void addNumbers(List<? super Integer> list) {
    list.add(10);
    list.add(20);
}
```

Usage:

```java
List<Integer> integers = new ArrayList<>();
List<Number> numbers = new ArrayList<>();
List<Object> objects = new ArrayList<>();

addNumbers(integers);
addNumbers(numbers);
addNumbers(objects);
```

You can safely add Integer values. When reading an element, the guaranteed type is Object.

## 9. PECS Rule

PECS means **Producer Extends, Consumer Super**.

- Use `? extends T` when a structure produces values for you to read.
- Use `? super T` when a structure consumes values that you want to add.

Example:

```java
public static double sum(List<? extends Number> values) {
    double total = 0;

    for (Number value : values) {
        total += value.doubleValue();
    }

    return total;
}
```

```java
public static void addIntegers(List<? super Integer> values) {
    values.add(10);
}
```

## 10. Important Rules

1. Generics provide compile-time type safety.
2. Primitive types cannot be used directly as generic type arguments. Use wrapper classes such as Integer and Double.
3. `T` is a type parameter; `?` is a wildcard.
4. `extends` can represent an upper bound for type parameters and wildcards.
5. `super` is used for lower-bounded wildcards.
6. Java generics use type erasure, so most generic type information is not retained as a distinct runtime type.
7. `List<Integer>` is not a subtype of `List<Number>`. Generic types are invariant.

## Summary

Generics help us write reusable and type-safe code. Generic classes, generic methods, bounds, and wildcards are useful throughout the Java Collections Framework and professional Java development.
