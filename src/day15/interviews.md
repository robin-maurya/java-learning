# Day 15 — Java Generics Interview Questions

## Basic Questions

### 1. What are Generics in Java?

Generics allow classes, interfaces, and methods to work with different data types while providing compile-time type safety.

### 2. Why do we use Generics?

We use Generics to write reusable code, reduce explicit type casting, and detect type-related errors at compile time.

### 3. What is a Generic Class?

A generic class declares a type parameter that can be specified when an object is created.

Example:

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

### 4. What is a Generic Method?

A generic method declares its own type parameter.

```java
public static <T> void printData(T data) {
    System.out.println(data);
}
```

The `<T>` appears before the return type.

### 5. What is the difference between T and ?

`T` is a named type parameter. The `?` wildcard represents an unknown type, mainly when working with parameterized types.

### 6. Can we use multiple type parameters?

Yes. We can use `<T, U>` or more type parameters.

```java
public static <T, U> void printPair(T first, U second) {
    System.out.println(first + " " + second);
}
```

## Bounded Types and Wildcards

### 7. What are Bounded Generics?

Bounded generics restrict the types accepted by a type parameter.

```java
<T extends Number>
```

This allows Number and its subclasses.

### 8. What is an unbounded wildcard?

`<?>` represents an unknown type.

It allows a method to accept parameterized types such as `List<String>` and `List<Integer>`.

### 9. What is an upper-bounded wildcard?

`<? extends Number>` accepts Number or a subclass of Number.

It is useful when reading numeric values from lists with different numeric element types.

### 10. What is a lower-bounded wildcard?

`<? super Integer>` accepts Integer or a superclass of Integer, such as Number or Object.

It is useful when adding Integer values to a collection.

### 11. What is the PECS rule?

PECS means Producer Extends, Consumer Super.

Use `extends` when reading values from a producer and `super` when adding values to a consumer.

### 12. Can we add values to `List<?>`?

Generally, no non-null value can be added because the actual element type is unknown. Adding `null` is permitted, but usually not useful.

### 13. Can we add an Integer to `List<? extends Number>`?

No. The list could actually be a `List<Double>`, so adding an Integer would not be type-safe.

### 14. Can we add an Integer to `List<? super Integer>`?

Yes. Integer is valid for a list of Integer, Number, or Object.

## Advanced Questions

### 15. What is type erasure?

Type erasure is the process by which the compiler removes or replaces most generic type information when generating Java bytecode.

### 16. Can we use primitive types with Generics?

No. We use wrapper classes instead.

Example:

```java
List<Integer> numbers = new ArrayList<>();
```

Not:

```java
// List<int> numbers = new ArrayList<>();
```

### 17. Is `List<Integer>` a subtype of `List<Number>`?

No. Java generics are invariant.

Even though Integer extends Number, `List<Integer>` cannot be assigned to a variable of type `List<Number>`.

### 18. Can we create an object directly using a generic type parameter?

For example, `new T()` is not allowed in a generic class or method because the actual type may not be available at runtime.

### 19. Can we create a generic array directly?

Creating an array of a non-reifiable parameterized type, such as `new T[10]`, is not allowed. Arrays and generics have different runtime type rules.

### 20. Where are Generics used in real projects?

Generics are widely used in:

- Collections such as List, Set, and Map.
- Reusable utility classes and methods.
- Repository interfaces and data-access layers.
- API response wrappers.
- Type-safe application components.

## Quick Revision

- Generic class: `Container<T>`
- Generic method: `<T> void printData(T data)`
- Multiple parameters: `<T, U>`
- Bounded type: `<T extends Number>`
- Unbounded wildcard: `<?>`
- Upper-bounded wildcard: `<? extends Number>`
- Lower-bounded wildcard: `<? super Integer>`
- PECS: Producer Extends, Consumer Super
- Type erasure: Generic type information is mostly erased at runtime.
