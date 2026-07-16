# Day 05 Interview Questions

## 1. What is an Array?

An array is a collection of elements of the same data type stored in contiguous memory locations.

---

## 2. Why do we use Arrays?

To store multiple values of the same data type using a single variable.

---

## 3. What is Array Index?

The position of an element inside an array.

Index always starts from 0.

---

## 4. What is the last index of an array?

Last Index = length - 1

---

## 5. Difference between length and last index?

length = Total number of elements

Last Index = length - 1

---

## 6. What is ArrayIndexOutOfBoundsException?

It occurs when we try to access an index that does not exist.

Example:

```java
arr[5];
```

when array size is 5.

---

## 7. How do you traverse an array?

Using loops.

```java
for(int i=0;i<arr.length;i++)
```

---

## 8. How do you find the largest element?

Initialize largest with first element.

Compare every remaining element.

Update largest whenever a bigger value is found.

---

## 9. How do you find the smallest element?

Initialize smallest with first element.

Compare every remaining element.

Update smallest whenever a smaller value is found.

---

## 10. What is Linear Search?

Linear Search compares each element one by one until the required element is found.

Time Complexity: O(n)

---

## 11. Difference between Reverse Traversal and Reverse Array?

Reverse Traversal:

Only prints elements in reverse order.

Reverse Array:

Actually changes the order of elements in memory.

---

## 12. Can an array store different data types?

No.

An array can store only one type of data.