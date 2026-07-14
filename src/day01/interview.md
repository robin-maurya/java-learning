# Day 01 Interview Questions

## Basic Questions

### 1. What is Java?

Java is a high-level, object-oriented, platform-independent programming language.

---

### 2. Why is Java platform independent?

Because Java code runs on JVM.

JVM converts bytecode into machine code.

---

### 3. What is JVM?

Java Virtual Machine.

Responsible for running Java programs.

---

### 4. What is JDK?

Java Development Kit.

Contains:

- JRE
- Compiler
- Development Tools

---

### 5. What is JRE?

Java Runtime Environment.

Provides environment to run Java applications.

---

### 6. Difference between JDK, JRE and JVM?

| JDK | JRE | JVM |
|-----|-----|-----|
| Develop + Run | Run | Execute |

---

### 7. What is Variable?

A variable is a container used to store data.

---

### 8. What is Data Type?

Data Type specifies what type of value a variable can store.

---

### 9. Primitive vs Non-Primitive Data Types?

Primitive

- int
- char
- boolean

Non Primitive

- String
- Array
- Class
- Object

---

### 10. Difference between print() and println()

print()

Same line output.

println()

Moves cursor to next line.

---

## Output Questions

### Q1

```java
System.out.print("Java");
System.out.print("Learning");
```

Output?

Answer

```
JavaLearning
```

---

### Q2

```java
System.out.println("Java");
System.out.println("Learning");
```

Answer

```
Java
Learning
```

---

## Tricky Questions

Can variable name start with number?

Answer:

No.

Example

❌

```java
int 1age;
```

✔

```java
int age1;
```

---

## Frequently Asked

Why Java is called Write Once Run Anywhere?

Because compiled bytecode runs on JVM available on different operating systems.
