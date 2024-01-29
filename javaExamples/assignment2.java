import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date and time dd/MM/yyyy HH:mm: ");
        String str = scanner.nextLine();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Opertions 
        LocalDateTime ldt = LocalDateTime.parse(str, df);
        LocalDateTime plusOneDay = ldt.plusDays(2);
        LocalDateTime minusTenDays = ldt.minusDays(20);
        LocalDateTime plusOneHour = ldt.plusHours(5);
        LocalDateTime minusFiveHoursThirtyMins = ldt.minusHours(10).minusMinutes(20);

        // Saving all the operations in an array list
        List<LocalDateTime> dateList = new ArrayList<>();
        dateList.add(ldt);
        dateList.add(plusOneDay);
        dateList.add(minusTenDays);
        dateList.add(plusOneHour);
        dateList.add(minusFiveHoursThirtyMins);

        Collections.sort(dateList, Comparator.naturalOrder());

        System.out.println("Original Date: " + ldt.format(df));
        System.out.println("After Adding one day: " + plusOneDay.format(df));
        System.out.println("After Subtracting 10 days: " + minusTenDays.format(df));
        System.out.println("After Adding 1 hour: " + plusOneHour.format(df));
        System.out.println("After Subtracting 5 hours and 30 minutes: " + minusFiveHoursThirtyMins.format(df));

        System.out.println("\nSorted Dates:");
        for (LocalDateTime date : dateList) {
            System.out.println(date.format(df));
        }
    }

    
}