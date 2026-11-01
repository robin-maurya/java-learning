# Day 24 – Interview Questions
## Enums & Wrapper Classes

### 1. What is an enum in Java?
An enum is a special data type used to define a fixed set of constants.

Example:
```java
enum Status {
    ACTIVE, INACTIVE, PENDING
}
```

### 2. Why do we use enums?
Enums provide type safety, improve readability, and restrict values to a predefined set of constants.

### 3. What is the difference between `values()` and `valueOf()`?
- `values()` returns all enum constants in an array.
- `valueOf()` returns a specific enum constant using its exact name.

### 4. What is the purpose of `ordinal()`?
It returns the zero-based position of an enum constant. Avoid using it for business logic because the position can change.

### 5. Can an enum have fields, constructors, and methods?
Yes. An enum can have fields, constructors, getters, and methods. Its constructor is implicitly private.

### 6. What are wrapper classes in Java?
Wrapper classes represent primitive data types as objects.

Example: `int` → `Integer`, `double` → `Double`.

### 7. What is autoboxing?
Autoboxing is the automatic conversion of a primitive value into its corresponding wrapper object.

```java
int number = 10;
Integer value = number;
```

### 8. What is unboxing?
Unboxing is the automatic conversion of a wrapper object into its corresponding primitive value.

```java
Integer value = 10;
int number = value;
```

### 9. Difference between `parseInt()` and `valueOf()`?
- `Integer.parseInt()` returns primitive `int`.
- `Integer.valueOf()` returns an `Integer` object.

### 10. What is NumberFormatException?
It is an unchecked exception thrown when an invalid String is converted into a numeric value.

Example:
```java
Integer.parseInt("abc");
```

### 11. Is NumberFormatException checked or unchecked?
It is an unchecked exception because it extends `IllegalArgumentException`, which extends `RuntimeException`.

### 12. Can a wrapper class contain null?
Yes. Wrapper objects can contain null, whereas primitive variables cannot.

### 13. What happens when we unbox a null Integer?
It throws `NullPointerException`.

```java
Integer number = null;
int value = number; // NullPointerException
```

### 14. Why can't we use primitive types in ArrayList?
Java collections store objects, not primitive values. We use wrapper classes such as `Integer` instead of `int`.

### 15. Can we compare two Integer objects using `==`?
`==` compares object references, not numeric values in general. Use `.equals()` to compare their values.

```java
Integer a = 1000;
Integer b = 1000;

System.out.println(a.equals(b)); // true
```

---

## Quick Revision

| Topic | Key Point |
|---|---|
| Enum | Fixed set of constants |
| `values()` | Returns all constants |
| `valueOf()` | Finds constant by name |
| Wrapper | Primitive represented as object |
| Autoboxing | Primitive → Wrapper |
| Unboxing | Wrapper → Primitive |
| `parseInt()` | Returns `int` |
| `valueOf()` | Returns `Integer` |
| NumberFormatException | Invalid numeric conversion |
| Null unboxing | Throws NullPointerException |