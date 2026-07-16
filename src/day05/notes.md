# Day 05 - Arrays

## What is an Array?

An array is a collection of elements of the same data type stored in contiguous memory locations.

Example:

```java
int[] numbers = {10,20,30,40,50};
```

---

## Why do we use Arrays?

- Store multiple values of the same type.
- Easy traversal using loops.
- Reduces repetitive code.
- Faster access using index.

---

## Array Declaration

```java
int[] numbers;
```

---

## Array Initialization

```java
numbers = new int[5];
```

or

```java
int[] numbers = {10,20,30,40,50};
```

---

## Array Index

Array indexing starts from 0.

Example

| Index | Value |
|------:|------:|
|0|10|
|1|20|
|2|30|
|3|40|
|4|50|

---

## Array Length

```java
numbers.length
```

Returns total number of elements.

---

## Traversing an Array

```java
for(int i=0;i<numbers.length;i++){
    System.out.println(numbers[i]);
}
```

---

## Sum of Array

```java
sum = sum + numbers[i];
```

---

## Largest Element

```java
if(numbers[i] > largest){
    largest = numbers[i];
}
```

---

## Smallest Element

```java
if(numbers[i] < smallest){
    smallest = numbers[i];
}
```

---

## Average of Array

```java
average = sum / numbers.length;
```

---

## Linear Search

Compare every element with the search value.

```java
if(numbers[i] == search)
```

---

## Reverse Traversal

```java
for(int i = numbers.length-1; i>=0; i--){
    System.out.println(numbers[i]);
}
```

---

## Important Points

- Index starts from 0.
- Last Index = length - 1.
- Arrays store same data type.
- Array size cannot be changed after creation.
- Accessing invalid index throws ArrayIndexOutOfBoundsException.