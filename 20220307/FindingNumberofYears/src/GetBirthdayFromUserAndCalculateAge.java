
import java.time.*;
import java.text.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class GetBirthdayFromUserAndCalculateAge {
    public static void main(String[] args){
        DateTimeFormatter dtfCurrDate =  DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime LDCurrentDate = LocalDateTime.now();
        // Lines used to check how the variables evolve
        System.out.println(dtfCurrDate.format(LDCurrentDate));
        System.out.println(LDCurrentDate.getDayOfYear());
        // Age ofDate
        //LocalDate LDBirthay_Local = LocalDate.of(2003, 02, 22);
        LocalDate LDToday_Local = LocalDate.of(LDCurrentDate.getYear(), LDCurrentDate.getMonthValue(), LDCurrentDate.getDayOfMonth() );
        //
        // Get the input the date of Birth from a user
        Scanner inputObject = new Scanner(System.in);
        DateTimeFormatter dtfFormatString = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String strBirthdayFromUser;
        System.out.println("Enter the Birthday in the format \"MM-dd-yyyy\": ");
        strBirthdayFromUser = inputObject.next();
        System.out.printf("The entered birthday is %s\n", strBirthdayFromUser);
        LocalDate LDBirthday_Local = LocalDate.parse(strBirthdayFromUser,dtfFormatString);
        long lngTime = ChronoUnit.YEARS.between(LDBirthday_Local, LDToday_Local);
        System.out.printf("Age is : %d years old.\n", lngTime);
        // Method - PeriodTimeBetween
        Period perTimeBetween = Period.between(LDBirthday_Local,LDToday_Local);
        System.out.println("Age is " + perTimeBetween.getYears() + " years, " + perTimeBetween.getMonths() + " months and " + perTimeBetween.getDays()+ " days.");
    }
}
