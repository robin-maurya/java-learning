# Day 24 – Enums & Wrapper Classes

## 1. Enums

An enum is a special Java type used to define a fixed set of constants.

### Why use enums?
- To represent a fixed set of values.
- To improve code readability.
- To avoid invalid or inconsistent values.
- To make code type-safe.

### Basic syntax

```java
enum OrderStatus {
    PENDING,
    SHIPPED,
    DELIVERED,
    CANCELLED
}
```

### Important enum methods

| Method | Purpose |
|---|---|
| `values()` | Returns all enum constants as an array |
| `valueOf()` | Returns an enum constant by its exact name |
| `name()` | Returns the constant's name |
| `ordinal()` | Returns its zero-based position |

**Note:** Avoid using `ordinal()` for business logic because changing the enum order changes its ordinal values.

### Enum with switch

Enums can be used with switch statements to execute different logic for different constants.

### Enum with fields and constructor

Enums can have:
- Fields
- Constructors
- Getters
- Methods

Enum constructors are implicitly private.

---

## 2. Wrapper Classes

Wrapper classes convert primitive data types into objects.

| Primitive | Wrapper |
|---|---|
| `byte` | `Byte` |
| `short` | `Short` |
| `int` | `Integer` |
| `long` | `Long` |
| `float` | `Float` |
| `double` | `Double` |
| `char` | `Character` |
| `boolean` | `Boolean` |

### Why use wrapper classes?
- Collections such as `ArrayList` work with objects, not primitives.
- They provide useful conversion methods.
- They can represent `null`.

## 3. Autoboxing and Unboxing

### Autoboxing

Automatic conversion of a primitive into its corresponding wrapper object.

```java
int number = 10;
Integer value = number;
```

### Unboxing

Automatic conversion of a wrapper object into its corresponding primitive.

```java
Integer value = 20;
int number = value;
```

## 4. Parsing and Conversion

| Method | Return type |
|---|---|
| `Integer.parseInt("100")` | `int` |
| `Integer.valueOf("100")` | `Integer` |
| `Double.parseDouble("10.5")` | `double` |
| `Double.valueOf("10.5")` | `Double` |

## 5. NumberFormatException

`NumberFormatException` occurs when a String cannot be converted into a valid number.

```java
try {
    int number = Integer.parseInt("abc");
} catch (NumberFormatException e) {
    System.out.println("Invalid number format");
}
```

It is an unchecked exception and extends `IllegalArgumentException`.

## 6. Wrapper Class Null Handling

Wrapper objects can contain `null`, but primitives cannot.

```java
Integer number = null;

// Unsafe: throws NullPointerException
// int value = number;

// Safe approach
if (number != null) {
    int value = number;
}
```

**Important:** Unboxing a null wrapper object causes `NullPointerException`.

---

## Day 24 Summary

Topics completed:
- Enum basics and methods
- Enum with switch
- Enum fields and constructors
- Wrapper classes
- Autoboxing and unboxing
- Parsing and conversion
- NumberFormatException
- Wrapper null handling