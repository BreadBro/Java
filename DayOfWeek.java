import java.util.*;
import java.text.*;
public class DayOfWeek {
    public static void main(String [] args) throws ParseException {
        GetDates();
    }

    public static String FindDay(int day, int month, int year) throws ParseException {
        //changes date to string
        String input_date = day + "/" + month + "/" + year;
        //formats it
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        Date dt1 = format1.parse(input_date);
        //gets day
        DateFormat format2 = new SimpleDateFormat("EEEE"); 
        //sets day to a string
        String DayOfWeek = format2.format(dt1);
        return DayOfWeek;
    }

    public static void GetDates() throws ParseException{
        //declare variables
        int month, day, year;
        Scanner sc = new Scanner(System.in);
        //ask questions
        System.out.println("This program will find whatever day of the week the date you type was.");
        System.out.println("Please type the numerical value of the month that your date is in.");
        month = sc.nextInt();
        System.out.println("Please type the numerical value of the day that your date is on.");
        day = sc.nextInt();
        System.out.println("Please type the year that your date is on.");
        year = sc.nextInt();
        //to main code
        String dayofweek = FindDay(day, month, year);
        System.out.println(dayofweek);
    }
}
