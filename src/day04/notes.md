# Day 04 - Loops in Java

## 📚 Topics Covered

- for Loop
- while Loop
- do-while Loop
- break Statement
- continue Statement
- Nested Loops
- Pattern Printing

---

# 1. for Loop

## Definition

The `for` loop is used when the number of iterations is known.

## Syntax

```java
for(initialization; condition; increment/decrement) {
    // code
}
```

## Example

```java
for(int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

## Output

```
1
2
3
4
5
```

---

# 2. while Loop

## Definition

The `while` loop checks the condition first. If the condition is true, the loop executes.

## Syntax

```java
while(condition) {
    // code
}
```

## Example

```java
int i = 1;

while(i <= 5) {
    System.out.println(i);
    i++;
}
```

---

# 3. do-while Loop

## Definition

The `do-while` loop executes the code at least once before checking the condition.

## Syntax

```java
do {
    // code
} while(condition);
```

## Example

```java
int i = 1;

do {
    System.out.println(i);
    i++;
} while(i <= 5);
```

---

# Difference Between while and do-while

| while | do-while |
|--------|-----------|
| Checks condition first | Executes first |
| May execute zero times | Executes at least one time |

---

# 4. break Statement

## Definition

The `break` statement immediately terminates the loop.

## Example

```java
for(int i = 1; i <= 10; i++) {

    if(i == 5) {
        break;
    }

    System.out.println(i);
}
```

## Output

```
1
2
3
4
```

---

# 5. continue Statement

## Definition

The `continue` statement skips the current iteration and moves to the next iteration.

## Example

```java
for(int i = 1; i <= 5; i++) {

    if(i == 3) {
        continue;
    }

    System.out.println(i);
}
```

## Output

```
1
2
4
5
```

---

# 6. Nested Loop

## Definition

A loop inside another loop is called a Nested Loop.

## Syntax

```java
for(...) {

    for(...) {

    }

}
```

## Rule

- Outer Loop → Rows
- Inner Loop → Columns

---

# 7. Pattern Printing

## Square Pattern

```
*****
*****
*****
```

Formula

- Rows = Fixed
- Columns = Fixed

---

## Left Triangle

```
*
**
***
****
*****
```

Formula

- Stars = Current Row

---

## Inverted Triangle

```
*****
****
***
**
*
```

Formula

- Rows = Reverse
- Stars = Current Row

---

## Right Aligned Triangle

```
    *
   **
  ***
 ****
*****
```

Formula

- Spaces = Total Rows - Current Row
- Stars = Current Row

---

## Right Inverted Triangle

```
*****
 ****
  ***
   **
    *
```

Formula

- Rows = Reverse
- Spaces = Total Rows - Current Row
- Stars = Current Row

---

# Key Points

- Always use `{}` with loops.
- Dry run the code before executing.
- `break` stops the loop.
- `continue` skips the current iteration.
- Pattern printing is based on Rows and Columns.
- Practice is the key to mastering loops.