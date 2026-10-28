package day23.practice;

import java.time.Duration;
import java.time.LocalTime;

public class Practice2MeetingDuration {

    public static void main(String[] args) {

        LocalTime startMeetingTime = LocalTime.of(10, 15);
        LocalTime endMeetingTime = LocalTime.of(12, 45);

        Duration duration = Duration.between(startMeetingTime, endMeetingTime);

        System.out.println("Meeting Duration in Hours: " +duration.toHours());
        System.out.println("Meeting Duration in Minutes: " +duration.toMinutes());
        System.out.println("Meeting Duration in Seconds: " +duration.toSeconds());
    }
}