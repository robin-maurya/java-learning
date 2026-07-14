# Day 03 - Decision Making Statements

## 📌 Topics Covered

- if Statement
- if-else Statement
- else-if Ladder
- Nested if
- switch Case
- Ternary Operator

---

# What is Decision Making?

Decision making allows a program to execute different blocks of code based on a condition.

Example:

If age >= 18

→ Eligible to Vote

Else

→ Not Eligible

---

# if Statement

Used when only one condition needs to be checked.

Syntax

```java
if(condition){
    // code
}
```

Example

```java
int age = 20;

if(age >= 18){
    System.out.println("Eligible");
}
```

---

# if-else Statement

Used when two possible outcomes exist.

Syntax

```java
if(condition){

}
else{

}
```

Example

```java
if(age >= 18){
    System.out.println("Eligible");
}
else{
    System.out.println("Not Eligible");
}
```

---

# else-if Ladder

Used when multiple conditions need to be checked.

Example

```java
if(marks >= 90){
    Grade = "A";
}
else if(marks >= 80){
    Grade = "B";
}
else{
    Grade = "C";
}
```

---

# Nested if

An if statement inside another if statement.

Example

```java
if(username){

    if(password){

    }

}
```

---

# switch Statement

Used when checking one variable against multiple values.

Example

```java
switch(day){

case 1:
System.out.println("Monday");
break;

case 2:
System.out.println("Tuesday");
break;

default:
System.out.println("Invalid");

}
```

---

# Ternary Operator

Short form of if-else.

Syntax

```java
condition ? trueValue : falseValue;
```

Example

```java
String result = age >=18 ? "Eligible" : "Not Eligible";
```

---

# Difference

if

Best for complex logic.

switch

Best for fixed values.

Ternary

Best for one-line conditions.

---

# Real World Examples

Login System

ATM

Banking

Online Shopping

Food Delivery Apps

Employee Portal

---

# Best Practices

Use meaningful conditions.

Avoid unnecessary nested if.

Always use break in switch.

Keep conditions simple.

---

# Common Mistakes

❌ Missing break in switch

❌ Wrong logical operators

❌ Using = instead of ==

❌ Deep nested if

---

# Key Points

if checks one condition.

if-else checks two possibilities.

else-if checks multiple conditions.

switch is cleaner for fixed choices.

Ternary is shorthand for if-else.