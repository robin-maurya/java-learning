# Day 14 – Java Collections Framework

## 1. Collection Framework
The Java Collection Framework provides interfaces and classes to store and manage groups of objects.

Main interfaces:
- List
- Set
- Queue
- Map

> Map is a separate interface hierarchy from Collection.

## 2. ArrayList
ArrayList is a resizable array.

Features:
- Maintains insertion order
- Allows duplicate elements
- Allows index-based access

Common methods:
```java
numbers.add(10);
numbers.get(0);
numbers.set(1, 30);
numbers.remove(0);
numbers.size();
```

## 3. LinkedList
LinkedList stores elements as linked nodes.

Useful methods:
```java
list.addFirst(value);
list.addLast(value);
list.getFirst();
list.getLast();
list.removeFirst();
list.removeLast();
```

## 4. Set

A Set stores unique elements.

### HashSet
- Does not allow duplicates
- Does not guarantee ordering
- Commonly provides fast basic operations

### TreeSet
- Does not allow duplicates
- Maintains elements in sorted order

Useful methods:
```java
numbers.first();
numbers.last();
numbers.remove(30);
```

## 5. Map and HashMap

A Map stores data as key-value pairs.

```java
HashMap<String, Integer> students = new HashMap<>();

students.put("Robin", 85);
students.put("Aman", 90);
students.get("Robin");
students.put("Robin", 95);
students.remove("Aman");
students.containsKey("Robin");
students.size();
```

Important:
- Keys are unique.
- Values can be duplicated.
- Map is not a subtype of Collection.

Iteration:
```java
for (String name : students.keySet()) {
    System.out.println(name + " : " + students.get(name));
}
```

## 6. Iterator

Iterator is used to traverse a collection.

```java
Iterator<Integer> iterator = numbers.iterator();

while (iterator.hasNext()) {
    int number = iterator.next();

    if (number == 30) {
        iterator.remove();
    }
}
```

Use iterator.remove() when removing the current element during iterator traversal.

## 7. Comparable

Comparable is used to define natural ordering of objects.

It uses:
```java
compareTo()
```

Example:
```java
class Employee implements Comparable<Employee> {
    int salary;

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.salary, other.salary);
    }
}
```

Sort:
```java
Collections.sort(employees);
```

## 8. Comparator

Comparator is used for custom sorting.

Example: salary descending:
```java
employees.sort(
    Comparator.comparingInt((Employee e) -> e.salary).reversed()
);
```

### Comparable vs Comparator

| Comparable | Comparator |
|---|---|
| Natural ordering | Custom ordering |
| compareTo() | Comparator-based comparison |
| Implemented by the class | Separate sorting logic |
| Example: salary ascending | Example: salary descending |

## 9. Collection vs Collections

### Collection
Collection is an interface and a root interface for major collection types such as List, Set and Queue.

### Collections
Collections is a utility class containing methods for working with collections.

Example:
```java
Collections.sort(employees);
```

## 10. Important Methods

ArrayList: add(), get(), set(), remove(), size()

LinkedList: addFirst(), addLast(), getFirst(), getLast(), removeFirst(), removeLast()

HashSet: add(), remove(), contains()

TreeSet: add(), remove(), contains(), first(), last()

HashMap: put(), get(), remove(), containsKey(), size(), keySet()

Iterator: hasNext(), next(), remove()

## Day 14 Summary
- List → ordered, duplicates allowed
- Set → unique elements
- HashSet → unique, no guaranteed order
- TreeSet → unique, sorted
- Map → key-value pairs
- HashMap → key-value storage
- Iterator → traversal and current-element removal
- Comparable → natural ordering
- Comparator → custom ordering
- Collection → interface
- Collections → utility class
