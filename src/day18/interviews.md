# Day 18 — Interview Questions and Answers

## Q1. What is a method reference?

A method reference is a shorthand syntax for referring to an existing method using the `::` operator. It can replace a compatible lambda expression.

## Q2. What is the method reference operator?

The double colon operator `::` is used to refer to methods or constructors.

## Q3. What are the four types of method references?

1. Static method reference.
2. Instance method reference of a particular object.
3. Instance method reference of an arbitrary object of a particular type.
4. Constructor reference.

## Q4. What is a static method reference?

It refers to a static method using the class name.

Example: `Math::abs`

## Q5. What is an instance method reference?

It refers to an instance method.

Example: `System.out::println`

## Q6. What is the difference between `System.out::println` and `String::toUpperCase`?

`System.out::println` refers to a method of a particular existing object. `String::toUpperCase` refers to an instance method that will be called on an input String object.

## Q7. What is a constructor reference?

A constructor reference uses `ClassName::new` to refer to a constructor.

Example: `ArrayList::new`

## Q8. Does a method reference execute the method immediately?

No. It refers to the method. The method is invoked when the functional interface's abstract method is called.

## Q9. Can every lambda be converted into a method reference?

No. A method reference can replace a lambda only when an existing method is compatible with the functional interface's parameters and return type.

## Q10. What is the difference between a lambda and a method reference?

A lambda can contain an expression or a block of statements. A method reference is a concise way to refer to an existing compatible method or constructor.