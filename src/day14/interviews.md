# Day 14 – Java Collections Interview Questions

## 1. What is the Java Collection Framework?
The Java Collection Framework is a set of interfaces and classes used to store and manipulate groups of objects.

## 2. Array vs ArrayList?
Array has fixed size. ArrayList is resizable and provides collection methods.

## 3. List vs Set?
List maintains order and allows duplicates. Set stores unique elements.

## 4. What is HashSet?
HashSet is a Set implementation that stores unique elements and does not guarantee insertion order.

## 5. Why does HashSet not store duplicates?
A Set is designed to contain unique elements. HashSet uses hashing to determine whether an equivalent element is already present.

## 6. HashSet vs TreeSet?
HashSet does not guarantee sorted order. TreeSet maintains sorted order. TreeSet's sorting maintenance can make typical operations slower than HashSet.

## 7. What is a Map?
A Map stores data as key-value pairs. Keys are unique; values can be duplicated.

## 8. Is Map a child interface of Collection?
No. Map is a separate interface hierarchy.

## 9. What is HashMap?
HashMap is a Map implementation used to store key-value pairs.

## 10. Can HashMap have duplicate keys?
No. If the same key is inserted again, its old value is replaced.

## 11. Can HashMap have duplicate values?
Yes. Different keys can have the same value.

## 12. How do you update a HashMap value?
Use put() with the existing key:
```java
students.put("Raj", 95);
```

## 13. How do you check whether a key exists?
```java
students.containsKey("Robin");
```

## 14. How do you iterate through HashMap keys?
```java
for (String name : students.keySet()) {
    System.out.println(name);
}
```

## 15. What is Iterator?
Iterator is used to traverse collection elements one by one.

Important methods:
- hasNext()
- next()
- remove()

## 16. Why use iterator.remove()?
When removing the current element while traversing with an Iterator, iterator.remove() is the appropriate removal method.

## 17. What is Comparable?
Comparable defines the natural ordering of objects and uses compareTo().

## 18. What is Comparator?
Comparator provides custom sorting logic.

## 19. Comparable vs Comparator?
Comparable is used for natural ordering through compareTo(). Comparator provides custom ordering separately and is useful when different sorting orders are needed.

## 20. Collection vs Collections?
Collection is an interface. Collections is a utility class with methods such as Collections.sort().

## 21. HashSet vs TreeSet?
HashSet: unique elements, no guaranteed ordering.
TreeSet: unique elements, sorted ordering.

## 22. What happens with remove(3) on HashMap<String, Integer>?
If the keys are Strings, remove(3) does not remove a String key. For example:
```java
students.remove("Aman");
```
removes the Aman entry.

# Quick Revision

| Topic | Key Point |
|---|---|
| ArrayList | Resizable ordered list |
| LinkedList | Linked list with first/last operations |
| HashSet | Unique, no guaranteed order |
| TreeSet | Unique + sorted |
| HashMap | Key-value pairs |
| Iterator | Traverse/remove current element |
| Comparable | Natural ordering |
| Comparator | Custom ordering |
| Collection | Interface |
| Collections | Utility class |
