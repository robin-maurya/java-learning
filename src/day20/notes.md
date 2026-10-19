# Day 20 — Java Stream API Advanced Operations

## 1. `sorted()`

Sorts Stream elements into natural order by default.

```java
List<Integer> numbers = List.of(45, 12, 78, 23);

numbers.stream()
       .sorted()
       .forEach(System.out::println);
```

Output: `12, 23, 45, 78`

Descending order:

```java
numbers.stream()
       .sorted(Comparator.reverseOrder())
       .forEach(System.out::println);
```

## 2. `distinct()`

Removes duplicate elements from a Stream. For an ordered Stream, the first occurrence order is preserved.

```java
List<Integer> numbers = List.of(10, 20, 10, 30);

numbers.stream()
       .distinct()
       .forEach(System.out::println);
```

Output: `10, 20, 30`

## 3. `limit()`

Keeps at most the first `n` elements.

```java
numbers.stream()
       .limit(2)
       .forEach(System.out::println);
```

## 4. `skip()`

Skips the first `n` elements.

```java
numbers.stream()
       .skip(2)
       .forEach(System.out::println);
```

Both operations are useful for processing portions of ordered data.

## 5. `reduce()`

Combines Stream elements into a single result.

```java
List<Integer> numbers = List.of(5, 10, 15, 20, 25);

int sum = numbers.stream()
        .reduce(0, (a, b) -> a + b);

System.out.println("Sum: " + sum);
```

Output: `Sum: 75`

- `0` is the identity value.
- `a` is the accumulated result.
- `b` is the current element.
- `(a, b) -> a + b` combines them.

For addition, zero is the identity because adding zero does not change the result.

## 6. `min()` and `max()`

Find the minimum and maximum element using a comparator.

```java
int min = numbers.stream()
        .min(Comparator.naturalOrder())
        .orElseThrow();

int max = numbers.stream()
        .max(Comparator.naturalOrder())
        .orElseThrow();
```

Both methods return `Optional<T>`, because a Stream may be empty. `orElseThrow()` returns the value or throws an exception if it is absent.

## 7. Intermediate and Terminal Operations

**Intermediate operations:** `sorted()`, `distinct()`, `limit()`, `skip()`

They return another Stream and are generally lazy.

**Terminal operations:** `reduce()`, `min()`, `max()`, `forEach()`

They produce a result or perform an action, triggering Stream processing.

## 8. Important Points

- Stream operations do not normally modify the original collection.
- A Stream cannot be reused after a terminal operation.
- `sorted()` uses natural ordering unless a comparator is supplied.
- `distinct()` relies on equality semantics (`equals()` and `hashCode()`).
- `limit()` and `skip()` operate on encounter order for ordered streams.
- `reduce()` is useful for combining values, but mutable reduction into containers is generally better handled by `collect()`.
- `min()` and `max()` return Optional values, not raw elements.
