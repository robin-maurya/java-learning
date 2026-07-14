# Day 02 - Operators, Type Casting & Scanner

## 📌 Topics Covered

- Arithmetic Operators
- Assignment Operators
- Comparison Operators
- Logical Operators
- Increment & Decrement
- Type Casting
- Scanner Class

---

# What are Operators?

Operators are special symbols used to perform operations on variables and values.

Example:

```java
int sum = 10 + 20;
```

Here '+' is an operator.

---

# Arithmetic Operators

Used for mathematical calculations.

| Operator | Meaning |
|----------|---------|
| + | Addition |
| - | Subtraction |
| * | Multiplication |
| / | Division |
| % | Modulus (Remainder) |

Example:

```java
int a = 10;
int b = 3;

System.out.println(a + b); // 13
System.out.println(a % b); // 1
```

---

# Assignment Operators

Used to assign values.

Example:

```java
int a = 10;

a += 5;
a -= 2;
a *= 3;
a /= 2;
```

---

# Comparison Operators

Used to compare two values.

| Operator | Meaning |
|----------|---------|
| == | Equal |
| != | Not Equal |
| > | Greater Than |
| < | Less Than |
| >= | Greater Than Equal |
| <= | Less Than Equal |

Returns:

true or false

Example:

```java
int age = 20;

System.out.println(age >= 18);
```

---

# Logical Operators

Used to combine multiple conditions.

&& → AND

|| → OR

! → NOT

Example:

```java
(age >= 18 && citizen == true)
```

---

# Increment Operator

Increases value by 1.

```java
a++;
++a;
```

---

# Decrement Operator

Decreases value by 1.

```java
a--;
--a;
```

---

# Type Casting

Converting one data type into another.

## Implicit Casting

Small → Large

```java
int a = 10;
double b = a;
```

---

## Explicit Casting

Large → Small

```java
double d = 10.5;
int x = (int)d;
```

Output:

10

---

# Scanner Class

Used to take user input.

Example:

```java
Scanner sc = new Scanner(System.in);

int age = sc.nextInt();

String name = sc.next();
```

Don't forget:

```java
import java.util.Scanner;
```

---

# Real World Example

ATM

Take PIN from user.

Shopping App

Take quantity from user.

Bank

Take account number from user.

---

# Best Practices

Use meaningful variable names.

Close Scanner after use.

Avoid unnecessary type casting.

Always validate user input.

---

# Common Mistakes

❌ Division by zero

❌ Forgetting import Scanner

❌ Wrong casting

❌ Using == for String comparison

---

# Key Points

Operators perform operations.

Comparison operators return boolean.

Logical operators combine conditions.

Scanner takes user input.

Type Casting converts data types.