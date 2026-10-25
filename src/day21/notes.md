
# Day 21 — Java Collectors

## 1. What is Collectors?

`Collectors` is a utility class in `java.util.stream` used with the Stream API to collect stream elements into collections or summarize data.

Import:
```java
import java.util.stream.Collectors;
```

Common methods:
- `Collectors.toList()`
- `Collectors.toSet()`
- `Collectors.toMap()`
- `Collectors.groupingBy()`
- `Collectors.partitioningBy()`

## 2. Collectors.toList()

Collects stream elements into a List.

Example:
```java
List<Integer> evenNumbers = numbers.stream()
        .filter(number -> number % 2 == 0)
        .collect(Collectors.toList());
```

Use when you want to store filtered or transformed stream results in a List.

## 3. Collectors.toSet()

Collects stream elements into a Set. Duplicate elements are removed.

Example:
```java
Set<Integer> uniqueNumbers = numbers.stream()
        .collect(Collectors.toSet());
```

Important:
- Duplicate elements are removed.
- Do not rely on the iteration order of the resulting Set.
- Use when unique values are required.

## 4. Collectors.toMap()

Collects elements into a Map using a key mapper and a value mapper.

Example:
```java
Map<String, Integer> nameLengths = names.stream()
        .collect(Collectors.toMap(
                name -> name,
                name -> name.length()
        ));
```

Here:
- `name -> name` creates the key.
- `name -> name.length()` creates the value.

Important:
- Keys must be unique when using the two-argument `toMap()`.
- Duplicate keys cause `IllegalStateException`.
- A merge function can be supplied when duplicate keys need handling.

## 5. Collectors.groupingBy()

Groups elements according to a classification function.

Example:
```java
Map<Character, List<String>> groupedNames = names.stream()
        .collect(Collectors.groupingBy(
                name -> name.charAt(0)
        ));
```

Names beginning with the same character are placed in the same group.

Use when data needs to be divided into multiple groups based on a property.

## 6. Collectors.partitioningBy()

Partitions elements into two groups based on a predicate: `true` and `false`.

Example:
```java
Map<Boolean, List<Integer>> result = numbers.stream()
        .collect(Collectors.partitioningBy(
                number -> number % 2 == 0
        ));

System.out.println("Even: " + result.get(true));
System.out.println("Odd: " + result.get(false));
```

- `true`: numbers satisfying the condition.
- `false`: numbers not satisfying the condition.

Both Boolean keys are present in the result, even if one group is empty.

## 7. groupingBy() vs partitioningBy()

| groupingBy() | partitioningBy() |
|---|---|
| Creates groups based on a classifier | Creates two Boolean partitions |
| Can create multiple groups | Always has `true` and `false` groups |
| Example: group names by first letter | Example: divide numbers into even and odd |

## 8. Quick Revision

- `toList()` — collect into a List.
- `toSet()` — collect unique elements into a Set.
- `toMap()` — collect elements as key-value pairs.
- `groupingBy()` — group elements by a classification rule.
- `partitioningBy()` — divide elements according to a true/false condition.

## 9. Stream Collection Flow

Source → `stream()` → intermediate operations such as `filter()` or `map()` → `collect()` → result collection.
