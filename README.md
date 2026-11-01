# Java Learning Journey – Day 01 to Day 24

A structured journey of learning Java from fundamentals to advanced Core Java concepts, with hands-on coding, practice exercises, and interview preparation.

## 📚 Core Java – Daily Learning Progress

### Day 01 – Introduction to Java
- **Java:** A platform-independent, object-oriented programming language.
- **JDK:** A development kit containing tools required to develop Java applications.
- **JRE:** Provides the environment required to run Java applications.
- **JVM:** Executes Java bytecode and manages runtime operations.
- **Compilation:** Converts Java source code into bytecode.

### Day 02 – Variables and Data Types
- **Variables:** Named memory locations used to store data.
- **Primitive Data Types:** Built-in types used to store basic values.
- **Non-Primitive Data Types:** Types that store references to objects.
- **Type Casting:** Converting a value from one data type to another.

### Day 03 – Operators in Java
- **Arithmetic Operators:** Perform mathematical operations.
- **Relational Operators:** Compare two values and return a boolean result.
- **Logical Operators:** Combine or reverse boolean conditions.
- **Assignment Operators:** Assign or update variable values.
- **Unary Operators:** Operate on a single operand.

### Day 04 – Conditional Statements
- **if-else:** Executes code based on a condition.
- **else-if:** Checks multiple conditions in sequence.
- **Nested if:** Places one conditional statement inside another.
- **switch:** Selects one execution path from multiple options.

### Day 05 – Loops in Java
- **for Loop:** Repeats code using initialization, condition, and update.
- **while Loop:** Repeats code while a condition remains true.
- **do-while Loop:** Executes the block at least once before checking the condition.
- **break:** Terminates a loop immediately.
- **continue:** Skips the current iteration and moves to the next one.

### Day 06 – Arrays
- **Array:** Stores multiple values of the same data type in a fixed-size structure.
- **Single-Dimensional Array:** Stores elements in a linear sequence.
- **Multi-Dimensional Array:** Stores elements using multiple dimensions.
- **Array Traversal:** Visits each element using loops.

### Day 07 – Methods
- **Method:** A reusable block of code that performs a specific task.
- **Method Parameters:** Values passed into a method.
- **Return Type:** Defines the type of value a method returns.
- **Method Overloading:** Defines multiple methods with the same name but different parameters.

### Day 08 – Strings
- **String:** An immutable sequence of characters in Java.
- **String Pool:** A special memory area used to reuse String literals.
- **String Methods:** Built-in methods for manipulating and examining strings.
- **StringBuilder:** A mutable class used to modify strings efficiently.
- **StringBuffer:** A mutable and thread-safe alternative to StringBuilder.

### Day 09 – Classes and Objects
- **Class:** A blueprint used to create objects.
- **Object:** An instance of a class containing state and behavior.
- **Fields:** Variables that represent an object's state.
- **Methods:** Define the behavior of objects.
- **this Keyword:** Refers to the current object.

### Day 10 – Constructors
- **Constructor:** A special class member used to initialize objects.
- **Default Constructor:** A no-argument constructor automatically provided by Java when no constructor is declared.
- **Parameterized Constructor:** Initializes objects using supplied arguments.
- **Constructor Overloading:** Defines multiple constructors with different parameter lists.
- **Constructor Chaining:** Calls one constructor from another.

### Day 11 – Encapsulation
- **Encapsulation:** Bundles data and methods together while controlling access to internal state.
- **private:** Restricts access to members within the declaring class.
- **Getters:** Methods used to retrieve private field values.
- **Setters:** Methods used to update private field values with controlled access.

### Day 12 – Inheritance
- **Inheritance:** Allows one class to acquire properties and methods of another class.
- **extends:** Keyword used to inherit from a class.
- **super:** Refers to the immediate parent class.
- **Method Overriding:** Allows a subclass to provide its own implementation of an inherited method.
- **Multilevel Inheritance:** Creates an inheritance chain across multiple levels.

### Day 13 – Polymorphism
- **Polymorphism:** Allows one interface or reference to represent different forms of objects.
- **Compile-Time Polymorphism:** Achieved through method overloading.
- **Runtime Polymorphism:** Achieved through method overriding and dynamic method dispatch.
- **Dynamic Method Dispatch:** Determines the overridden method implementation at runtime.

### Day 14 – Abstraction
- **Abstraction:** Hides implementation details and exposes essential functionality.
- **Abstract Class:** A class that cannot be instantiated directly and may contain abstract methods.
- **Abstract Method:** A method declared without an implementation.
- **Interface:** Defines a contract that implementing classes agree to follow.
- **implements:** Keyword used by a class to implement an interface.

### Day 15 – Generics
- **Generics:** Enable classes and methods to work with different data types while maintaining type safety.
- **Generic Class:** A class that operates on a parameterized data type.
- **Generic Method:** A method that declares and uses its own type parameter.
- **Bounded Generics:** Restrict the types accepted by a generic parameter.
- **Wildcards:** Represent unknown generic types using `?`.
- **Upper Bound:** Uses `extends` to restrict a wildcard to a type or its subtypes.
- **Lower Bound:** Uses `super` to restrict a wildcard to a type or its supertypes.

### Day 16 – Lambda Expressions
- **Lambda Expression:** Provides a concise way to implement a functional interface.
- **Lambda Syntax:** Uses the `->` operator to separate parameters from the body.
- **Lambda Parameters:** Represent the input values passed to a lambda expression.
- **Lambda Body:** Contains the logic executed when the functional method is invoked.

### Day 17 – Functional Interfaces
- **Functional Interface:** An interface containing exactly one abstract method.
- **Predicate:** Accepts an input and returns a boolean result.
- **Function:** Accepts an input and produces an output.
- **Consumer:** Accepts an input and performs an operation without returning a result.
- **Supplier:** Supplies a value without accepting an input.
- **BiPredicate:** Accepts two inputs and returns a boolean result.
- **BiFunction:** Accepts two inputs and produces a result.
- **BiConsumer:** Accepts two inputs and performs an operation without returning a result.

### Day 18 – Method References
- **Method Reference:** A shorthand syntax for referring to an existing method using `::`.
- **Static Method Reference:** Refers to a static method of a class.
- **Instance Method Reference:** Refers to a method of a particular object.
- **Arbitrary Object Method Reference:** Refers to an instance method of an object of a specified type.
- **Constructor Reference:** Refers to a constructor using `ClassName::new`.

### Day 19 – Stream API Basics
- **Stream API:** Provides a functional approach to processing collections of data.
- **filter():** Selects elements that match a given condition.
- **map():** Transforms each stream element into another value.
- **count():** Returns the number of elements in a stream.
- **toList():** Collects stream elements into an unmodifiable list.

### Day 20 – Stream Operations
- **sorted():** Sorts stream elements.
- **distinct():** Removes duplicate elements from a stream.
- **limit():** Restricts the stream to a specified number of elements.
- **skip():** Skips a specified number of elements.
- **reduce():** Combines stream elements into a single result.
- **min():** Finds the minimum element.
- **max():** Finds the maximum element.

### Day 21 – Collectors
- **Collectors:** Provides utility methods to collect Stream API results.
- **toList():** Collects elements into a List.
- **toSet():** Collects elements into a Set, removing duplicates.
- **toMap():** Collects elements into a Map using key-value mappings.
- **groupingBy():** Groups elements based on a classification function.
- **partitioningBy():** Divides elements into two groups based on a predicate.

### Day 22 – Optional
- **Optional:** A container object that may or may not contain a non-null value.
- **of():** Creates an Optional containing a non-null value.
- **ofNullable():** Creates an Optional that may contain a null value.
- **isPresent():** Checks whether a value exists.
- **orElse():** Returns the value if present, otherwise a default value.
- **map():** Transforms the value inside an Optional.
- **filter():** Retains the value only when it matches a condition.

### Day 23 – Date and Time API
- **LocalDate:** Represents a date without a time or time zone.
- **LocalTime:** Represents a time without a date or time zone.
- **LocalDateTime:** Represents both date and time without a time zone.
- **DateTimeFormatter:** Formats and parses date-time values.
- **Period:** Calculates date-based differences in years, months, and days.
- **Duration:** Calculates time-based differences in seconds and smaller units.
- **plusDays() / minusMonths():** Performs date arithmetic.
- **isBefore() / isAfter():** Compares date-time values.

### Day 24 – Enums and Wrapper Classes
- **Enum:** Defines a fixed set of named constants.
- **values():** Returns all constants declared in an enum.
- **valueOf():** Returns an enum constant using its exact name.
- **name():** Returns the name of an enum constant.
- **ordinal():** Returns the zero-based position of an enum constant.
- **Wrapper Classes:** Represent primitive data types as objects.
- **Autoboxing:** Automatically converts a primitive into its wrapper object.
- **Unboxing:** Automatically converts a wrapper object into its primitive value.
- **parseInt():** Converts a numeric String into a primitive integer.
- **valueOf():** Converts a numeric String into an Integer wrapper object.
- **NumberFormatException:** Occurs when a String cannot be converted into the requested numeric format.
- **Null Handling:** Requires care because unboxing a null wrapper object throws NullPointerException.

---

## 🛠️ Learning Approach

- Daily concept-based learning.
- Hands-on Java coding examples.
- Separate practice exercises for every topic.
- Notes and interview questions.
- Git and GitHub version control.
- Continuous revision and problem-solving.

**Progress: Day 01 – Day 24 completed.**