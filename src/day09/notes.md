# Day 09 - Encapsulation & Access Modifiers

## Topics Covered

- Access Modifiers
- Encapsulation
- Getter
- Setter

---

## Access Modifiers

### public

Accessible from anywhere.

```java
public String name;
```

### private

Accessible only inside the same class.

```java
private String name;
```

### default

Accessible only within the same package.

```java
String name;
```

---

## Encapsulation

Encapsulation means hiding data and providing controlled access using getter and setter methods.

Benefits:

- Data Security
- Better Code Maintenance
- Controlled Access

---

## Getter

Used to return the value.

Example:

```java
public String getName() {
    return name;
}
```

---

## Setter

Used to set the value.

Example:

```java
public void setName(String name) {
    this.name = name;
}
```

---

## Key Points

- private variables cannot be accessed directly.
- Getter returns value.
- Setter updates value.
- Encapsulation follows Data Hiding.