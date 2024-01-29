import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class dateconversion {
    public static void main(String[] args){
        Date newDate = new Date();
        LocalDateTime dt = LocalDateTime.now();

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter date and time in dd/MM/yyyy HH:mm format ");  
        String str= sc.nextLine(); 

        // SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        // String mydate  = df.format(newDate);
        // System.out.println("formatted date is "+mydate);

        // try{
        //     Date parsedDate = df.parse(str);
        //     System.out.println("Date is "+parsedDate);
        // }
        // catch(ParseException e){
        //     e.printStackTrace();
        // }

        // DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        // DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        // String mydate=dt.format(df);
        // System.out.println(mydate); 
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        try{
            LocalDateTime ldt = LocalDateTime.parse(str,df);
            long unixtime = ldt.atZone(ZoneId.of("Asia/Kolkata")).toInstant().toEpochMilli();
            System.out.println("Unix TimeStamp: " + unixtime);


            ZonedDateTime IST = ldt.atZone(ZoneId.of("Asia/Kolkata"));
            ZonedDateTime UTC = IST.withZoneSameInstant(ZoneId.of("UTC"));
            System.out.println("UTC Timestamp: " + UTC.format(df));


            LocalDateTime localDateTimeUTC = UTC.toLocalDateTime();
            System.out.println("Local Timestamp (IST): " + localDateTimeUTC.format(df));

        }catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use the format dd/MM/yyyy HH:mm");
        }
    }
}
