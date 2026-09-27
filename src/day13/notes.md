# Day 13 — Exception Handling in Java

## Learning Objectives
- Understand exceptions and exception handling.
- Use `try`, `catch`, and `finally`.
- Handle multiple exception types.
- Understand `throw` and `throws`.
- Differentiate checked and unchecked exceptions.
- Create custom exceptions and understand exception propagation.

## 1. What Is an Exception?
An exception is an event during program execution that disrupts the normal flow of instructions.

Examples: `ArithmeticException`, `NullPointerException`, `IOException`.

```java
int result = 10 / 0; // ArithmeticException
```

## 2. Why Exception Handling?
Exception handling helps respond to exceptional situations, display meaningful messages, and avoid abrupt termination caused by uncaught exceptions.

## 3. Error vs Exception
| Error | Exception |
|---|---|
| Serious problem, often runtime/environment-related. | Exceptional condition an application may handle. |
| Generally not handled by application code. | Often handled using `try-catch`. |
| Example: `OutOfMemoryError` | Example: `IOException` |

Both extend `Throwable`.

## 4. Simplified Exception Hierarchy
```text
Object
└── Throwable
    ├── Error
    └── Exception
        ├── RuntimeException (unchecked)
        │   ├── ArithmeticException
        │   ├── NullPointerException
        │   ├── ArrayIndexOutOfBoundsException
        │   └── IllegalArgumentException
        └── Other checked exceptions (e.g. IOException, SQLException)
```

## 5. `try` Block
Contains code that may throw an exception.

```java
try {
    // risky code
}
```

A try statement must have at least a `catch`, a `finally`, or both.

## 6. `catch` Block
Handles a matching exception from its associated try block.

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
```

Output:
```text
Cannot divide by zero
```

Exception object methods:
- `e.getMessage()` — detail message.
- `e.toString()` — exception class and message.
- `e.printStackTrace()` — prints stack-trace details.

## 7. `finally` Block
Generally used for cleanup code. It normally executes whether an exception occurs or not.

```java
try {
    int result = 10 / 2;
    System.out.println(result);
} catch (ArithmeticException e) {
    System.out.println("Arithmetic error");
} finally {
    System.out.println("Finally block executed");
}
```

Output:
```text
5
Finally block executed
```

`finally` is not an absolute guarantee in cases such as abrupt JVM termination. Try-with-resources is often preferred for resource management.

## 8. Multiple `catch` Blocks
One try block can have multiple catch blocks.

```java
int[] numbers = {10, 20, 30};
try {
    System.out.println(numbers[5]);
} catch (ArithmeticException e) {
    System.out.println("Arithmetic error");
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Invalid array index");
} catch (Exception e) {
    System.out.println("General error");
}
```

Output: `Invalid array index`

**Rule:** Put specific exception types before general types. A general `Exception` catch before a subclass catch makes the subclass catch unreachable.

## 9. `throw`
Explicitly throws an exception object.

```java
if (age < 18) {
    throw new IllegalArgumentException("Age must be 18 or above");
}
```

## 10. `throws`
Declares exception types a method may pass to its caller. It does not handle the exception.

```java
import java.io.IOException;

static void readFile() throws IOException {
    // file-reading code
}
```

For a checked exception, the caller must catch it or declare it further.

## 11. `throw` vs `throws`
| `throw` | `throws` |
|---|---|
| Explicitly throws an exception object. | Declares exception types in method signature. |
| Used inside a method or block. | Used in method declaration. |
| Throws one object at a time. | Can declare multiple exception types. |
| `throw new IOException();` | `void read() throws IOException` |

## 12. Checked Exceptions
Checked exceptions are checked by the compiler and must be caught or declared.

Examples: `IOException`, `SQLException`, `ClassNotFoundException`.

```java
import java.io.FileReader;
import java.io.IOException;

try {
    FileReader file = new FileReader("test.txt");
    file.close();
} catch (IOException e) {
    System.out.println("File operation failed");
}
```

## 13. Unchecked Exceptions
Unchecked exceptions are not required to be caught or declared. They include `RuntimeException` and its subclasses.

Examples: `ArithmeticException`, `NullPointerException`, `ArrayIndexOutOfBoundsException`, `IllegalArgumentException`.

## 14. Checked vs Unchecked
| Checked | Unchecked |
|---|---|
| Compiler requires catch or declaration. | Compiler does not require catch or declaration. |
| Example: `IOException` | Example: `NullPointerException` |

## 15. Custom Exception
A user-defined exception class. Extend `Exception` for a checked custom exception or `RuntimeException` for an unchecked one.

```java
package day13.practice;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
```

Unchecked example:
```java
class InvalidAgeRuntimeException extends RuntimeException {
    public InvalidAgeRuntimeException(String message) {
        super(message);
    }
}
```

## 16. Using a Custom Exception

`InvalidAgeException.java`
```java
package day13.practice;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
```

`VotingDemo.java`
```java
package day13.practice;

public class VotingDemo {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Eligible for voting");
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

Output: `Age must be 18 or above`

## 17. Exception Propagation
Exception propagation is passing an exception up the call stack when it is not handled in the current method. If it remains uncaught and reaches the thread's top-level handler, the thread terminates.

## 18. Practice Programs
### DivisionDemo.java
```java
package day13.practice;

public class DivisionDemo {
    public static void main(String[] args) {
        int a = 10, b = 0;
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Division operation completed");
        }
    }
}
```

### ArrayDemo.java
```java
package day13.practice;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        } finally {
            System.out.println("Array operation completed");
        }
    }
}
```

### MultipleCatchPractice.java
```java
package day13.practice;

public class MultipleCatchPractice {
    public static void main(String[] args) {
        int a = 10, b = 2;
        int[] numbers = {20, 30, 40};
        try {
            System.out.println(a / b);
            System.out.println(numbers[5]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error");
        } catch (Exception e) {
            System.out.println("General error");
        }
    }
}
```

### AgeValidation.java
```java
package day13.practice;

public class AgeValidation {
    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        }
        System.out.println("Eligible");
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

### SalaryValidationDemo.java
`InvalidSalaryException.java`
```java
package day13.practice;

public class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}
```

`SalaryValidationDemo.java`
```java
package day13.practice;

public class SalaryValidationDemo {
    static void validateSalary(int salary) throws InvalidSalaryException {
        if (salary < 15000) {
            throw new InvalidSalaryException("Salary must be at least 15000");
        }
        System.out.println("Salary is valid");
    }

    public static void main(String[] args) {
        try {
            validateSalary(10000);
        } catch (InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

## 19. Quick Revision
| Concept | Meaning |
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

## Day 13 Completion Checklist
- [x] Exception basics and hierarchy
- [x] Error vs Exception
- [x] `try`, `catch`, `finally`
- [x] Multiple catch
- [x] `throw` and `throws`
- [x] Checked vs unchecked exceptions
- [x] Custom exceptions
- [x] Exception propagation
- [x] Practice programs
