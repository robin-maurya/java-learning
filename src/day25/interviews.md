# Day 25 – Advanced Exception Handling Interview Questions

### Q1. What is Try-with-resources?

**Answer:** Try-with-resources automatically closes resources after the try block completes.

It works with classes implementing `AutoCloseable` or `Closeable`.

**Example:** BufferedReader, FileInputStream.

### Q2. What is Multi-catch?

**Answer:** Multi-catch allows handling multiple exception types in a single catch block using the `|` operator.

```java
catch (NumberFormatException | IOException e) {
    System.out.println(e.getMessage());
}
```

### Q3. What is Exception Chaining?

**Answer:** Exception chaining means wrapping an original exception inside another exception while preserving its cause.

**Important methods:**
- `getCause()` – Retrieves original cause.
- `initCause()` – Sets original cause.

### Q4. What happens if finally contains a return statement?

**Answer:** A return inside finally can override the return from try or catch. It can also suppress a pending exception.

Therefore, avoid returning from finally.

### Q5. Is NumberFormatException checked or unchecked?

**Answer:** NumberFormatException is an unchecked exception because it extends IllegalArgumentException, which extends RuntimeException.

### Q6. What is the difference between System.out and System.err?

**Answer:**
- `System.out` is used for standard output.
- `System.err` is used for error output.

They are separate output streams.

### Q7. What happens when Double.parseDouble("Hello") executes?

**Answer:** Java throws NumberFormatException because "Hello" cannot be converted into a numeric value.

### Q8. When is finally not guaranteed to execute?

**Answer:** Finally is generally not executed if the JVM terminates abruptly, for example, when `System.exit(0)` is called.

It is also not guaranteed during JVM crashes or forced process termination.

---

## Additional Interview Notes

### Difference between getMessage() and toString()

- `getMessage()` returns the exception message.
- `toString()` returns the exception class name along with its message.

### Why should we avoid empty catch blocks?

Empty catch blocks silently ignore errors and make debugging difficult.

### What is IllegalArgumentException?

It is an unchecked exception thrown when a method receives an inappropriate or invalid argument.

### What is Fail-Fast Validation?

It means validating input early and rejecting invalid data before further processing.
