# Day 07 - Strings

## Topics Covered

- String Introduction
- String Declaration
- String length()
- String charAt()
- String equals()
- String equalsIgnoreCase()
- String toUpperCase()
- String toLowerCase()
- String contains()
- String substring()

---

## Important Points

### String

- String is a sequence of characters.
- String values are written inside double quotes ("").

Example:

String name = "Robin";

---

### length()

Returns the total number of characters.

Example:

name.length();

---

### charAt()

Returns character at a given index.

Example:

name.charAt(0);

---

### equals()

Compares two Strings (case-sensitive).

Example:

name.equals("Robin");

---

### equalsIgnoreCase()

Compares two Strings without considering uppercase/lowercase.

Example:

name.equalsIgnoreCase("robin");

---

### toUpperCase()

Converts all characters to uppercase.

Example:

name.toUpperCase();

---

### toLowerCase()

Converts all characters to lowercase.

Example:

name.toLowerCase();

---

### contains()

Checks whether a String contains another String.

Returns true or false.

Example:

name.contains("Rob");

---

### substring()

Extracts part of a String.

Example:

name.substring(1);

or

name.substring(0,3);

---

## Important Rules

- String is immutable.
- String uses length().
- Arrays use length.
- Index starts from 0.
- charAt() returns a character.
- substring(start,end)
    - Start index Included
    - End index Excluded