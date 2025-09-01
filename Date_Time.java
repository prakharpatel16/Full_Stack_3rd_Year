import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Date_Time {
    public static void main(String[] args) {

        //1

        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo")); 
        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York")); 

        System.out.println("Current time in GMT: "+gmtTime);
        System.out.println("Current time in Tokyo (JST): "+tokyoTime);
        System.out.println("Current time in New York (EST/EDT): "+newYorkTime);

        
        //2

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date (yyyy-MM-dd): ");
        String input = sc.nextLine();

        LocalDate date = LocalDate.parse(input);
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        System.out.println("Original Date: " + date);
        System.out.println("Modified Date: " + modifiedDate);


        //3

        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Format 1: "+currentDate.format(format1));
        System.out.println("Format 2: "+currentDate.format(format2));
        System.out.println("Format 3: "+currentDate.format(format3));


        //4

        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate date1 = LocalDate.parse(sc.nextLine());

        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate date2 = LocalDate.parse(sc.nextLine());

        if(date1.isBefore(date2)){
            System.out.println("First date is before second date.");
        } 
        else if(date1.isAfter(date2)){
            System.out.println("First date is after second date.");
        }
        else{
            System.out.println("Both dates are the same.");
        }
        sc.close();
    }
}