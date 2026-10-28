package day23.concepts;

import java.time.LocalTime;

public class LocalTimeExample {

    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();

        LocalTime officeTime = LocalTime.of(11, 0);

        LocalTime meetingTime = LocalTime.of(15, 30, 45);

        System.out.println("Current Time: " +currentTime);
        System.out.println("Office Time: " +officeTime);
        System.out.println("Meeting Time: " +meetingTime);


        System.out.println("Hour: " +officeTime.getHour());
        System.out.println("Minute: " +officeTime.getMinute());
        System.out.println("Second: " + meetingTime.getSecond());
    }
}
