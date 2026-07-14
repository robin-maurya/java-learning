# Day 03 Interview Questions

## Basic Questions

### 1. What is Decision Making in Java?

Decision making allows execution of different code blocks based on conditions.

---

### 2. What is if Statement?

Used to execute code only when the condition is true.

---

### 3. Difference between if and if-else?

if

Executes only when condition is true.

if-else

Executes one block if true and another if false.

---

### 4. What is else-if Ladder?

Used when multiple conditions need to be checked.

---

### 5. What is Nested if?

An if statement inside another if statement.

---

### 6. What is switch Statement?

switch is used to compare one variable with multiple constant values.

---

### 7. Why do we use break in switch?

To stop execution after a matching case.

Without break, execution continues to the next cases (fall-through).

---

### 8. What is Default Case?

Executed when no case matches.

---

### 9. What is Ternary Operator?

A shorthand version of if-else.

Syntax

```java
condition ? trueValue : falseValue;
```

---

### 10. When should we use switch instead of if?

Use switch when comparing one variable with multiple fixed values.

---

## Output Questions

### Q1

```java
int age = 20;

if(age >=18)
System.out.println("Adult");
```

Output?

Answer

```
Adult
```

---

### Q2

```java
int number = 5;

if(number %2 ==0){
System.out.println("Even");
}
else{
System.out.println("Odd");
}
```

Answer

```
Odd
```

---

### Q3

```java
int day = 2;

switch(day){

case 1:
System.out.println("Mon");
break;

case 2:
System.out.println("Tue");
break;

default:
System.out.println("Invalid");

}
```

Answer

```
Tue
```

---

### Q4

```java
int age = 17;

String result = age >=18 ? "Vote" : "No Vote";

System.out.println(result);
```

Answer

```
No Vote
```

---

## Frequently Asked

Difference between if and switch?

Difference between if and ternary?

Can switch use String?

What happens if break is removed?

Can we write nested if?

Why use ternary operator?