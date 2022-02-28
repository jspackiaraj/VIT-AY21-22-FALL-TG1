public class Factorial {
    public static void main(String[] args){
        int intFactorialToBeFoundFor;
        intFactorialToBeFoundFor = 5;
        int factorial;
        factorial = 1;
        int cntI = 1;
        if(intFactorialToBeFoundFor == 0) {
            factorial = 1;
            System.out.printf("Factorial of %d is %d", intFactorialToBeFoundFor, factorial);
        }else if(intFactorialToBeFoundFor > 0){
            do{
                factorial = factorial * cntI;
                cntI++; // cntI = cntI + 1;
            } while(cntI < intFactorialToBeFoundFor + 1);
            System.out.printf("Factorial of %d is %d", intFactorialToBeFoundFor, factorial);
        } else {
            System.out.println("Factorial is not possible");
        }
    }
}
