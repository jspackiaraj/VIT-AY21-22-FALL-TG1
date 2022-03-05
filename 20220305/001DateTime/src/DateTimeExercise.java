import java.util.*;
import java.text.*;
public class DateTimeExercise {
    public static void main(String[] args){
        Date  dNow = new Date();
        Scanner inputObject = new Scanner(System.in);
        int intA;
        SimpleDateFormat dOutputStr = new SimpleDateFormat("E yyyy-MM-dd 'at' hh:mm:ss a zzz\n");
        System.out.print("The current time is " + dOutputStr.format(dNow));
        // A changed Pattern
        SimpleDateFormat dOutputStr2 = new SimpleDateFormat("yyyy:MM:dd 'at' hh:mm:ss a zzz E\n");
        System.out.print("The current time is " + dOutputStr2.format(dNow));
        // A simple elapsed counter
        long dtProcessStartTime = System.currentTimeMillis();
        //
        System.out.println("Enter an Integer number : ");
        intA = inputObject.nextInt();

        long dtProcessEndTime = System.currentTimeMillis();

        System.out.println("Start time of the process is " + dtProcessStartTime);
        System.out.println("End time of the process is " + dtProcessEndTime);
        System.out.println("Time taken to execute the code is " + (dtProcessEndTime - dtProcessStartTime));

    }
}
