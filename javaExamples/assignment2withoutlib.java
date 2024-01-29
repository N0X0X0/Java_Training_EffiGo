
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class assignment2withoutlib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date and time dd/MM/yyyy HH:mm: ");
        String str = scanner.nextLine();
        
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        try {
            Date date = df.parse(str);

            date.setTime(date.getTime() + (24 * 60 * 60 * 1000));

            date.setTime(date.getTime() - (10 * 24 * 60 * 60 * 1000));

            date.setTime(date.getTime() + (1 * 60 * 60 * 1000));

            date.setTime(date.getTime() - ((5 * 60 + 30) * 60 * 1000));

            System.out.println("Updated Timestamp: " + df.format(date));

            List<String> objects = new ArrayList<>();
            objects.add("29/01/2024 03:30");
            objects.add("28/01/2024 22:45");
            objects.add("30/01/2024 08:15");

            Collections.sort(objects, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    try {
                        return df.parse(o1).compareTo(df.parse(o2));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    return 0;
                }
            });

            System.out.println("\nSorted Objects:");
            for (String obj : objects) {
                System.out.println(obj);
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
