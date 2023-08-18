package DevelhopeJavaProgramming;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DateTimeExercise {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        // Calculate days left till the end of the month
        LocalDate endOfMonth = currentDate.withDayOfMonth(currentDate.lengthOfMonth());
        long daysToEndOfMonth = ChronoUnit.DAYS.between(currentDate, endOfMonth);

        // Calculate days left till the end of the year
        LocalDate endOfYear = currentDate.withDayOfYear(currentDate.lengthOfYear());
        long daysToEndOfYear = ChronoUnit.DAYS.between(currentDate, endOfYear);

        System.out.println("Days left till the end of the month: " + daysToEndOfMonth);
        System.out.println("Days left till the end of the year: " + daysToEndOfYear);

    }
}
