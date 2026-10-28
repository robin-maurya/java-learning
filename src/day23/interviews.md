# Day 23 — Java Date and Time API Interview Questions

## Q1. What is the Java Date and Time API?

It is the modern API introduced in Java 8 under the `java.time` package to work with dates, times, formatting, and time differences.

## Q2. What is the difference between LocalDate, LocalTime, and LocalDateTime?

- `LocalDate`: date only.
- `LocalTime`: time only.
- `LocalDateTime`: date and time without a time zone.

## Q3. How do you get the current date?

```java
LocalDate today = LocalDate.now();
```

## Q4. How do you create a custom date?

```java
LocalDate date = LocalDate.of(2026, 10, 29);
```

Month values range from 1 to 12.

## Q5. What is DateTimeFormatter?

It formats date-time values into strings and parses strings into date-time values.

## Q6. What is the difference between MM and mm?

- `MM`: month.
- `mm`: minutes.

## Q7. What is Period?

`Period` represents a calendar-based difference between dates in years, months, and days.

## Q8. What is Duration?

`Duration` represents a time-based amount or difference, commonly measured in seconds and nanoseconds, with convenience methods for hours and minutes.

## Q9. What is the difference between Period and Duration?

`Period` is calendar-based, while `Duration` measures elapsed time.

## Q10. How do you calculate the difference between two dates?

```java
Period difference = Period.between(startDate, endDate);
```

## Q11. How do you calculate the difference between two times?

```java
Duration difference = Duration.between(startTime, endTime);
```

## Q12. What does Period.getMonths() return?

It returns the month component remaining after the years component, not the total number of months. Use `toTotalMonths()` for total months.

## Q13. Are LocalDate and LocalTime mutable?

No. They are immutable. Methods such as `plusDays()` return new objects.

## Q14. How do you compare two dates?

Use `isBefore()`, `isAfter()`, and `isEqual()`.

## Q15. Does LocalDateTime contain time-zone information?

No. Use `ZonedDateTime` or `OffsetDateTime` when time-zone or UTC-offset information is required.
