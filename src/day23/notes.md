# Day 23 — Java Date and Time API

## 1. Introduction

Java 8 introduced the Date and Time API in the `java.time` package. It provides classes to handle dates, times, formatting, and time differences.

## 2. LocalDate

`LocalDate` represents a date without time.

```java
LocalDate today = LocalDate.now();
LocalDate joiningDate = LocalDate.of(2020, 8, 17);
```

Useful methods:
- `now()` — gets the current date.
- `of(year, month, day)` — creates a specific date.
- `getYear()` — returns the year.
- `getMonthValue()` — returns the month number (1–12).
- `getDayOfMonth()` — returns the day.
- `isBefore()`, `isAfter()`, `isEqual()` — compare dates.
- `plusDays()`, `minusMonths()` — perform date arithmetic.

## 3. LocalTime

`LocalTime` represents time without a date.

```java
LocalTime now = LocalTime.now();
LocalTime meeting = LocalTime.of(15, 30);
```

Useful methods:
- `getHour()`
- `getMinute()`
- `getSecond()`

## 4. LocalDateTime

`LocalDateTime` represents a date and time without a time zone.

```java
LocalDateTime now = LocalDateTime.now();
LocalDateTime meeting = LocalDateTime.of(2026, 10, 29, 10, 30);
```

## 5. DateTimeFormatter

Used to format dates and times into readable strings.

```java
DateTimeFormatter formatter =
        DateTimeFormatter.ofPattern("dd/MM/yyyy");

String formatted = date.format(formatter);
```

Common patterns:
- `dd` — day
- `MM` — month number
- `MMM` — short month name
- `MMMM` — full month name
- `yyyy` — year
- `HH` — hour in 24-hour format
- `mm` — minutes
- `ss` — seconds

Remember: `MM` means month, while `mm` means minutes.

## 6. Period

`Period` calculates a calendar-based difference between dates in years, months, and days.

```java
Period difference = Period.between(startDate, endDate);

difference.getYears();
difference.getMonths();
difference.getDays();
difference.toTotalMonths();
```

`getMonths()` returns the remaining months after the year component; `toTotalMonths()` returns the total months.

## 7. Duration

`Duration` calculates a time-based difference, commonly in hours, minutes, and seconds.

```java
Duration duration = Duration.between(startTime, endTime);

duration.toHours();
duration.toMinutes();
duration.toSeconds();
```

`toHours()` returns whole hours; `toMinutes()` returns total minutes.

## 8. Period vs Duration

| Period | Duration |
|---|---|
| Calendar-based date difference | Time-based difference |
| Years, months, days | Hours, minutes, seconds |
| Commonly used with `LocalDate` | Commonly used with `LocalTime` |

## 9. Important concept: Immutability

Classes such as `LocalDate`, `LocalTime`, and `LocalDateTime` are immutable. Operations like `plusDays()` return a new object instead of modifying the original.

```java
LocalDate date = LocalDate.of(2026, 10, 29);
LocalDate updatedDate = date.plusDays(10);
```

The original `date` remains unchanged.

## 10. Best practices

- Prefer the modern `java.time` API over legacy `Date` and `Calendar` for new code.
- Use `LocalDate` for dates, `LocalTime` for times, and `LocalDateTime` for date-time values without a time zone.
- Use `ZonedDateTime` or `OffsetDateTime` when time-zone or offset information matters.
- Use `DateTimeFormatter` for formatting and parsing.
- Remember that `Period` and `Duration` serve different purposes.
