
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class AgeToJoinVIT {
    public static void main(String[] args){
        DateTimeFormatter dtfCurrDate =  DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime LDCurrentDate = LocalDateTime.now();
        // Lines used to check how the variables evolve
        System.out.println(dtfCurrDate.format(LDCurrentDate));
        System.out.println(LDCurrentDate.getDayOfMonth());
        // Age ofDate
        LocalDate LDBirthay_Local = LocalDate.of(2003, 02, 22);
        LocalDate LDToday_Local = LocalDate.of(LDCurrentDate.getYear(), LDCurrentDate.getMonthValue(), LDCurrentDate.getDayOfMonth() );
        //
        long lngTime = ChronoUnit.YEARS.between(LDBirthay_Local, LDToday_Local);
        System.out.printf("Age is : %d years old.\n", lngTime);
        // Method - PeriodTimeBetween
        Period perTimeBetween = Period.between(LDBirthay_Local,LDToday_Local);
        System.out.println("Age is " + perTimeBetween.getYears() + " years, " + perTimeBetween.getMonths() + " months and " + perTimeBetween.getDays()+ " days.");
    }
}
