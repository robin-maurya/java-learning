# Day 06 - Methods

## What is a Method?

A method is a block of code that performs a specific task.

Methods help in:

- Code Reusability
- Better Readability
- Reducing Code Duplication
- Easier Maintenance

---

## Method Syntax

```java
returnType methodName(parameters){

}
```

Example

```java
static void greet(){

}
```

---

## Parts of a Method

- Access Modifier
- static
- Return Type
- Method Name
- Parameters
- Method Body

Example

```java
static int add(int a,int b){
    return a+b;
}
```

---

## Method Call

```java
greet();
```

Calls the method.

---

## Parameters

Variables declared inside the method definition.

Example

```java
String name
```

---

## Arguments

Actual values passed during method call.

Example

```java
greet("Robin");
```

"Robin" is an argument.

---

## Return Type

Methods can return values.

Example

```java
return a+b;
```

---

## void Method

Returns nothing.

```java
static void display(){

}
```

---

## Return Method

Returns a value.

```java
static int add(int a,int b){
    return a+b;
}
```

---

## Method Overloading

Same method name but different parameters.

Example

```java
add(int,int)

add(int,int,int)
```

---

## Rules of Method Overloading

✔ Method name must be same

✔ Parameters must be different

❌ Return type alone cannot overload methods

---

## Benefits of Methods

- Reusability
- Clean Code
- Easy Debugging
- Better Maintenance