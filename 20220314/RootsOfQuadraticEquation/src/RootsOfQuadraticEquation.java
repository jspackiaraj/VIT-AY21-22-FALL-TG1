import java.util.Scanner;
public class RootsOfQuadraticEquation {
    // Roots of Quadratic Equations
    // Quadratic equation is a equation of the form
    // ax^2 + bx +c = 0
    // Roots of the equation is given by
    // (-b +/- sqrt(b*b -4*a*c))/(2*a)
    public static void main(String [] args){
        // Declaring variables
        double dblA, dblB, dblC;
        Scanner inputObject = new Scanner(System.in);
        System.out.println("The form of a quadratic equation is ax^2 + bx +c = 0");
        System.out.println("Enter the values of 'a', 'b' and 'c'");
        //
        System.out.print("Enter the value of 'a' : ");
        dblA = inputObject.nextDouble();
        System.out.print("Enter the value of 'b' : ");
        dblB = inputObject.nextDouble();
        System.out.print("Enter the value of 'c' : ");
        dblC = inputObject.nextDouble();
        //
        // Discriminant of the equation is b^2 - 4*a*c
        double dblDiscrmiminant;
        dblDiscrmiminant = (dblB * dblB) - (4 * dblA * dblC);
        //
        // Declare the variable for roots
        double dblRoot1,dblRoot2;
        if (dblDiscrmiminant > 0.){
            // The roots are positive and distinct
            dblRoot1 = (-dblB + Math.sqrt((dblB * dblB) - (4 * dblA * dblC))) / (2*dblA);
            dblRoot2 = (-dblB - Math.sqrt((dblB * dblB) - (4 * dblA * dblC))) / (2*dblA);
            System.out.printf("Root 1 = %.2f and Root 2 = %.2f ", dblRoot1, dblRoot2);
        } else if (dblDiscrmiminant == 0.) {
            // Both roots are equal
            dblRoot1 =  -dblB / (2 * dblA);
            dblRoot2 = dblRoot1;
            System.out.printf("Root 1 = %.2f and Root 2 = %.2f ", dblRoot1, dblRoot2);
        } else {
            // Both the roots are imaginary
            double dblRealPart, dblImaginaryPart;
            dblRealPart = -dblB / (2 * dblA);
            dblImaginaryPart = Math.sqrt((-1 * ((dblB * dblB) - (4 * dblA * dblC)))) / (2 * dblA);
            System.out.printf("Root 1 is %.2f + %.2fi and Root 2 is %.2f - %.2fi", dblRealPart, dblImaginaryPart, dblRealPart, dblImaginaryPart);
        }
    }
}
