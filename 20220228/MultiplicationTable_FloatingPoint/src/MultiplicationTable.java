import java.math.BigDecimal;
import java.util.Scanner;
public class MultiplicationTable {
    //Demonstrate the while loop
    public static void main(String[] args){
        Scanner inputObject = new Scanner(System.in);
        float multiplier;
        int multiplicant;
        int printTableTill;
        System.out.print("Enter the times table which you wish to have displayed : ");
        multiplier = inputObject.nextFloat();
        multiplicant = 1;
        System.out.print("Enter the number till which the table is to be printed : ");
        printTableTill = inputObject.nextInt();
        while(multiplier <= printTableTill ) { // While is an entry controlled loop
            System.out.printf("%d x %f = %.4f\n", multiplicant, multiplier,  multiplier * multiplicant);
            multiplier++;  //multiplier = multiplier + 1;
        }
    }
}