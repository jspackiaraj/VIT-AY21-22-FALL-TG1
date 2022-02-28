public class MultiplicationTables {
    //Demonstrate the while loop
    public static void main(String[] args){
        int multiplier;
        int multiplicant;
        int printTableTill;
        multiplier =1;
        multiplicant = 5;
        printTableTill = 10;
        while(multiplier <= printTableTill ) { // While is an entry controlled loop
            System.out.printf("%d x %d = %d\n", multiplier, multiplicant, multiplier * multiplicant);
            multiplier++;  //multiplier = multiplier + 1;
        }
    }
}