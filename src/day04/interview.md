# Day 04 - Interview Questions

## 1. What is a loop?

A loop is used to execute a block of code repeatedly until a condition becomes false.

---

## 2. What are the types of loops in Java?

- for loop
- while loop
- do-while loop

---

## 3. When should we use a for loop?

Use a for loop when the number of iterations is known.

---

## 4. When should we use a while loop?

Use a while loop when the number of iterations is unknown.

---

## 5. What is a do-while loop?

A do-while loop executes the code first and checks the condition later. Therefore, it always executes at least once.

---

## 6. Difference between while and do-while?

| while | do-while |
|--------|-----------|
| Checks condition first | Executes first |
| May execute zero times | Executes at least one time |

---

## 7. What is the break statement?

The break statement immediately terminates the loop or switch statement.

---

## 8. What is the continue statement?

The continue statement skips the current iteration and continues with the next iteration.

---

## 9. Difference between break and continue?

| break | continue |
|--------|-----------|
| Stops the loop completely | Skips only the current iteration |
| Exits the loop | Continues with the next iteration |

---

## 10. What is a Nested Loop?

A loop inside another loop is called a Nested Loop.

---

## 11. Which loop controls rows?

The Outer Loop controls the rows.

---

## 12. Which loop controls columns?

The Inner Loop controls the columns.

---

## 13. Why do we use Nested Loops?

Nested loops are mainly used for:

- Pattern Printing
- Matrix Operations
- Table Generation

---

## 14. Difference between print() and println()?

| print() | println() |
|----------|------------|
| Prints on the same line | Prints on the next line |

---

## 15. What is Pattern Printing?

Pattern printing is a programming exercise that uses nested loops to print different shapes like triangles, squares, and pyramids. It helps improve logical thinking and loop understanding.

---

## 16. What is an Infinite Loop?

An infinite loop is a loop that never becomes false, so it keeps executing forever.

Example:

```java
while(true) {
    System.out.println("Hello");
}
```

---

## 17. What is Dry Run?

Dry run means executing the code step-by-step manually without running the program. It helps understand the program flow and identify logical errors.

---

## 18. What are common mistakes while using loops?

- Wrong loop condition
- Missing increment/decrement
- Infinite loop
- Off-by-one errors
- Missing braces `{}`

---

## 19. Can break and continue be used in all loops?

Yes. Both `break` and `continue` can be used with:

- for loop
- while loop
- do-while loop

---

## 20. Real Interview Tip

Remember these rules:

- `for` → Known number of iterations
- `while` → Unknown number of iterations
- `do-while` → Executes at least once
- `break` → Stops the loop
- `continue` → Skips the current iteration
- Outer Loop → Rows
- Inner Loop → Columns