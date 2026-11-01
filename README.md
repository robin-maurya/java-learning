# Java Learning Journey -- Day 01 to Day 24

A practical Java learning repository containing concept explanations,
code examples, practice exercises, notes, and interview preparation.

> **Learning goal:** Build strong Core Java fundamentals, then move to
> Java backend development with Spring Boot and MySQL, and integrate it
> with React/Next.js.

## Learning Progress

-   **Core Java:** Day 01--24 topics covered in the learning journey.
-   **Current next step:** Advanced Core Java topics.
-   **Note:** This README is a revision guide. Use the individual
    `src/dayXX/concepts/`, `practice/`, `notes.md`, and `interviews.md`
    files for the complete code and exercises.

## How to use this README

For every topic, revise: 1. **Definition** -- what the concept means. 2.
**Why it is used** -- the problem it solves. 3. **Example** -- a small
code illustration. 4. **Remember** -- important rules and interview
points.

------------------------------------------------------------------------

# Phase 1 -- Java Fundamentals

## Day 01 -- Introduction to Java

### 1. Java

**Definition:** Java is a high-level, class-based, object-oriented
programming language. Java source code is compiled into bytecode, which
can run on a JVM.

**Why it is used:** It supports portable applications, object-oriented
design, automatic memory management, and a large ecosystem of libraries
and frameworks.

### 2. JDK (Java Development Kit)

**Definition:** The JDK is the software development kit used to develop
Java applications. It includes tools such as the Java compiler and the
runtime components.

**Why it is used:** Developers need the JDK to compile, debug, package,
and run Java programs during development.

### 3. JRE (Java Runtime Environment)

**Definition:** The JRE is the runtime environment required to run Java
applications. Conceptually, it includes the JVM and supporting runtime
libraries.

**Why it is used:** It provides the components needed by a Java
application while it is running.

### 4. JVM (Java Virtual Machine)

**Definition:** The JVM is the virtual machine that loads and executes
Java bytecode.

**Why it is used:** It provides the runtime environment, memory
management, garbage collection, and platform-specific execution.

### 5. Compilation

**Definition:** Compilation converts Java source code (`.java`) into
bytecode (`.class`) using the Java compiler.

**Example:**

``` bash
javac HelloWorld.java
java HelloWorld
```

**Remember:** - `javac` compiles source code. - `java` launches the
application. - Bytecode is executed by the JVM. - Java's portability is
commonly described as "write once, run anywhere," provided a compatible
JVM is available.

------------------------------------------------------------------------

## Day 02 -- Variables and Data Types

### 1. Variable

**Definition:** A variable is a named storage location whose value can
be read and, when permitted, changed during program execution.

**Why it is used:** Variables store values such as names, prices,
counters, and calculation results.

``` java
int age = 25;
String name = "Robin";
```

### 2. Primitive Data Types

**Definition:** Primitive types are Java's built-in value types: `byte`,
`short`, `int`, `long`, `float`, `double`, `char`, and `boolean`.

**Why they are used:** They represent basic values directly, such as
whole numbers, decimal numbers, characters, and true/false values.

``` java
int count = 10;
double price = 99.50;
char grade = 'A';
boolean active = true;
```

### 3. Non-Primitive / Reference Types

**Definition:** Reference variables hold references to objects or arrays
rather than storing the object's full state as a primitive value.

**Why they are used:** They allow programs to work with objects,
collections, strings, arrays, and user-defined types.

``` java
String city = "Gurgaon";
int[] numbers = {10, 20, 30};
```

### 4. Type Casting

**Definition:** Type casting converts a value from one data type to
another.

**Why it is used:** It is required when values of different types need
to be assigned or used together.

``` java
int number = 10;
double decimal = number;       // widening

double amount = 19.75;
int whole = (int) amount;      // narrowing; fractional part is lost
```

**Remember:** - Widening conversions are generally automatic. -
Narrowing conversions usually require an explicit cast. - Narrowing may
lose information.

------------------------------------------------------------------------

## Day 03 -- Operators in Java

### 1. Arithmetic Operators

**Definition:** Operators that perform mathematical calculations.

**Operators:** `+`, `-`, `*`, `/`, `%`

``` java
int a = 10, b = 3;
System.out.println(a + b); // 13
System.out.println(a % b); // 1
```

### 2. Relational Operators

**Definition:** Operators that compare two values and produce a boolean
result.

**Operators:** `==`, `!=`, `>`, `<`, `>=`, `<=`

``` java
System.out.println(10 > 5); // true
```

### 3. Logical Operators

**Definition:** Operators that combine or reverse boolean conditions.

**Operators:** `&&`, `||`, `!`

``` java
int age = 25;
System.out.println(age >= 18 && age <= 60);
```

### 4. Assignment Operators

**Definition:** Operators that assign a value or update a variable using
an operation.

**Operators:** `=`, `+=`, `-=`, `*=`, `/=`, `%=`

``` java
int score = 10;
score += 5; // 15
```

### 5. Unary Operators

**Definition:** Operators that work on a single operand.

**Examples:** `++`, `--`, `+`, `-`, `!`

``` java
int count = 5;
count++;
```

**Remember:** `x++` uses the current value before incrementing in an
expression; `++x` increments before the value is used.

------------------------------------------------------------------------

## Day 04 -- Conditional Statements

### 1. if-else

**Definition:** Executes one block when a condition is true and another
block when it is false.

``` java
int age = 20;
if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

### 2. else-if

**Definition:** Checks multiple conditions in order. The first true
branch is executed.

``` java
int marks = 75;
if (marks >= 90) {
    System.out.println("A");
} else if (marks >= 60) {
    System.out.println("B");
} else {
    System.out.println("Needs improvement");
}
```

### 3. Nested if

**Definition:** An `if` statement placed inside another conditional
statement.

**Why it is used:** It handles a decision that depends on an earlier
decision.

### 4. switch

**Definition:** Selects an execution path based on the value of an
expression.

``` java
int day = 2;
switch (day) {
    case 1 -> System.out.println("Monday");
    case 2 -> System.out.println("Tuesday");
    default -> System.out.println("Other day");
}
```

**Remember:** Use conditions for ranges and complex boolean logic; use
`switch` when selecting among distinct values.

------------------------------------------------------------------------

## Day 05 -- Loops in Java

### 1. for Loop

**Definition:** Repeats a block using initialization, a condition, and
an update expression.

``` java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

### 2. while Loop

**Definition:** Repeats a block while its condition remains true. The
condition is checked before each iteration.

``` java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

### 3. do-while Loop

**Definition:** Executes the body first and checks the condition
afterward, so the body runs at least once.

``` java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

### 4. break

**Definition:** Immediately terminates the nearest enclosing loop or
switch.

### 5. continue

**Definition:** Skips the remaining statements in the current loop
iteration and proceeds to the next iteration.

**Remember:** Make sure loop variables or conditions change as expected
to avoid an infinite loop.

------------------------------------------------------------------------

## Day 06 -- Arrays

### 1. Array

**Definition:** An array is a fixed-size object that stores multiple
values of the same component type.

**Why it is used:** It stores related values under one variable name and
provides indexed access.

``` java
int[] numbers = {10, 20, 30};
System.out.println(numbers[0]); // 10
```

### 2. Single-Dimensional Array

**Definition:** An array whose elements are accessed using one index.

``` java
String[] names = {"Amit", "Neha", "Rahul"};
```

### 3. Multi-Dimensional Array

**Definition:** An array whose elements are themselves arrays. A
two-dimensional array is commonly used like a table.

``` java
int[][] matrix = {
    {1, 2},
    {3, 4}
};
System.out.println(matrix[1][0]); // 3
```

### 4. Array Traversal

**Definition:** Visiting array elements one by one, commonly using a
`for` or enhanced `for` loop.

``` java
for (int value : numbers) {
    System.out.println(value);
}
```

**Remember:** - Array indexes start at `0`. - `array.length` gives the
number of elements. - Accessing an invalid index causes
`ArrayIndexOutOfBoundsException`. - Arrays have a fixed length after
creation.

------------------------------------------------------------------------

## Day 07 -- Methods

### 1. Method

**Definition:** A method is a named block of code that performs a task
and can be called when required.

**Why it is used:** Methods improve reuse, readability, testing, and
separation of responsibilities.

``` java
static void greet() {
    System.out.println("Hello");
}
```

### 2. Method Parameters and Arguments

**Definition:** Parameters are variables declared in a method
definition; arguments are the actual values supplied when calling the
method.

``` java
static void greet(String name) { // name is a parameter
    System.out.println("Hello " + name);
}

greet("Robin"); // "Robin" is an argument
```

### 3. Return Type

**Definition:** Specifies the type of value returned by a method. `void`
means the method does not return a value.

``` java
static int add(int a, int b) {
    return a + b;
}
```

### 4. Method Overloading

**Definition:** Defines multiple methods with the same name but
different parameter lists.

``` java
static int add(int a, int b) {
    return a + b;
}

static double add(double a, double b) {
    return a + b;
}
```

**Remember:** Return type alone cannot distinguish overloaded methods.

------------------------------------------------------------------------

## Day 08 -- Strings

### 1. String

**Definition:** `String` is a Java class representing an immutable
sequence of characters.

**Why it is used:** It represents text such as names, messages, and user
input.

``` java
String language = "Java";
System.out.println(language.length());
```

### 2. String Pool

**Definition:** A JVM-managed area of the heap where string literals can
be shared to reduce duplicate String objects.

``` java
String a = "Java";
String b = "Java";
System.out.println(a == b); // commonly true for the same interned literal
```

### 3. String Methods

**Definition:** Methods such as `length()`, `charAt()`, `substring()`,
`equals()`, `contains()`, and `toUpperCase()` inspect or produce string
values.

``` java
String text = "Hello Java";
System.out.println(text.toUpperCase());
System.out.println(text.contains("Java"));
```

### 4. StringBuilder

**Definition:** A mutable character sequence designed for modifying text
without creating a new String for every change.

``` java
StringBuilder builder = new StringBuilder("Hello");
builder.append(" Java");
System.out.println(builder);
```

### 5. StringBuffer

**Definition:** A mutable character sequence whose methods are
synchronized, making it suitable for certain shared-thread use cases.

**Remember:** - `String` is immutable. - Use `StringBuilder` for
repeated modifications in ordinary single-threaded code. - Use
`equals()` to compare String content; `==` compares references.

------------------------------------------------------------------------

# Phase 2 -- Object-Oriented Programming

## Day 09 -- Classes and Objects

### 1. Class

**Definition:** A class is a blueprint that defines the fields and
methods its objects can have.

### 2. Object

**Definition:** An object is a runtime instance of a class with state
and behavior.

``` java
class Employee {
    String name;

    void work() {
        System.out.println(name + " is working");
    }
}

Employee employee = new Employee();
employee.name = "Robin";
employee.work();
```

### 3. Fields

**Definition:** Variables declared inside a class (but outside methods
and constructors) represent the state of an object or class.

### 4. Methods

**Definition:** Methods define operations or behavior that objects or
classes can perform.

### 5. this Keyword

**Definition:** `this` refers to the current object instance.

``` java
class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}
```

**Remember:** Instance fields belong to each object; static fields
belong to the class.

------------------------------------------------------------------------

## Day 10 -- Constructors

### 1. Constructor

**Definition:** A constructor is a special class member used to
initialize a new object. It has the same name as the class and no return
type.

``` java
class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}
```

### 2. Default Constructor

**Definition:** If no constructor is declared, the compiler provides a
no-argument default constructor.

**Remember:** Once any constructor is declared, Java does not
automatically add the default constructor.

### 3. Parameterized Constructor

**Definition:** A constructor that accepts arguments to initialize an
object with supplied values.

### 4. Constructor Overloading

**Definition:** Defining multiple constructors with different parameter
lists.

### 5. Constructor Chaining

**Definition:** Calling another constructor from a constructor using
`this()` or a superclass constructor using `super()`.

**Remember:** A constructor is not inherited and cannot be overridden.

------------------------------------------------------------------------

## Day 11 -- Encapsulation

### 1. Encapsulation

**Definition:** Encapsulation combines data and the methods that operate
on it in a class, while controlling access to internal state.

**Why it is used:** It protects an object's state and allows validation
when values are changed.

``` java
class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
```

### 2. private

**Definition:** `private` restricts access to a member to within the
declaring top-level class (including its nested code).

### 3. Getters

**Definition:** Methods that provide controlled access to field values.

### 4. Setters

**Definition:** Methods that update field values, optionally applying
validation.

**Remember:** Encapsulation does not mean every field must have a public
setter. Expose only operations that make sense.

------------------------------------------------------------------------

## Day 12 -- Inheritance

### 1. Inheritance

**Definition:** Inheritance allows a class to derive fields and methods
from another class.

**Why it is used:** It supports code reuse and models an "is-a"
relationship.

``` java
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}
```

### 2. extends

**Definition:** The `extends` keyword declares that a class inherits
from another class.

### 3. super

**Definition:** `super` refers to the immediate superclass context. It
can access superclass members and invoke a superclass constructor.

### 4. Method Overriding

**Definition:** A subclass provides its own implementation of an
inherited instance method, following Java's overriding rules.

### 5. Multilevel Inheritance

**Definition:** An inheritance chain in which a class extends a class
that itself extends another class.

**Remember:** - Java classes support single class inheritance. - A class
can implement multiple interfaces. - Constructors are not inherited. -
Use inheritance for a genuine "is-a" relationship; composition is often
better for "has-a".

------------------------------------------------------------------------

## Day 13 -- Exception Handling

### 1. Exception

**Definition:** An exception is an event represented by an object that
disrupts the normal flow of program execution.

**Why it is used:** Exception handling allows a program to respond to
failures and, where possible, continue safely.

### 2. Error vs Exception

**Definition:** Both are subclasses of `Throwable`. `Error` generally
represents serious JVM or environment problems; `Exception` represents
conditions applications may handle.

### 3. try

**Definition:** A `try` block encloses code that may throw an exception.

### 4. catch

**Definition:** A `catch` block handles a matching exception thrown from
its associated `try` block.

``` java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println(e.getMessage());
}
```

### 5. finally

**Definition:** A `finally` block is used for cleanup code and normally
executes whether or not an exception occurs.

**Remember:** Abrupt JVM termination can prevent `finally` from
executing. Prefer try-with-resources for closeable resources.

### 6. Multiple catch blocks

**Definition:** Multiple `catch` blocks handle different exception types
from one `try` block.

**Remember:** Put more specific exception types before more general
types.

### 7. throw

**Definition:** `throw` explicitly throws an exception object.

``` java
throw new IllegalArgumentException("Invalid age");
```

### 8. throws

**Definition:** `throws` declares exceptions that a method may pass to
its caller.

``` java
static void readFile() throws IOException {
    // file-reading operation
}
```

### 9. Checked Exceptions

**Definition:** Checked exceptions are checked by the compiler and must
be caught or declared, subject to Java's rules.

**Examples:** `IOException`, `SQLException`, `ClassNotFoundException`.

### 10. Unchecked Exceptions

**Definition:** Runtime exceptions and their subclasses are unchecked;
the compiler does not require them to be caught or declared.

**Examples:** `ArithmeticException`, `NullPointerException`,
`ArrayIndexOutOfBoundsException`, `IllegalArgumentException`.

### 11. Custom Exceptions

**Definition:** Application-specific exception classes created to
represent domain or business-rule failures.

``` java
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}
```

### 12. Exception Propagation

**Definition:** If a method does not handle an exception, it can
propagate up the call stack to its caller.

**Remember:** - `throw` throws an exception; `throws` declares possible
exceptions. - `getMessage()`, `toString()`, and `printStackTrace()`
provide exception information. - Do not silently swallow exceptions.

------------------------------------------------------------------------

## Day 14 -- Collections Framework

### 1. Collections Framework

**Definition:** The Java Collections Framework provides interfaces and
implementations for storing and manipulating groups of objects.

**Why it is used:** It provides reusable data structures and common
operations such as adding, removing, searching, and iterating.

### 2. List

**Definition:** An ordered collection that allows duplicates and
supports positional access.

**Common implementations:** `ArrayList`, `LinkedList`.

``` java
List<String> names = new ArrayList<>();
names.add("Amit");
names.add("Amit");
```

### 3. Set

**Definition:** A collection that does not allow duplicate elements.

**Common implementations:** - `HashSet` -- no guaranteed iteration
order. - `LinkedHashSet` -- preserves insertion order. - `TreeSet` --
maintains sorted order.

### 4. Queue

**Definition:** A collection designed to hold elements before
processing, commonly in FIFO order.

### 5. Map

**Definition:** An object that maps unique keys to values. `Map` is part
of the Collections Framework but does not extend the `Collection`
interface.

**Common implementations:** - `HashMap` -- no guaranteed iteration
order. - `LinkedHashMap` -- preserves insertion order. - `TreeMap` --
sorts keys.

``` java
Map<Integer, String> employees = new HashMap<>();
employees.put(101, "Robin");
employees.put(102, "Amit");
```

**Remember:** - `List` allows duplicates; `Set` does not. - `Map` stores
key-value pairs; keys are unique. - Choose an implementation based on
ordering, lookup, and performance requirements.

------------------------------------------------------------------------

# Phase 3 -- Modern Java

## Day 15 -- Generics

### 1. Generics

**Definition:** Generics allow classes, interfaces, and methods to work
with parameterized types while providing compile-time type safety.

**Why it is used:** Generics reduce explicit casting and help detect
type errors at compile time.

``` java
List<String> names = new ArrayList<>();
names.add("Robin");
String name = names.get(0);
```

### 2. Generic Class

**Definition:** A class that declares a type parameter and uses it for
its fields or methods.

``` java
class Container<T> {
    private T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}
```

### 3. Generic Method

**Definition:** A method that declares its own type parameter.

``` java
static <T> void printValue(T value) {
    System.out.println(value);
}
```

### 4. Bounded Generics

**Definition:** A bound restricts the types accepted by a type
parameter.

``` java
static <T extends Number> void printNumber(T value) {
    System.out.println(value);
}
```

### 5. Wildcards

**Definition:** `?` represents an unknown type in a parameterized type.

-   `? extends Number` -- upper-bounded wildcard; useful when reading
    values as `Number`.
-   `? super Integer` -- lower-bounded wildcard; useful when adding
    `Integer` values.

**Remember:** PECS means Producer Extends, Consumer Super. A producer
supplies values to your code; a consumer accepts values from your code.

------------------------------------------------------------------------

## Day 16 -- Lambda Expressions

### 1. Lambda Expression

**Definition:** A lambda expression is a concise way to provide an
implementation of a functional interface's single abstract method.

**Why it is used:** It reduces boilerplate when passing behavior as an
argument.

``` java
Runnable task = () -> System.out.println("Task running");
task.run();
```

### 2. Lambda Syntax

**Definition:** The `->` operator separates the parameter list from the
lambda body.

``` java
(a, b) -> a + b
```

### 3. Lambda Parameters

**Definition:** Parameters represent the input values received when the
functional method is invoked.

### 4. Lambda Body

**Definition:** The body contains the operation performed by the lambda.
It can be an expression or a block.

**Remember:** - Lambdas target functional interfaces. - A lambda does
not execute merely because it is declared; the target method must be
invoked. - Captured local variables must be final or effectively final.

------------------------------------------------------------------------

## Day 17 -- Functional Interfaces

### 1. Functional Interface

**Definition:** An interface with exactly one abstract method. It can be
implemented using a lambda expression or method reference.

``` java
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
```

### 2. Predicate`<T>`{=html}

**Definition:** Accepts one input and returns a boolean result.

``` java
Predicate<Integer> isAdult = age -> age >= 18;
```

### 3. Function\<T, R\>

**Definition:** Accepts one input of type `T` and returns a result of
type `R`.

``` java
Function<String, Integer> length = text -> text.length();
```

### 4. Consumer`<T>`{=html}

**Definition:** Accepts one input and performs an operation without
returning a result.

``` java
Consumer<String> printer = text -> System.out.println(text);
```

### 5. Supplier`<T>`{=html}

**Definition:** Supplies a value without accepting an input.

``` java
Supplier<Double> randomValue = () -> Math.random();
```

### 6. BiPredicate\<T, U\>

**Definition:** Accepts two inputs and returns a boolean result.

### 7. BiFunction\<T, U, R\>

**Definition:** Accepts two inputs and returns a result.

### 8. BiConsumer\<T, U\>

**Definition:** Accepts two inputs and performs an operation without
returning a result.

**Remember:** Predicate → boolean; Function → result; Consumer → action;
Supplier → provides a value.

------------------------------------------------------------------------

## Day 18 -- Method References

### 1. Method Reference

**Definition:** A method reference is shorthand for a lambda expression
that calls an existing method. It uses the `::` operator.

``` java
Function<String, String> upper = String::toUpperCase;
```

### 2. Static Method Reference

**Definition:** Refers to a static method of a class.

``` java
Function<String, Integer> parser = Integer::parseInt;
```

### 3. Instance Method Reference

**Definition:** Refers to an instance method of a particular, already
available object.

``` java
Consumer<String> printer = System.out::println;
```

### 4. Arbitrary Object Method Reference

**Definition:** Refers to an instance method on an object that will be
supplied as the functional method's argument.

``` java
Function<String, String> upper = String::toUpperCase;
```

### 5. Constructor Reference

**Definition:** Refers to a constructor using `ClassName::new`.

``` java
Supplier<ArrayList<String>> listFactory = ArrayList::new;
```

**Remember:** The referenced method or constructor must be compatible
with the target functional interface's method signature.

------------------------------------------------------------------------

## Day 19 -- Stream API Basics

### 1. Stream API

**Definition:** The Stream API processes sequences of elements through a
pipeline of operations, often using a functional style.

**Why it is used:** It makes filtering, transforming, and aggregating
collection data more declarative.

``` java
List<String> names = List.of("Amit", "Neha", "Rahul");

List<String> result = names.stream()
        .filter(name -> name.length() > 4)
        .map(String::toUpperCase)
        .toList();
```

### 2. filter()

**Definition:** Keeps only elements that match a given predicate.

### 3. map()

**Definition:** Transforms each stream element into another value.

### 4. count()

**Definition:** Returns the number of elements in a stream as a `long`.

### 5. toList()

**Definition:** Collects stream elements into an unmodifiable list.

**Remember:** - Intermediate operations such as `filter()` and `map()`
are lazy. - Terminal operations such as `count()` and `toList()` trigger
pipeline processing. - A stream should not be reused after a terminal
operation. - `Stream.toList()` returns an unmodifiable list.

------------------------------------------------------------------------

## Day 20 -- Stream Operations

### 1. sorted()

**Definition:** Returns a stream with elements in sorted order, using
natural ordering or a supplied comparator.

``` java
numbers.stream().sorted().forEach(System.out::println);
```

### 2. distinct()

**Definition:** Removes duplicate elements according to `equals()`.

### 3. limit()

**Definition:** Restricts the stream to at most the specified number of
elements.

### 4. skip()

**Definition:** Discards the first specified number of elements.

### 5. reduce()

**Definition:** Combines stream elements into a single result using an
accumulation operation.

``` java
int sum = numbers.stream().reduce(0, Integer::sum);
```

### 6. min()

**Definition:** Finds the smallest element according to a comparator and
returns an `Optional`.

### 7. max()

**Definition:** Finds the largest element according to a comparator and
returns an `Optional`.

**Remember:** `min()` and `max()` return `Optional` because the stream
may be empty.

------------------------------------------------------------------------

## Day 21 -- Collectors

### 1. Collectors

**Definition:** `Collectors` is a utility class providing collector
implementations for reducing stream elements into collections, maps,
groups, and summary results.

### 2. toList()

**Definition:** Collects stream elements into a List.

### 3. toSet()

**Definition:** Collects stream elements into a Set, removing duplicates
according to the Set implementation.

### 4. toMap()

**Definition:** Collects elements into a Map using key and value mapping
functions.

``` java
Map<String, Integer> nameLengths = names.stream()
        .collect(Collectors.toMap(
                name -> name,
                String::length
        ));
```

**Remember:** `toMap()` needs a merge function if duplicate keys may
occur.

### 5. groupingBy()

**Definition:** Groups elements according to a classification function
and stores the groups in a Map.

``` java
Map<Integer, List<String>> grouped =
        names.stream().collect(Collectors.groupingBy(String::length));
```

### 6. partitioningBy()

**Definition:** Splits elements into two groups based on a predicate,
with `true` and `false` keys.

**Remember:** `groupingBy()` can create many groups; `partitioningBy()`
creates two predicate-based groups.

------------------------------------------------------------------------

## Day 22 -- Optional

### 1. Optional`<T>`{=html}

**Definition:** `Optional` is a container object that may hold a
non-null value or be empty.

**Why it is used:** It makes the possible absence of a result explicit
and encourages deliberate handling.

### 2. of()

**Definition:** Creates an Optional containing a non-null value. Passing
`null` throws `NullPointerException`.

### 3. ofNullable()

**Definition:** Creates an Optional that is empty if the supplied value
is null.

### 4. empty()

**Definition:** Creates an empty Optional.

### 5. isPresent()

**Definition:** Returns true when a value is present.

### 6. orElse()

**Definition:** Returns the contained value or a fallback value. The
fallback expression is evaluated before the call.

### 7. orElseGet()

**Definition:** Returns the contained value or obtains a fallback from a
Supplier when empty.

### 8. map()

**Definition:** Transforms a present value and wraps the result in an
Optional.

### 9. filter()

**Definition:** Keeps a present value only if it matches the supplied
predicate; otherwise returns empty.

``` java
String result = Optional.ofNullable("Java")
        .filter(value -> value.length() > 3)
        .map(String::toUpperCase)
        .orElse("UNKNOWN");
```

**Remember:** Avoid calling `get()` without checking presence. Optional
is most useful as a return type to represent a possibly absent result.

------------------------------------------------------------------------

## Day 23 -- Date and Time API

### 1. LocalDate

**Definition:** Represents a date without a time or time zone.

``` java
LocalDate today = LocalDate.now();
```

### 2. LocalTime

**Definition:** Represents a time without a date or time zone.

``` java
LocalTime now = LocalTime.now();
```

### 3. LocalDateTime

**Definition:** Represents both a date and a time without a time zone.

``` java
LocalDateTime current = LocalDateTime.now();
```

### 4. DateTimeFormatter

**Definition:** Formats date-time values into text and parses text into
date-time values.

``` java
DateTimeFormatter formatter =
        DateTimeFormatter.ofPattern("dd-MM-yyyy");

String formatted = LocalDate.now().format(formatter);
```

### 5. Period

**Definition:** Represents a date-based amount of time in years, months,
and days.

**Common use:** Calculating age or date-based differences.

### 6. Duration

**Definition:** Represents a time-based amount of time, commonly in
seconds and nanoseconds.

**Common use:** Measuring elapsed time between time-based values.

### 7. plusDays() / minusMonths()

**Definition:** Date-time operations that return adjusted date-time
values.

### 8. isBefore() / isAfter()

**Definition:** Compare whether one date-time value occurs before or
after another.

**Remember:** - `java.time` classes are immutable. - Methods such as
`plusDays()` return a new value. - `LocalDateTime` does not contain a
time zone; use zoned types when zone information matters.

------------------------------------------------------------------------

## Day 24 -- Enums and Wrapper Classes

### 1. Enum

**Definition:** An enum defines a fixed set of named constants.

**Why it is used:** It represents a known set of values, such as order
status, user role, or payment state.

``` java
enum OrderStatus {
    PENDING, SHIPPED, DELIVERED, CANCELLED
}
```

### 2. values()

**Definition:** Returns an array containing all enum constants in
declaration order.

### 3. valueOf()

**Definition:** Returns the enum constant whose name exactly matches the
supplied String. An unknown name causes `IllegalArgumentException`.

### 4. name()

**Definition:** Returns the declared name of an enum constant.

### 5. ordinal()

**Definition:** Returns the zero-based position of an enum constant in
its declaration.

**Remember:** Avoid using `ordinal()` as a persistent business
identifier because changing declaration order changes ordinal values.

### 6. Enum with fields and methods

**Definition:** Enums can have fields, constructors, and methods to
associate data and behavior with each constant.

``` java
enum EmployeeRole {
    DEVELOPER(50000),
    MANAGER(80000);

    private final int salary;

    EmployeeRole(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
```

### 7. Wrapper Classes

**Definition:** Wrapper classes represent primitive values as objects.

Primitive   Wrapper
  ----------- -----------
byte        Byte
short       Short
int         Integer
long        Long
float       Float
double      Double
char        Character
boolean     Boolean

### 8. Autoboxing

**Definition:** Automatic conversion of a primitive value into its
corresponding wrapper object.

``` java
Integer number = 10;
```

### 9. Unboxing

**Definition:** Automatic conversion of a wrapper object into its
corresponding primitive value.

``` java
Integer number = 10;
int value = number;
```

### 10. parseInt() and valueOf()

**Definition:** `Integer.parseInt()` converts a numeric String into
primitive `int`; `Integer.valueOf()` returns an `Integer` object.

``` java
int primitive = Integer.parseInt("123");
Integer wrapper = Integer.valueOf("123");
```

### 11. NumberFormatException

**Definition:** An unchecked exception thrown when a String cannot be
parsed as the requested numeric format.

``` java
try {
    int value = Integer.parseInt("abc");
} catch (NumberFormatException e) {
    System.out.println("Invalid number");
}
```

### 12. Wrapper Null Handling

**Definition:** Wrapper references can be null. Unboxing a null wrapper
throws `NullPointerException`.

``` java
Integer value = null;

if (value != null) {
    int number = value; // safe after null check
}
```

**Remember:** Primitive variables cannot hold null; wrapper references
can. Use wrappers when an object representation or nullable value is
required.

------------------------------------------------------------------------

# Upcoming Roadmap -- Topics to Study Next

These topics are **planned**, not marked as completed in this tracker.

  -----------------------------------------------------------------------
Priority                Topic                   What to learn
  ----------------------- ----------------------- -----------------------
1                       Collections Advanced    Iterator, ListIterator,
Comparable, Comparator,
HashMap concepts,
equals() and
hashCode(), Queue,
Deque, concurrent
collections

2                       Exception Handling      try-with-resources,
Advanced                multi-catch, exception
chaining,
exception-handling best
practices

3                       File Handling and Java  File, Path, Files,
I/O                     streams,
BufferedReader,
BufferedWriter,
try-with-resources

4                       Multithreading          Thread, Runnable,
lifecycle,
synchronization, race
conditions,
ExecutorService,
Callable, Future,
CompletableFuture

5                       JDBC                    JDBC architecture,
Connection,
PreparedStatement,
CRUD, transactions

6                       Maven                   pom.xml, dependencies,
plugins, lifecycle,
build and test commands

7                       Spring Framework        IoC, Dependency
Injection, Spring
Beans, component
scanning

8                       Spring Boot             REST APIs, Controllers,
Services, Repositories,
configuration,
validation

9                       Spring Data JPA + MySQL Entities,
relationships,
repositories, queries,
pagination,
transactions

10                      Spring Security         Authentication,
authorization, password
encoding, JWT

11                      Full-Stack Project      React/Next.js + Spring
Boot + MySQL
integration, testing
and deployment
  -----------------------------------------------------------------------

## Repository Structure

``` text
java-learning/
│
├── src/
│   ├── day01/
│   │   ├── concepts/
│   │   ├── practice/
│   │   ├── notes.md
│   │   └── interviews.md
│   ├── day02/
│   ├── ...
│   └── day24/
│
└── README.md
```

## Learning Workflow

1.  Understand the definition and purpose of a concept.
2.  Write and run a separate example.
3.  Solve practice questions independently.
4.  Review the code and understand improvements.
5.  Add notes and interview questions.
6.  Commit and push completed work to GitHub.
7.  Revise older topics regularly.

## Tools

-   Java 25
-   IntelliJ IDEA
-   Git and GitHub
-   MySQL -- upcoming backend learning
-   Maven and Spring Boot -- upcoming backend learning

## Final Goal

Build a strong foundation in Java, learn backend development using
Spring Boot and MySQL, and combine it with existing React/Next.js skills
to build real-world full-stack applications.

**Learn → Understand → Practice → Build → Review → Improve.**
