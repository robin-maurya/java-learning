# Day 20 — Stream API Advanced Interview Questions

## Q1. What does `sorted()` do?

It sorts Stream elements in natural order by default. A Comparator can specify a different order.

## Q2. How can you sort numbers in descending order?

```java
numbers.stream()
       .sorted(Comparator.reverseOrder())
       .forEach(System.out::println);
```

## Q3. What does `distinct()` do?

It removes duplicate elements according to their equality semantics. In an ordered Stream, it preserves the first occurrence order.

## Q4. What is the difference between `limit()` and `skip()`?

`limit(n)` keeps at most the first `n` elements. `skip(n)` discards the first `n` elements.

## Q5. What is `reduce()`?

It combines Stream elements into one result, such as a sum or product.

## Q6. What does the identity value mean in `reduce()`?

It is the starting value for reduction. For addition, `0` is the identity; for multiplication, `1` is the identity.

## Q7. What is the output of this code?

```java
List.of(1, 2, 3, 4).stream()
        .filter(n -> n % 2 == 0)
        .map(n -> n * 2)
        .reduce(0, Integer::sum);
```

**Answer:** `12`, because the even numbers are `2` and `4`, which become `4` and `8`, and their sum is `12`.

## Q8. What do `min()` and `max()` return?

They return `Optional<T>`, because the Stream might be empty.

## Q9. Why is `orElseThrow()` used with `min()` and `max()`?

It extracts the value when present and throws an exception when the Optional is empty.

## Q10. Can a Stream be reused after `max()`?

No. A terminal operation consumes the Stream. Create a new Stream from the source for another operation.

## Q11. Do Stream operations change the original List?

Normally, no. Stream pipelines process data without changing the source collection, unless explicit side effects modify it.

## Q12. What is the difference between `reduce()` and `collect()`?

`reduce()` is designed to combine elements into a single result. `collect()` is designed for mutable reduction, such as accumulating elements into a List or grouping them into a Map.

## Q13. Are `sorted()` and `distinct()` intermediate or terminal operations?

Both are intermediate operations.

## Q14. Are `min()` and `max()` intermediate or terminal operations?

Both are terminal operations.

## Q15. How would you find the sum, minimum, and maximum of a list?

Use `reduce()` for the sum and `min()`/`max()` with a Comparator for the minimum and maximum. Each terminal operation requires a fresh Stream.
