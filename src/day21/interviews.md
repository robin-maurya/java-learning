
# Day 21 — Java Collectors Interview Questions

## Q1. What is the Collectors class?

**Answer:** `Collectors` is a utility class in `java.util.stream` that provides collector implementations for operations such as collecting elements into Lists, Sets, and Maps, grouping data, and partitioning data.

## Q2. What is the difference between `collect()` and `Collectors`?

**Answer:**
- `collect()` is a terminal operation of the Stream API.
- `Collectors` is a utility class that provides ready-made collectors passed to `collect()`.

Example:
```java
List<String> result = names.stream()
        .collect(Collectors.toList());
```

## Q3. What is the difference between `toList()` and `toSet()`?

**Answer:**
- `toList()` collects elements into a List and preserves duplicate elements.
- `toSet()` collects elements into a Set, removing duplicates.
- Do not rely on the iteration order of a Set returned by `toSet()`.

## Q4. How does `Collectors.toMap()` work?

**Answer:** It uses a key-mapping function and a value-mapping function to create a Map.

```java
Map<String, Integer> result = names.stream()
        .collect(Collectors.toMap(
                name -> name,
                name -> name.length()
        ));
```

## Q5. What happens if `toMap()` encounters duplicate keys?

**Answer:** The two-argument `Collectors.toMap()` throws `IllegalStateException` when multiple elements produce the same key. A merge function can be supplied to resolve duplicate keys.

Example:
```java
Map<Integer, String> result = names.stream()
        .collect(Collectors.toMap(
                String::length,
                name -> name,
                (existing, replacement) -> existing
        ));
```

## Q6. What is `groupingBy()`?

**Answer:** `groupingBy()` groups stream elements according to a classification function and returns a Map.

Example:
```java
Map<Character, List<String>> result = names.stream()
        .collect(Collectors.groupingBy(
                name -> name.charAt(0)
        ));
```

## Q7. What is `partitioningBy()`?

**Answer:** `partitioningBy()` divides elements into two groups based on a predicate and returns a `Map<Boolean, List<T>>` when using the default downstream collector.

## Q8. What is the difference between `groupingBy()` and `partitioningBy()`?

**Answer:**
- `groupingBy()` can create multiple groups based on a classifier.
- `partitioningBy()` divides elements into two Boolean groups: `true` and `false`.

## Q9. Can `partitioningBy()` return an empty group?

**Answer:** Yes. Both Boolean keys are present in the resulting Map, and one group may contain an empty List if no elements satisfy its condition.

## Q10. What is a downstream collector?

**Answer:** A downstream collector performs another collection operation inside a group, such as counting elements or collecting grouped elements into a Set.

Example:
```java
Map<Character, Long> counts = names.stream()
        .collect(Collectors.groupingBy(
                name -> name.charAt(0),
                Collectors.counting()
        ));
```

## Q11. Is `collect()` a terminal operation?

**Answer:** Yes. `collect()` is a terminal operation that consumes the stream and produces a result.

## Q12. Can a Stream be reused after `collect()`?

**Answer:** No. A Stream cannot be reused after a terminal operation. Create a new Stream from the source if another pipeline is needed.
