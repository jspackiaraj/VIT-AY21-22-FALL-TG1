import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        // Demonstration of the while loop
        // Create an instance of the Scanner class
        Scanner inputObject = new Scanner(System.in);
        // Get the table to be printed from user
            float fltTableToBePrinted;
        System.out.print("Enter the table to be printed (It can be a floating point also): ");
            fltTableToBePrinted = inputObject.nextFloat();
        // Get the number till which the table is to be printed
        System.out.print("Enter the number till which the table has to be printed: ");
            int intTablesTill = inputObject.nextInt();
            int intMultiplier = 1;
        //
        while ( intMultiplier < intTablesTill + 1){
            // This block of code executes when true
            System.out.printf("%d x %.2f = %.3f\n", intMultiplier,  fltTableToBePrinted, intMultiplier * fltTableToBePrinted);
            intMultiplier++;
        }
    }
}