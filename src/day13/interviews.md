# Day 13 — Exception Handling Interview Questions

**Level:** Beginner to Intermediate

## 1. Basic Questions

### Q1. What is an exception?
**Answer:** An exception is an event during program execution that disrupts the normal flow of instructions. Example: `ArithmeticException`.

### Q2. What is exception handling?
**Answer:** Exception handling is a mechanism used to handle exceptional situations and help maintain the normal flow of a program.

### Q3. Why do we use exception handling?
**Answer:** We use it to respond to exceptional situations, show meaningful messages, and avoid abrupt termination caused by uncaught exceptions.

### Q4. What is the difference between Error and Exception?
**Answer:** An `Error` represents a serious problem that applications generally should not try to handle. An `Exception` represents a condition an application may be able to handle.

### Q5. What is the purpose of the `try` block?
**Answer:** The `try` block contains code that may throw an exception.

### Q6. What is the purpose of the `catch` block?
**Answer:** The `catch` block handles a matching exception thrown from its associated `try` block.

### Q7. What is the purpose of the `finally` block?
**Answer:** The `finally` block is generally used for cleanup code. It normally executes whether an exception occurs or not.

## 2. Intermediate Questions

### Q8. Can we use multiple `catch` blocks?
**Answer:** Yes. We can use multiple `catch` blocks to handle different exception types from one `try` block.

### Q9. What is the difference between `throw` and `throws`?
**Answer:** `throw` explicitly throws an exception object. `throws` declares exception types that a method may pass to its caller.

### Q10. What is a checked exception?
**Answer:** A checked exception is checked by the compiler and must be caught or declared using `throws`. Example: `IOException`.

### Q11. What is an unchecked exception?
**Answer:** An unchecked exception is not required to be caught or declared by the compiler. Example: `NullPointerException`.

### Q12. What is a custom exception?
**Answer:** A custom exception is a user-defined exception class created by extending `Exception` or `RuntimeException`.

### Q13. Difference between `Exception` and `RuntimeException`?
**Answer:** `RuntimeException` is a subclass of `Exception`. Its subclasses are unchecked. Other exception subclasses outside `RuntimeException` are generally checked.

### Q14. Can we write `try` without `catch`?
**Answer:** Yes. A `try` statement can have a `finally` block without a `catch` block.

### Q15. Can one `try` statement have multiple `finally` blocks?
**Answer:** No. A `try` statement can have at most one `finally` block.

## 3. Advanced and Practical Questions

### Q16. What happens if an exception is not handled?
**Answer:** An uncaught exception propagates up the call stack. If it reaches the thread's top-level handler, the thread terminates.

### Q17. Can we throw a checked exception?
**Answer:** Yes. A checked exception can be thrown, but it must be caught or declared using `throws`.

### Q18. Can a method declare multiple exceptions using `throws`?
**Answer:** Yes. Multiple exception types can be declared with commas.
```java
void readFile() throws IOException, SQLException {
    // Code
}
```

### Q19. What is exception propagation?
**Answer:** Exception propagation is passing an exception up the call stack until it is handled.

### Q20. Difference between `final`, `finally`, and `finalize()`?
**Answer:**
- `final` is a keyword used to restrict reassignment, inheritance, or overriding depending on its use.
- `finally` is a block generally used for cleanup.
- `finalize()` is a deprecated method historically associated with garbage collection.

### Q21. Why do we create custom exceptions?
**Answer:** To represent application-specific problems with meaningful names and messages.

### Q22. Difference between checked and unchecked custom exceptions?
**Answer:** A custom exception extending `Exception` (but not `RuntimeException`) is checked. One extending `RuntimeException` is unchecked.

## 4. Code-Based Questions

### Q23. What exception occurs when we divide an integer by zero?
**Answer:** `ArithmeticException`.
```java
int result = 10 / 0;
```

### Q24. What exception occurs when we access an invalid array index?
**Answer:** `ArrayIndexOutOfBoundsException`.
```java
int[] numbers = {10, 20, 30};
System.out.println(numbers[5]);
```

### Q25. What exception occurs when we call a method through a `null` reference?
**Answer:** Usually `NullPointerException`.
```java
String name = null;
System.out.println(name.length());
```

### Q26. What does `e.getMessage()` return?
**Answer:** It returns the exception's detail message, or `null` if no detail message is available.

### Q27. What is the output?
```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
} finally {
    System.out.println("Done");
}
```
**Answer:**
```text
Cannot divide by zero
Done
```

### Q28. Why should specific catch blocks come before general catch blocks?
**Answer:** A general catch such as `catch (Exception e)` can catch its subclasses. If it comes first, a later subclass catch becomes unreachable.

## 5. Quick Revision Table

| Concept | Short Answer |
|---|---|
| `try` | Contains code that may throw an exception |
| `catch` | Handles a matching exception |
| `finally` | Usually used for cleanup |
| `throw` | Explicitly throws an exception object |
| `throws` | Declares exception types in a method signature |
| Checked exception | Must be caught or declared |
| Unchecked exception | Not required to be caught or declared |
| Custom exception | User-defined exception |
| Exception propagation | Exception passes up the call stack |

## 6. Interview Practice — Speak Your Answers

1. What is an exception?
2. Why do we use exception handling?
3. Explain `try`, `catch`, and `finally`.
4. Difference between `throw` and `throws`?
5. Difference between checked and unchecked exceptions?
6. What is a custom exception?
7. What happens if an exception is not handled?
8. What is exception propagation?
9. Can we use multiple `catch` blocks?
10. Difference between `final`, `finally`, and `finalize()`?

## Day 13 Completion Checklist
- [x] Exception basics
- [x] `try-catch-finally`
- [x] Multiple catch blocks
- [x] `throw` and `throws`
- [x] Checked and unchecked exceptions
- [x] Custom exceptions
- [x] Exception propagation
- [x] Practice programs
