# Day 22 — Java Optional Interview Questions

## Q1. What is Optional in Java?

Optional is a container that may hold a non-null value or be empty. It helps communicate that a result may be missing.

## Q2. Difference between of() and ofNullable()?

`Optional.of(null)` throws `NullPointerException`, while `Optional.ofNullable(null)` returns `Optional.empty()`.

## Q3. What does Optional.empty() do?

It creates an Optional that contains no value.

## Q4. Difference between isPresent() and isEmpty()?

`isPresent()` returns true when a value exists. `isEmpty()` returns true when no value exists.

## Q5. What happens when get() is called on an empty Optional?

It throws `NoSuchElementException`.

## Q6. Difference between orElse() and orElseGet()?

`orElse()` evaluates its fallback expression eagerly. `orElseGet()` invokes its Supplier only when the Optional is empty.

## Q7. What does orElseThrow() do?

It returns the value if present; otherwise, it throws an exception.

## Q8. What is map() in Optional?

`map()` transforms a value when present and wraps the result in another Optional. It can also change the Optional's generic type.

## Q9. What is filter() in Optional?

`filter()` retains the value if the predicate is true. Otherwise, it returns an empty Optional.

## Q10. Does map() execute on an empty Optional?

No. Its mapping function is not invoked when the Optional is empty.

## Q11. What is ifPresent()?

It executes the supplied action only when a value is present.

## Q12. What is ifPresentOrElse()?

It executes one action when a value is present and another when it is absent.

## Q13. Can Optional contain null?

A non-empty Optional created through the standard factory methods contains a non-null value. Use `ofNullable()` to convert a possibly null reference into a present or empty Optional.

## Q14. Should Optional be used everywhere instead of null?

No. Use it where it makes absence explicit, especially in method return types. Avoid unnecessary wrapping and overcomplicated chains.

## Q15. What is a common Optional chaining pattern?

```java
String result = Optional.ofNullable(name)
        .filter(value -> value.length() > 3)
        .map(String::toUpperCase)
        .orElse("Invalid");
```

It safely handles a possibly null name, filters by length, transforms the value, and provides a fallback.
