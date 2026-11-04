# Day 25 – Advanced Exception Handling

## 1. Try-with-resources

**Definition:** Try-with-resources automatically closes resources after the try block finishes.

**Why use it?**
- Avoid manual resource closing.
- Prevent resource leaks.
- Cleaner and safer code.

**Example:**
```java
try (BufferedReader reader = new BufferedReader(
        new FileReader("data.txt"))) {

    System.out.println(reader.readLine());

} catch (IOException e) {
    System.err.println(e.getMessage());
}
```

**Important points:**
- Resource must implement `AutoCloseable`.
- Resources close automatically.
- Multiple resources can be declared.
- Resources close in reverse order of declaration.

## 2. Multi-catch

**Definition:** Multi-catch allows us to handle multiple exception types in a single catch block.

**Example:**
```java
try {
    int number = Integer.parseInt("Java");
    int[] numbers = {10, 20};

    System.out.println(numbers[5]);

} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
    System.out.println("Error: " + e.getMessage());
}
```

**Important points:**
- Use `|` between exception types.
- Avoid duplicate or related exception types where one is a subclass of another.
- Useful when multiple exceptions need the same handling.

## 3. Exception Chaining

**Definition:** Exception chaining means wrapping a lower-level exception inside a higher-level exception while preserving the original cause.

**Why use it?**
- Preserve original error information.
- Improve debugging.
- Translate technical exceptions into meaningful application exceptions.

**Example:**
```java
try {
    int result = 10 / 0;

} catch (ArithmeticException e) {
    throw new RuntimeException("Calculation failed", e);
}
```

**Important methods:**

| Method | Purpose |
|---|---|
| `getCause()` | Retrieves original exception |
| `initCause()` | Sets original cause |
| `getMessage()` | Retrieves exception message |

## 4. Custom Exception with Chaining

```java
public class UserServiceException extends RuntimeException {

    public UserServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
```

**Usage:**
```java
try {
    int result = 10 / 0;

} catch (ArithmeticException e) {
    throw new UserServiceException("Unable to fetch user details", e);
}
```

## 5. Exception Handling Best Practices

1. Avoid empty catch blocks.
2. Catch specific exceptions instead of unnecessarily catching `Exception`.
3. Provide meaningful error messages.
4. Preserve the original exception cause.
5. Do not use exceptions for normal program flow.
6. Log exceptions properly.
7. Never expose sensitive internal error details to clients.
8. Validate input before processing.

**Logging example:**
```java
log.error("Failed to fetch user details", e);
```

In real applications, logging frameworks such as SLF4J and Logback are preferred over `System.err`.

## 6. IllegalArgumentException

Used when a method receives an invalid argument.

**Example:**
```java
public static double calculateSalary(double salary) {

    if (salary < 0) {
        throw new IllegalArgumentException(
            "Salary cannot be negative"
        );
    }

    return salary;
}
```

## 7. Finally Block

**Definition:** The `finally` block is used for cleanup code and generally executes whether an exception occurs or not.

**Example:**
```java
try {
    System.out.println("Inside try");
    return;

} finally {
    System.out.println("Inside finally");
}
```

**Important points:**
- Executes after try/catch processing.
- Executes before a pending return completes.
- Usually executes even when an exception propagates.
- `System.exit()` can prevent its execution.
- Avoid `return` inside finally because it can override a return or suppress an exception.

## 8. Checked vs Unchecked Exceptions

| Checked | Unchecked |
|---|---|
| Checked at compile time | Occur at runtime |
| Must be caught or declared | Catching or declaring is not compulsory |
| Example: IOException | Example: NullPointerException |
| Example: SQLException | Example: NumberFormatException |

## 9. Important Exception Methods

| Method | Purpose |
|---|---|
| `getMessage()` | Exception message |
| `getCause()` | Original cause |
| `initCause()` | Set original cause |
| `toString()` | Exception class and message |
| `printStackTrace()` | Complete stack trace |

## 10. System.out vs System.err

- `System.out.println()` – Standard output.
- `System.err.println()` – Standard error output.

Both can appear in the console, but they represent separate output streams.

## Day 25 Summary

Topics completed:
- Try-with-resources
- Multi-catch
- Exception Chaining
- Custom exception with cause
- Exception handling best practices
- Finally block behaviour
- Checked vs Unchecked exceptions
- Error logging basics
