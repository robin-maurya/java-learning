# Day 08 Interview Questions

## 1. What is OOP?

Object-Oriented Programming is a programming paradigm that organizes code using objects and classes.

---

## 2. What is a Class?

A class is a blueprint used to create objects.

---

## 3. What is an Object?

An object is an instance of a class.

Example:

```java
Student s1 = new Student();
```

---

## 4. What are Instance Variables?

Variables declared inside a class but outside methods.

Example:

```java
String name;
int age;
```

---

## 5. What is a Constructor?

A special method automatically called when an object is created.

---

## 6. Why do we use Constructors?

- Initialize objects
- Assign default values
- Assign user-defined values

---

## 7. Can Constructors have Parameters?

Yes.

Example:

```java
Student(String name, int age)
```

---

## 8. Can Constructors have Return Type?

No.

---

## 9. Difference between Constructor and Method?

| Constructor | Method |
|-------------|--------|
| Same name as class | Any valid name |
| No return type | Return type required |
| Called automatically | Called manually |
| Initializes object | Performs tasks |

---

## 10. What is the 'new' Keyword?

Creates an object in memory and calls the constructor automatically.

Example:

```java
Student s1 = new Student();
```

---

## 11. What is a Parameterized Constructor?

A constructor that accepts parameters during object creation.

Example:

```java
Student s1 = new Student("Robin",25);
```

---

## 12. Can a Class have Multiple Objects?

Yes.

Example:

```java
Student s1 = new Student();
Student s2 = new Student();
```

---

## 13. Do Multiple Objects Share Data?

No.

Every object has its own copy of instance variables.

---

## 14. What is the Difference Between Class and Object?

Class → Blueprint

Object → Real instance created from the blueprint.

---

## 15. Most Asked Programs

- Student Class
- Employee Class
- Car Class
- Constructor Example
- Parameterized Constructor
- Display Method
- Multiple Objects Example